package co.edu.tdea.edd;

import co.edu.tdea.edd.GenericInfo;
import co.edu.tdea.edd.HealthContact;
import co.edu.tdea.edd.Patient;
import java.util.Scanner;

public class EddApplication {
    private static Patient patientService = new Patient();
    private static HealthContact healthContactService = new HealthContact();
    private static GenericInfo genericInfoService = new GenericInfo();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        load();
        menu();
    }

    public static void load() {
        System.out.println("Cargando datos...");
        // Cargar datos adicionales aquí si es necesario.
    }

    public static void menu() {
        while (true) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Buscar paciente");
            System.out.println("2. Crear paciente");
            System.out.println("3. Crear contacto de salud");
            System.out.println("4. Proceso de atención");
            System.out.println("5. Proceso de facturación");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();  // Consume el salto de línea

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
                System.out.println("Opción no válida.");
            }
        }
    }

    private static void buscarPaciente() {
        System.out.print("Ingrese el documento del paciente: ");
        String documento = sc.nextLine();
        // buscar al paciente usando patientService.
    }

    private static void crearPaciente() {
        System.out.println("Creando nuevo paciente...");
        // crear un paciente usando patientService.
    }

    private static void crearContactoDeSalud() {
        System.out.println("Creando contacto de salud...");
        // crear contacto de salud usando healthContactService.
    }

    private static void procesoDeAtencion() {
        System.out.println("Iniciando proceso de atención...");
        // proceso de atención.
    }

    private static void procesoDeFacturacion() {
        System.out.println("Iniciando proceso de facturación...");
        // proceso de facturación.
    }
}

