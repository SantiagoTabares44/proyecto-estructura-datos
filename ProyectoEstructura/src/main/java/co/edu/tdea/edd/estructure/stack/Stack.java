/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.tdea.edd.estructure.stack;
//“último en entrar, primero en salir” (LIFO).


public class Stack<T> {
    private Node<T> NodeTop;
    
    //--Metodo generico para insertar en la pila
     public void push(T newValue) {
        Node<T> newNode = new Node<>(newValue);
        if (NodeTop == null) {  
            NodeTop = newNode;
        } else {
            newNode.setNext(NodeTop); 
            NodeTop = newNode;  
        }
        System.out.println("Paciente " + NodeTop + " añadido a la pila.");
    }
     
     //--Metodo generico para eliminar en la pila--
     public T pop() {
        if (NodeTop == null) {  
            System.out.println("No existen pacientes en la pila.");
            return null;  
        } else {
            T NodePopValue = NodeTop.getValue();  
            NodeTop = NodeTop.getNext();  
            System.out.println("El paciente " + NodePopValue + " ha sido retirado.");
            return NodePopValue;
        }
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
