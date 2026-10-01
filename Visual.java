/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;

/**
 *
 * @author issav
 */
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class Visual extends JFrame implements ActionListener{
    
    Cola cola=new Cola();
    private int sig;
    private final JTextField mirador;
    private final JButton cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,entre,por,menos,mas,igual,borrar,punto;
   

    public Visual() {
        
        setLayout(null);
        setIconImage(null);
        setTitle("Calculadora");
        getContentPane().setBackground(new Color(255, 150, 180));
        mirador=new JTextField();
        mirador.setBounds(20,20,230,50);
        add(mirador);
        
        borrar=new JButton("C");
        borrar.setBounds(20,80,170,50);
        borrar.setBackground(new Color(255, 192, 203));
        add(borrar);
        borrar.addActionListener(this);
        entre=new JButton("/");
        entre.setBounds(200,80,50,50);
        entre.setBackground(new Color(255, 192, 203));
        add(entre); 
        entre.addActionListener(this);
               
        siete=new JButton("7");
        siete.setBounds(20,140,50,50);
        add(siete);
        siete.setBackground(new Color(255, 192, 203));
        siete.addActionListener(this);
        ocho=new JButton("8");
        ocho.setBounds(80,140,50,50);
        ocho.setBackground(new Color(255, 192, 203));
        add(ocho);
        ocho.addActionListener(this);
        nueve=new JButton("9");
        nueve.setBounds(140,140,50,50);
        nueve.setBackground(new Color(255, 192, 203));
        add(nueve);
        nueve.addActionListener(this);
        por=new JButton("*");
        por.setBounds(200,140,50,50);
        por.setBackground(new Color(255, 192, 203));
        add(por);
        por.addActionListener(this);
        
        cuatro=new JButton("4");
        cuatro.setBounds(20,200,50,50);
        cuatro.setBackground(new Color(255, 192, 203));
        add(cuatro);
        cuatro.addActionListener(this);
        cinco=new JButton("5");
        cinco.setBounds(80,200,50,50);
        cinco.setBackground(new Color(255, 192, 203));
        add(cinco);
        cinco.addActionListener(this);
        seis=new JButton("6");
        seis.setBounds(140,200,50,50);
        seis.setBackground(new Color(255, 192, 203));
        add(seis);
        seis.addActionListener(this);
        menos=new JButton("-");
        menos.setBounds(200,200,50,50);
        menos.setBackground(new Color(255, 192, 203));
        add(menos);
        menos.addActionListener(this);
                
        uno=new JButton("1");
        uno.setBounds(20,260,50,50);
        uno.setBackground(new Color(255, 192, 203));
        add(uno);
        uno.addActionListener(this);
        dos=new JButton("2");
        dos.setBounds(80,260,50,50);
        dos.setBackground(new Color(255, 192, 203));
        add(dos);
        dos.addActionListener(this);
        tres=new JButton("3");
        tres.setBounds(140,260,50,50);
        tres.setBackground(new Color(255, 192, 203));
        add(tres);
        tres.addActionListener(this);
        mas=new JButton("+");
        mas.setBounds(200,260,50,50);
        mas.setBackground(new Color(255, 192, 203));
        add(mas);
        mas.addActionListener(this);
        
        cero=new JButton("0");
        cero.setBounds(20,320,110,50);
        cero.setBackground(new Color(255, 192, 203));
        add(cero);
        cero.addActionListener(this);
        punto=new JButton(".");
        punto.setBounds(140,320,50,50);
        punto.setBackground(new Color(255, 192, 203));
        add(punto);
        punto.addActionListener(this);
        igual=new JButton("=");
        igual.setBounds(200,320,50,50);
        igual.setBackground(new Color(255, 192, 203));
        add(igual);
        igual.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String conteMirador=mirador.getText();
        if (e.getSource()==cero) {
            mirador.setText(conteMirador+"0");
        }if (e.getSource()==uno) {
            mirador.setText(conteMirador+"1");
        }if (e.getSource()==dos) {
            mirador.setText(conteMirador+"2");
        }if (e.getSource()==tres) {
            mirador.setText(conteMirador+"3");
        }if (e.getSource()==cuatro) {
            mirador.setText(conteMirador+"4");
        }if (e.getSource()==cinco) {
            mirador.setText(conteMirador+"5");
        }if (e.getSource()==seis) {
            mirador.setText(conteMirador+"6");
        }if (e.getSource()==siete) {
            mirador.setText(conteMirador+"7");
        }if (e.getSource()==ocho) {
            mirador.setText(conteMirador+"8");
        }if (e.getSource()==nueve) {
            mirador.setText(conteMirador+"9");
        }if (e.getSource()==punto) {
            mirador.setText(conteMirador+".");
            
        }if (e.getSource()==entre) {
            mirador.setText(conteMirador+" / ");
            
        }if (e.getSource()==por) {
            mirador.setText(conteMirador+" * ");
            
        }if (e.getSource()==menos) {
            mirador.setText(conteMirador+" - ");
            
        }if (e.getSource()==mas) {
            mirador.setText(conteMirador+" + ");
            
        }if (e.getSource()==borrar) {
            mirador.setText("");  
            
        }if (e.getSource()==igual) {
            Cola();
            operaciones();
        }
    } 
    
    
    public void Cola() { 
        String cadena = mirador.getText();
        String num="";
        boolean esNum=false;
            for (int f = 0; f < cadena.length(); f++) {
                char conten=cadena.charAt(f);
                if (cadena.charAt(f) == '.' || cadena.charAt(f) == '0' || cadena.charAt(f) == '1' || cadena.charAt(f) == '2' || cadena.charAt(f) == '3' || cadena.charAt(f) == '4' || cadena.charAt(f) == '5' || cadena.charAt(f) == '6' || cadena.charAt(f) == '7' || cadena.charAt(f) == '8' || cadena.charAt(f) == '9'){
                    num+=conten;
                    esNum=true;
                }else {
                    if(esNum){
                        cola.insertar(num);
                        num = "";
                    } esNum=false;
                    if(conten== '/' || conten== '*' || conten== '-' || conten== '+'){
                    cola.insertar(String.valueOf(conten));
                    }
                }
            }if (esNum) {
            cola.insertar(num);
        }
    }
    
    public void operaciones() {
        Double resul = 0.0;
        Double op = 0.0;
        boolean primerNumero = true;

            while (!cola.vacia()) {
            String elemento = cola.extraer();

                if (elemento == null) {
                    break;
                }System.out.println(elemento);

            try{
                Double numero=Double.valueOf(elemento);
                if (primerNumero) {
                    resul = numero;
                    primerNumero = false;
                } else {
                    op = numero;
                }
            } catch (NumberFormatException e) {
                switch (elemento) {
                    case "+":
                        resul+=op;
                        op=0.0;
                        break;
                    case "-":
                        resul-=Double.parseDouble(cola.extraer());
                        break;
                    case "*":
                        Double mul=Double.valueOf(cola.extraer());
                        if(mul==0){
                            resul=0.0;
                        }else {
                            resul*=mul;
                        }break;
                    case "/":
                        Double dividendo=Double.valueOf(cola.extraer());
                        if(dividendo==0){
                            mirador.setText("ERROR");
                            return;
                        }else{
                            resul/=dividendo;
                        }break;
                    }
                }
            }resul += op;
            mirador.setText(String.valueOf(resul));
        }


    
    public static void main(String[] args) {
        Visual V = new Visual();
        V.setBounds(0, 0, 290, 440);
        V.setResizable(false);
        V.setVisible(true);
        V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}