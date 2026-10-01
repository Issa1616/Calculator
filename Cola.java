/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author issav
 */
public class Cola {
	
	class Nodo {
	    String info;
	    Nodo sig;
	}
	
    private Nodo raiz,fondo;
    
    Cola () {
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
    
    public void insertar(String x) {
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
    
    public String extraer (){
        if (!vacia()){
            String informacion=raiz.info;
            if(raiz==fondo){
                raiz=null;
                fondo=null;
            }else{
                raiz=raiz.sig;
            }return informacion;
        }else return null;
    }  
    
    public int cantidad (){
        Nodo reco=raiz;
        int cant=0;
        while (reco!=null) {
            cant++;
            reco=reco.sig;
        }//System.out.println("Cantidad de nodos en la cola: " + cant);
        return cant;
    }
    
    public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco!=null) {
            System.out.print("("+reco.info+")");
            reco=reco.sig;
        }
        System.out.println();
    }
}
