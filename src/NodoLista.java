/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henry
 */
public class NodoLista {
    
    private InfoDoctor dato;
    private NodoLista next;
    private NodoLista back;

    public InfoDoctor getDato() {
        return dato;
    }

    public void setDato(InfoDoctor dato) {
        this.dato = dato;
    }

    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }

    public NodoLista getBack() {
        return back;
    }

    public void setBack(NodoLista back) {
        this.back = back;
    }

   
 // @Override

   
 @Override
    public String toString() {
        return "" + dato ;
    }
    
    
} 
    

