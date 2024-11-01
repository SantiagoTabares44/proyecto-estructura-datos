package co.edu.tdea.edd;

import co.edu.tdea.edd.model.user.User;
import java.util.Scanner;

//EddApplication: Se reorganizó el uso de switch para mayor claridad y 
//se añadió manejo de línea nueva con sc.nextLine() para evitar problemas de entrada.


public class EddApplication {
    private static Patient patient = new Patient();
    private static HealthContactService contactService = new HealthContactService();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        load();
        menu();
    }

    public static void load() {
        System.out.println("Cargando datos...");
    }

    public static void menu() {
        boolean validacion = true;
        while (validacion) {
            System.out.println("SISTEMA MEDICO BJS");
            System.out.println("\n--- Modulos disponibles ---");
            System.out.println("1. Buscar paciente");
            System.out.println("2. Crear paciente");
            System.out.println("3. Crear contacto de salud");
            System.out.println("4. Proceso de atencion");
            System.out.println("5. Proceso de facturacion");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    buscarPaciente();
                    break;
                case 2:
                    crearPaciente();
                    break;
                case 3:
                    crearContactoDeSalud();
                    break;
                case 4:
                    procesoDeAtencion();
                    break;
                case 5:
                    procesoDeFacturacion();
                    break;
                case 6: 
                    System.out.println("Saliendo...");
                    validacion = false;
                    break;
                
                default: 
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void buscarPaciente() {
        System.out.println("Modulo buscar paciente...");
        System.out.print("Ingrese el documento del paciente: ");
        String document = sc.nextLine();
        User foundPatient = patient.find(document);
        if (foundPatient != null) {
            System.out.println("Se encontro la siguiente informacion para el documento digitado: ");
            System.out.println("Primer nombre: " + foundPatient.getFirstName());
            System.out.println("Segundo nombre: " + foundPatient.getLastName());
        } else {
            System.out.println("No se encuentra información para el documento indicado.");
        }
    }

    private static void crearPaciente() {
        System.out.println("Creando nuevo paciente...");

        System.out.print("Ingrese el primer nombre del paciente: ");
        String firstName = sc.nextLine();

        System.out.print("Ingrese el segundo nombre del paciente: ");
        String lastName = sc.nextLine();

        System.out.print("Ingrese el documento del paciente: ");
        String document = sc.nextLine();

        User newPatient = new User(firstName, lastName, document);
        patient.add(newPatient);

        System.out.println("Paciente creado con exito: " + firstName + " " + lastName);
    }

    private static void crearContactoDeSalud() {
        System.out.println("Creando contacto de salud...");

        System.out.print("Ingrese el documento del paciente: ");
        String document = sc.nextLine();
        User foundPatient = patient.find(document);

        if (foundPatient == null) {
            System.out.println("No se encontro un paciente con ese documento. Primero debe crear el paciente.");
            crearPaciente();
        }

        System.out.print("Ingrese la categoria de triaje (I, II, III, IV, V): ");
        String triageCategory = sc.nextLine().toUpperCase();

        contactService.createContact(foundPatient, triageCategory);

        System.out.println("Contacto de salud creado con exito para el paciente: " + foundPatient.getFirstName()+" "+foundPatient.getLastName());
    }

    private static void procesoDeAtencion() {
        System.out.println("Iniciando proceso de atencion...");
        contactService.attendPatient();
    }

    private static void procesoDeFacturacion() {
        System.out.println("Iniciando proceso de facturacion...");
        contactService.billPatient();
    }
}