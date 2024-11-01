/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.tdea.edd;

import co.edu.tdea.edd.estructure.queue.Queue;
import co.edu.tdea.edd.estructure.stack.Stack;
import co.edu.tdea.edd.model.user.HealthContactUser;
import co.edu.tdea.edd.model.user.User;

/**
 *
 * @author Britney Niño
 */
public class HealthContactService {
    private Queue<HealthContactUser> triageI = new Queue<>();
    private Queue<HealthContactUser> triageII = new Queue<>();
    private Queue<HealthContactUser> triageIII = new Queue<>();
    private Queue<HealthContactUser> triageIV = new Queue<>();
    private Queue<HealthContactUser> triageV = new Queue<>();
    private Stack<HealthContactUser> facturacion = new Stack<>();

    public void createContact(User patient, String triageCategory) {
        HealthContactUser contact = new HealthContactUser(patient, triageCategory);

        if ("I".equals(triageCategory)) {
            triageI.enqueue(contact);
        } else if ("II".equals(triageCategory)) {   
            triageII.enqueue(contact);
        } else if ("III".equals(triageCategory)) {
            triageIII.enqueue(contact);
        } else if ("IV".equals(triageCategory)) {
            triageIV.enqueue(contact); 
        } else if ("V".equals(triageCategory)) {
            triageV.enqueue(contact); 
        } else {
            System.out.println("Categoría de triaje no válida.");
        }
    }

    public void attendPatient() {
        HealthContactUser contact;

        if (!triageI.isEmpty()) {
            contact = triageI.dequeue();
        } else if (!triageII.isEmpty()) {
            contact = triageII.dequeue();
        } else if (!triageIII.isEmpty()) {
            contact = triageIII.dequeue();
        } else if (!triageIV.isEmpty()) {
            contact = triageIV.dequeue();
        } else if (!triageV.isEmpty()) {
            contact = triageV.dequeue();
        } else {
            System.out.println("No se encontraron pacientes pendientes por atender.");
            return;
        }

        facturacion.push(contact);
        System.out.println("Paciente remitido a facturación: " + contact.getPatient().getFirstName());
    }

    public void billPatient() {
        if (!facturacion.isEmpty()) {
            HealthContactUser contact = facturacion.pop();
            System.out.println("Se completa la facturacion para el usuario: " + contact.getPatient().getFirstName());
        } else {
            System.out.println("No se encontraron facturas pendientes por procesar.");
        }
    }
}
