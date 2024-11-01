package co.edu.tdea.edd;

import co.edu.tdea.edd.InformacionGenerica;
import co.edu.tdea.edd.HealthContactService;
import co.edu.tdea.edd.Patient;
import co.edu.tdea.edd.model.user.User;
import java.util.Scanner;

public class EddApplication {
    private static Patient patients = new Patient();
    private static HealthContactService Contact = new HealthContactService();
    private static InformacionGenerica InformacionGenerica = new InformacionGenerica("001", "Descripci\u00f3n gen\u00e9rica");
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        load();
        menu();
    }

    public static void load() {
        System.out.println("Cargando datos...");
    }

    public static void menu() {
        while (true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Buscar paciente");
            System.out.println("2. Crear paciente");
            System.out.println("3. Crear contacto de salud");
            System.out.println("4. Proceso de atencion");
            System.out.println("5. Proceso de facturacion");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = sc.nextInt();
            sc.nextLine();  

            if (opcion == 1) {
                buscarPaciente();
            } else if (opcion == 2) {
                crearPaciente();
            } else if (opcion == 3) {
                crearContactoDeSalud();
            } else if (opcion == 4) {
                procesoDeAtencion();
            } else if (opcion == 5) {
                procesoDeFacturacion();
            } else if (opcion == 6) {
                System.out.println("Saliendo...");
                System.exit(0);
            } else {
                System.out.println("Opción no valida.");
            }
        }
    }

    private static void buscarPaciente() {
        System.out.println("Modulo buscar paciente...");
        System.out.print("Ingrese el documento del paciente: ");
        String document = sc.nextLine();
        User patient = patients.find(document);
        if (patient != null) {
            System.out.println("Se encontro la siguiente informacion para el documento digitado. ");
            System.out.println("Primer nombre: "+patient.getFirstName());
            System.out.println("Segundo nombre: "+patient.getLastName());
        } else {
            System.out.println("No se encuentra informacion para el documento indicado.");
        }
    }

    private static void crearPaciente() {
        System.out.println("Creando nuevo paciente...");
        // crear un paciente.
    }

    private static void crearContactoDeSalud() {
        System.out.println("Creando contacto de salud...");
        // crear contacto de salud.
    }

    private static void procesoDeAtencion() {
        System.out.println("Iniciando proceso de atencion...");
        // proceso de atención.
    }

    private static void procesoDeFacturacion() {
        System.out.println("Iniciando proceso de facturacion...");
        // proceso de facturación.
    }
}