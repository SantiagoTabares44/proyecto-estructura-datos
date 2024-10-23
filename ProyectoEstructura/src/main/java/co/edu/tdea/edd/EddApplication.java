package co.edu.tdea.edd;

import java.util.Scanner;


public class EddApplication {

    public static void main( String[] args ) {
       load();
        menu();
    }

    public static void load(){
        System.out.println("Cargando");
    }

    public static void menu(){
        Scanner datos = new Scanner(System.in);
        System.out.println("Bienvenido al sistema medico. Por favor escoge tu accion!.");
        System.out.println("--- Modulos ---");
        System.out.println("1.Buscar paciente");
        System.out.println("2.Crear paciente");
        System.out.println("3.Crear contacto de salud");
        System.out.println("4.Proceso de atencion");
        System.out.println("5.Proceso de facturacion");

    }
}
