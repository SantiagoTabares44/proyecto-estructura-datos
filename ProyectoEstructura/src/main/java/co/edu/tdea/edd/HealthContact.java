/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.tdea.edd;

import co.edu.tdea.edd.estructure.queue.Queue;
import co.edu.tdea.edd.estructure.stack.Stack;
import co.edu.tdea.edd.model.user.HealthContactUser;
import co.edu.tdea.edd.HealthContact;
import co.edu.tdea.edd.model.user.User;

/**
 *
 * @author Britney Niño
 */
public class HealthContact {
    private Queue<HealthContact> triageI = new Queue<>();
    private Queue<HealthContact> triageII = new Queue<>();
    private Queue<HealthContact> triageIII = new Queue<>();
    private Queue<HealthContact> triageIV = new Queue<>();
    private Queue<HealthContact> triageV = new Queue<>();
    private Stack<HealthContact> facturacion = new Stack<>();

    public void createContact(User patient, String triageCategory) {
        HealthContactUser contact = new HealthContactUser(patient, triageCategory);

        if (triageCategory.equals("I")) {
            triageI.Addqueue(contact);
        } else if (triageCategory.equals("II")) {   
            triageII.Addqueue(contact);
        } else if (triageCategory.equals("III")) {
            triageIII.Addqueue(contact);
        }   else if (triageCategory.equals("IV")) {
            triageIV.Addqueue(contact); 
        }else if(triageCategory.equals("V")){
            triageV.Addqueue(contact); 
        } else {
            
            System.out.println("Categoría de triaje no válida.");
        }
    }

    public void attendPatient() {
        HealthContact contact;

        if (!triageI.isEmpty()) {
            contact = triageI.deletequeue();
        } else if (!triageII.isEmpty()) {
            contact = triageII.deletequeue();
        } else if (!triageIII.isEmpty()) {
            contact = triageIII.deletequeue();
        } else {
            System.out.println("0 pacientes en espera.");
            return;
        }

        facturacion.push(contact);
        System.out.println("Paciente remitido a facturación: " + contact.getPatient().getFirstName());
    }

    public void billPatient() {
        if (!facturacion.isEmpty()) {
            HealthContact contact = facturacion.pop();
            System.out.println("Facturación completada: " + contact.getPatient().getFirstName());
        } else {
            System.out.println("No hay facturas pendiente.");
        }
    }

    private Object getPatient() {
        throw new UnsupportedOperationException("no es compatible."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
