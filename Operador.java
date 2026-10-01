/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import javax.swing.JFrame;

/**
 *
 * @author issav
 */
public class Operador {
    
    private Nodo raiz;
    
    class Nodo{
        char info;
        Nodo sig;
    }
    
    public Operador(){
        Visual visual1;
        visual1= new Visual();
    }
    
 
    public static void main(String[] args) {
        Visual V=new Visual();
        V.setBounds(0,0,290,440);
        V.setVisible(true);
        V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    } 
}