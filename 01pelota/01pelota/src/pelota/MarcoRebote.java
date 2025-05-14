package pelota;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

class MarcoRebote extends JFrame{
    public LaminaPelota lamina;
    public static final int ANCHURA_PREDETERMINADA = 450;
    public static final int ALTURA_PREDETERMINADA = 350;
    public static final int PASOS = 1000;
    public static final int RETARDO = 3;

    public MarcoRebote(){
        setSize(ANCHURA_PREDETERMINADA,ALTURA_PREDETERMINADA);
        setTitle("Rebotes");
        lamina = new LaminaPelota();
        add(lamina,BorderLayout.CENTER);
        JPanel laminaBotones = new JPanel();
        ponerBoton(laminaBotones,"Comenzar",
            new ActionListener(){
                public void actionPerformed(ActionEvent evento){
                    abb();
                }
            }
        );
        ponerBoton(laminaBotones,"Cerrar",
            new ActionListener(){
                public void actionPerformed(ActionEvent evento){
                    System.exit(0);
                }
            }
        );
        add(laminaBotones,BorderLayout.SOUTH);
    }
    public void ponerBoton(Container c,String titulo, ActionListener oyente){
        JButton boton = new JButton(titulo);
        c.add(boton);
        boton.addActionListener(oyente);
    }

    public void abb(){
        System.out.println("todu bem");
        try{
            Pelota pelota = new Pelota();
            if (pelota==null)System.out.println("Es Nullo---------+");
            lamina.add(pelota);
            for(int i = 1;i <= PASOS ; i++){
                pelota.mover(lamina.getBounds());
                lamina.paint(lamina.getGraphics());
                Thread.sleep(RETARDO);
            }
        }catch(InterruptedException e){
            System.out.println("xzw :"+e.toString());
        }
    }
}
