/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.tdea.edd;

import co.edu.tdea.edd.estructure.linkedList.singly.SimpleLinkedList;
import co.edu.tdea.edd.model.user.User;

/**
 *
 * @author Britney Niño
 */
public class Patient {
     private SimpleLinkedList<User> pacientes = new SimpleLinkedList<>();

    public void add(User patient) {
        pacientes.add(patient);
    }

    public User find(String document) {
        return pacientes.search(new User());
    }

    public void print(){
        pacientes.print();
    }

    public void uploadUser(User paciente) {
        User existingUser = find(paciente.getDocument());
        if (existingUser != null) {
            pacientes.remove(existingUser);
            pacientes.add(paciente);
        }
    }
}

