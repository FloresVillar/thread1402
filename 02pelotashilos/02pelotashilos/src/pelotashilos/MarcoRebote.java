package pelotashilos; //esta clase pertence al paquete pelotashilos

import java.awt.*; //para componentes graficos y layout
import java.awt.event.*; //manejo de eventos como clics
import java.awt.geom.*; //para formas geometricas
import java.util.*; //utilidades generales
import javax.swing.*; //importa swing , conjunto de herramientas graficas de java

class MarcoRebote extends JFrame{ //clase MarcoRebote que extiende hereda de JFrame
    public LaminaPelota lamina; //panel personalizado donde se dibujaran la pelotas
    public static final int ANCHO = 450; 
    public static final int ALTO = 350;
    public static final int PASOS = 1000;
    public static final int RETARDO = 3;

    public MarcoRebote(){ // 
        setSize(ANCHO,ALTO); //establece el tamaño de ventana
        setTitle("Rebotes"); //titulo para la ventana , metodos heredan de JFrame
        lamina = new LaminaPelota(); // creando panel donde se mostraran las pelotas
        add(lamina,BorderLayout.CENTER); //centrando la ventana 
        JPanel laminaBotones = new JPanel(); //crenado panel para botones
        ponerBoton(laminaBotones,"Comenzar", //añade el boton comenzar
            new ActionListener(){ //clase anonima para el manejo del clic, escucha este evento de mouse
                public void actionPerformed(ActionEvent evento){ //
                    crearPelota(); //llamando al metodo que inicia una nueva pelota con
                }
            }
        );//añadiendo el boton "cerrar" con su comportamiento
        ponerBoton(laminaBotones,"Cerrar",
            new ActionListener(){
                public void actionPerformed(ActionEvent evento){
                    System.exit(0); // sale del programa cuando pulsamos "cerrar"
                }
            }
        );
        add(laminaBotones,BorderLayout.SOUTH); //añadiendo los botones en la parte inferior 
    }
    public void ponerBoton(Container c,String titulo, ActionListener oyente){
        JButton boton = new JButton(titulo); //crenado boton con el texto especificado
        c.add(boton); //añadiendo el boton al contenedor ,linea arriba laminaBotones
        boton.addActionListener(oyente); //asocia el manejador de eventos al boton
    }

    public void crearPelota(){  //metodo que inicia una nueva pelota y su animacion
        Pelota b = new Pelota(); //crea una nueva pelota
        lamina.add(b); //añade la pelota al panel 
        Runnable r = new PelotaRunnable(b,lamina); //creara un tarea que movera la pelota
        Thread t = new Thread(r); //crea un hilo con esa tarea
        t.start(); //inicia el hilo, comienza a mover la pelota
        /*System.out.println("todu bem");
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
        }*/
    }

}
/*
 * importar librerias
 * import java.awt.*;
 * import java.awt.event;
 * import javax.swing.*;
 * import java.awt.*;
 * import java.swing.*;
 * import java.awt.event;
 * 
 * definir la clase 
 * class MarcoRebote extends JFrame{
 *      public LaminaRebote lamina;
 *      public static final int ALTO= 450;
 *      public static final int ANCHO=300;
 *      public static final int PASOS=1000;
 *      public static final int RETARDO=3; 
 *      en el constructor
 *          configurar tamaño
 *          crear panel donde mostrar las pelotas,añadir comportamiento llamando a ponerBoton
 *          crear panel para los botones , añadir comportamiento llamando a ponerBoton                                                                                                                                                                                                                     
 *      en ponerBoton(container, nombre, manejador de eventos)
 *              crear botton con nombre 
 *              añadir el boton al container
 *              asociar el manejador de eventos al boton
 *      abb()    
 *      
 * class MarcoRebote{
 *  public LaminaRebote lamina
 *  public static final int LARGO=120,ANCHO=100,RETARDO=3,PASOS=1000;
 *  
 *  MarcoRebote(){
 *  lamina = new LaminaRebote();
 *  setSize(LARGO,ANCHO);    
 *  setTitle("rebotes");
 *  add(lamina,BorderLayout.CENTER);
 *  JPanel laminaBotones = new JPanel();
 *  ponerBoton(laminaBotones,"comenzar", new ActionListener(){
 *                  public void actionPerformed(ActionEvent evento){
 *                          crearPelota();
 *                  }
 *  });
 *  ponerBoton(laminaBotones,"cerrar",new ActionListener(){
 *      public void actionPerformed(ActionEvent evento){
 *                          System.exit(0);
 *      }
 * });
 * add(laminaBotones,BorderLayout.CENTER,SOUTH)
 *   
 * }
 * public void ponerBoton(Container c,String nombre,ActionListener oyente){
 *     JButton boton = new Button();
 *     c.add(boton)
 *     boton.addActionListener(oyente)
 *   } 
 * 
 * public void crearPelota(){
 *          
 *      }
 * }
 * 
 * import java.awt.*;
 * import java.awr.event;
 * import java.swing.*;
 * 
 * public class MarcoRebote{
 *  public static final int LARGO =100;
 *  public static final int ANCHO = 100;
 *  public static final int RETARDO =3;
 *  public static final int PASOS = 1000; //para que son los pasos
 *  MarcoRebote(){
 *      lamina = new LaminaPelotas();
 *      setZise(LARGO,ANCHO);
 *      setTitle("ventana principal");
 *      botones = new JPanel()
 *      agregarBoton(botones,"comenzar",new ActionListener(){public void actionPerformed(ActionEvent evento){ crearPelota();}})
 *      agregarBoton(botones,"cerrar",new ActionListener(){public void actionPerformed(ActionEvent evento){System.exit(0)}})
 *      add(botones,BorderLayout.SOUTH)
 *      
 * }
 *  
 * agregarBoton(container c, "nombre", ActionListener oyente){
 *      JButton boton = new JButton();
 *      c.add(boton)
 *      boton.addActionListener(oyente);
 *  } 
 * 
 * crearPelota(){
 *  Pelota pelota = new Pelota();
 *  qlamina.add(Pelota);
 *  Runnable r = new PelotaRunnable(pelota,lamina);
 *  h = new Thread(r);
 *  h.start();
 * }
 * }
 * import java.swing.*;
 * import java.awt.*;
 * import java.util.*
 * public class LaminaPelota extends JPanel{
 *      Public ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
 *      
 *      public void agregar(Pelota p){
 *          pelotas.add(p);
 *      }
 *      public void paintComponent(Graphics g){
 *          sup.paintComponent(g);
 *          Graphics2D g2 = (Graphics2D) g
 *          for(Pelota p:pelotas){
 *              g2.fill(p.shape())
 *          }        
 *      }
 * }
 */