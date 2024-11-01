/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.tdea.edd;

import co.edu.tdea.edd.model.ValueSetCode;

/**
 *
 * @author Britney Niño
 */
public class InformacionGenerica {
    private String code;
    private String description;

    // Constructor que inicializa los atributos
    public InformacionGenerica(String code, String description) {
        this.code = code;
        this.description = description;
    }

    // Getters para code y description
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    private static InformacionGenerica informacionGenerica;
    private static ValueSetCode valueSetCode;

    public static void main(String[] args) {
        // Inicialización de las instancias de InformacionGenerica y ValueSetCode
        informacionGenerica = new InformacionGenerica("001", "Descripción genérica");
        valueSetCode = new ValueSetCode("002", "Descripción del código de valor");

        // Impresión de los valores
        System.out.println("Información Genérica: " + informacionGenerica.getCode() + " - " + informacionGenerica.getDescription());
        System.out.println("Codigo: " + valueSetCode.getCode());
        System.out.println("Descripcion:" + valueSetCode.getDescription());
    }
}