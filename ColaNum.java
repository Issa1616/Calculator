/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author issav
 */
public class ColaNum {
	
	class Nodo {
	    char info;
	    Nodo sig;
	}
	
    private Nodo raiz,fondo;
    
    ColaNum () {
        raiz=null;
        fondo=null;
    }
    
    public boolean vacia() {
        if (raiz==null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void insertar(char x) {
    	Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        nuevo.sig=null;
        if (vacia()){
            raiz=nuevo;
            fondo=nuevo;
        }
        else{
            fondo.sig=nuevo;
            fondo=nuevo;
        }
    }
    
    public char extraer (){
        if (raiz!=null)
        {
            char informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
        }
        else
        {
            return Character.MAX_VALUE;
        }
    } 
    
    public int cantidad (){
        Nodo reco=raiz;
        int cant=0;
        while (reco!=null) {
            cant++;
            reco=reco.sig;
        }System.out.println("Cantidad de nodos en la cola: " + cant);
        return cant;
    }
    
    public Nodo obtenerNodoActual(int posicion) {
        Nodo actual = raiz;
        int contador = 0;
        while (actual != null && contador < posicion) {
            actual = actual.sig;
            contador++;
        }
        return actual;
    }
    
    public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la cola numeros.");
        while (reco!=null) {
            System.out.print("("+reco.info+")");
            reco=reco.sig;
        }
        System.out.println();
    }
}