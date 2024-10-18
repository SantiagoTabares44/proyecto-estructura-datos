/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.tdea.edd.estructure.queue;

/**
 *
 * @author Britney Niño
 */
public class Node<T> {
   private T value;        // Valor que contiene el nodo
   private Node<T> next;   // Referencia al siguiente nodo en la cola
    
    public Node(T newValue) {
        this.value = newValue;
        this.next = null;  // El siguiente nodo es null al crear un nuevo nodo
    }

    // Métodos getter y setter
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
