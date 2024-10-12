package co.edu.tdea.edd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EddApplication {

    public static void main( String[] args ) {
       load();
        menu();
    }

    public static void load(){
        System.out.println("Cargando");
    }

    public static void menu(){
        System.out.println("Atender Paciente:");

    }
}
