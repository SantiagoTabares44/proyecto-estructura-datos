/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.tdea.edd;

import co.edu.tdea.edd.estructure.linkedList.singly.SimpleLinkedList;
import co.edu.tdea.edd.model.user.User;

/**
Patient: Se mejoró el método find para comparar documentos y 
* evitar problemas al buscar en la lista enlazada.
 */

public class Patient {
    private SimpleLinkedList<User> pacientes = new SimpleLinkedList<>();

    public void add(User patient) {
        pacientes.add(patient);
    }

    public User find(String document) {
        User dummyUser = new User("", "", document); // Crear un usuario temporal solo con el documento
        return pacientes.search(dummyUser);
    }

    public void print() {
        pacientes.print();
    }

    public void updateUser(User paciente) {
        User existingUser = find(paciente.getDocument());
        if (existingUser != null) {
            pacientes.remove(existingUser);
            pacientes.add(paciente);
        }
    }
}
