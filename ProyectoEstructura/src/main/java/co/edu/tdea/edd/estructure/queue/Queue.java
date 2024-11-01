/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.tdea.edd.estructure.queue;

import co.edu.tdea.edd.model.user.HealthContactUser;

/**
 *
 * @author Britney Niño
 */
public class Queue<T> {
    private Node<T> front;  // Primer nodo (el que se elimina)
    private Node<T> rear;   // Último nodo (donde se añaden nuevos)

    //--Constructor de la cola
    public Queue() {
        this.front = null;
        this.rear = null;
    }

    //--Método para añadir elementos a la cola (enqueue)
    public void Addqueue(T newValue) {
        Node<T> newNode = new Node<>(newValue);
        if (rear == null) {  // Si la cola está vacía
            front = rear = newNode;
        } else {
            rear.setNext(newNode);  // Añadir el nuevo nodo al final
            rear = newNode;  // Actualizar el puntero rear
        }
        System.out.println("Paciente " + newNode.getValue() + " añadido a la cola.");
    }

    //--Método para eliminar elementos de la cola (dequeue)
    public T deletequeue() {
        if (front == null) {  // Si la cola está vacía
            System.out.println("No existen pacientes en la cola.");
            return null;
        } else {
            T frontValue = front.getValue();  // Obtener el valor del primer nodo
            front = front.getNext();  // Mover el puntero al siguiente nodo
            if (front == null) {  // Si la cola queda vacía
                rear = null;
            }
            System.out.println("El paciente " + frontValue + " ha sido retirado.");
            return frontValue;
        }
    }

    //--Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(HealthContactUser contact) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public HealthContactUser dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
