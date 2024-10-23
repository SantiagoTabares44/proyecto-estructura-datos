/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.tdea.edd.estructure.linkedList.doubly;

import static java.util.Objects.*;

/**
 *
 * @author Britney Niño
 * @param <T>
 */
public class DoublyLinkedList<T> {
    private DoubleNode<T> root;

    //-- Método genérico añadir --
    public void add(T newValue) {
        if (isNull(root)) {
            root = new DoubleNode(newValue);
        } else {
            DoubleNode<T> temp = root;
            DoubleNode<T> newNode = new DoubleNode(newValue);
            while (temp.getNext() != null) {
                temp = (DoubleNode<T>) temp.getNext();
            }
            temp.setNext(newNode);
            newNode.setPrevious(temp); // Asignar el anterior
        }
    }

    //-- Método genérico eliminar --
    public void remove(T valueToRemove) {
        if (isNull(root)) {
            System.out.println("La lista está vacía.");
        } else if (root.getValue().equals(valueToRemove)) {
            if (nonNull(root.getNext())) {
                root = root.getNext();
                root.setPrevious(null);
            } else {
                root = null;
            }
        } else {
            DoubleNode<T> current = root;
            while (current != null && !current.getValue().equals(valueToRemove)) {
                current = current.getNext();
            }
            if (isNull(current)) {
                System.out.println("El elemento no se encuentra en la lista.");
            } else {
                DoubleNode<T> previousNode = current.getPrevious();
                DoubleNode<T> nextNode = current.getNext();

                if (nonNull(previousNode)) {
                    previousNode.setNext(nextNode);
                }
                if (nonNull(nextNode)) {
                    nextNode.setPrevious(previousNode);
                }
            }
        }
    }

    //-- Método genérico imprimir hacia adelante --
    public void printForward() {
        if (isNull(root)) {
            System.out.println("La lista está vacía.");
        } else {
            DoubleNode<T> temp = root;
            while (temp != null) {
                System.out.println(temp.getValue());
                temp = temp.getNext();
            }
        }
    }

    //-- Método genérico imprimir hacia atrás --
    public void printBackward() {
        if (isNull(root)) {
            System.out.println("La lista está vacía.");
        } else {
            DoubleNode<T> temp = root;
            // Moverse al final de la lista
            while (nonNull(temp.getNext())) {
                temp = temp.getNext();
            }
            // Imprimir desde el final hacia atrás
            while (temp != null) {
                System.out.println(temp.getValue());
                temp = temp.getPrevious();
            }
        }
    }

    //-- Método genérico buscar --
    public T search(T valueToSearch) {
        DoubleNode<T> current = root;
        while (current != null) {
            if (current.getValue().equals(valueToSearch)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }
}
