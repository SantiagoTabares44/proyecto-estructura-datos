/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.tdea.edd;

import co.edu.tdea.edd.estructure.queue.Queue;
import co.edu.tdea.edd.estructure.stack.Stack;
import co.edu.tdea.edd.model.user.HealthContactUser;
import co.edu.tdea.edd.model.user.User;

/*
HealthContactService: Se cambió el uso de if-else por switch para un manejo más limpio 
de las categorías de triaje.
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

        //Se utilizan colas para agregar los pacientes
        switch (triageCategory) {
            case "I":
                triageI.Addqueue(contact);
                break;
            case "II":
                triageII.Addqueue(contact);
                break;
            case "III":
                triageIII.Addqueue(contact);
                break;
            case "IV":
                triageIV.Addqueue(contact);
                break;
            case "V":
                triageV.Addqueue(contact);
                break;
            default:
                System.out.println("Categoría de triaje no válida.");
        }
    }

    public void attendPatient() {
        HealthContactUser contact;

        if (!triageI.isEmpty()) {
            contact = triageI.deletequeue();
        } else if (!triageII.isEmpty()) {
            contact = triageII.deletequeue();
        } else if (!triageIII.isEmpty()) {
            contact = triageIII.deletequeue();
        } else if (!triageIV.isEmpty()) {
            contact = triageIV.deletequeue();
        } else if (!triageV.isEmpty()) {
            contact = triageV.deletequeue();
        } else {
            System.out.println("No se encontraron pacientes pendientes por atender.");
            return;
        }

        //Se utilizan pilas para agregar la facturacion
        facturacion.push(contact);
        System.out.println("Paciente remitido a facturacion: " + contact.getPatient().getFirstName());
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
