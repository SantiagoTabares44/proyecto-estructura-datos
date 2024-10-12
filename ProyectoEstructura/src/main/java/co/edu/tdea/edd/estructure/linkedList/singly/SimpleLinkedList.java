/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.tdea.edd.estructure.linkedList.singly;
import static java.util.Objects.*;


public class SimpleLinkedList<T> {
    private Node<T> root;
    //--Metodo generico añadir--
    
    public void add(T newValue) {
        if (isNull(root)) {
            root = new Node(newValue);
        } else if (isNull(root.getNext())) {
            Node newNode = new Node(newValue);
            root.setNext(newNode);
        } else {
            Node temp = root;
            Node newNode = new Node(newValue);
            while (temp.getNext()!= null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }
    //--Metodo generico eliminar--
    public void remove(T newValue) {
        if (isNull(root)) {
            System.out.println("La lista está vacía.");
        } else if (root.getValue().equals(newValue)) {
            root = root.getNext();
        } else {
            Node actual = root;
            while (actual.getNext()!= null && !actual.getNext().getValue().equals(newValue)) {
                actual = actual.getNext();
            }
            if (actual.getNext()== null) {
                System.out.println("El elemento no se encuentra en la lista.");
            } else {
                actual.setNext(actual.getNext().getNext());
            }
        }
    }
    
    public void print() {
        if (nonNull(root)) {
            Node temp = root;
            while (temp != null) {
                System.out.println(temp.getValue());
                temp = temp.getNext();
            }
        } else {
            System.out.println("La lista está vacía.");
        }
    }
    
}
