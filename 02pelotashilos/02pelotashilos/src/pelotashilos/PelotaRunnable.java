package pelotashilos; 
import java.awt.*; //necesarias para la interfaz grafica

public class PelotaRunnable implements Runnable{ //interfaz runnable que puede ejecutarse en un hilo

    private Pelota pelota; 
    private Component componente; //donde se va a 'mover' la pelota
    public static final int PASOS =2000; //cantidad de veces que se movera
    public static final int RETARDO =5; //retardo en milisegundos


    public PelotaRunnable(Pelota unaPelota, Component unComponente){ 
        pelota = unaPelota;
        componente = unComponente; 
    }

    public void run(){
        try{ //dentro de try se repite pasos veces
            for(int i=1; i<=PASOS; i++){
                pelota.mover(componente.getBounds()); //mueve la pelota dentro de los limites del componente
                componente.repaint(); // solicita redibujar el componente para ver la nueva posicion
                Thread.sleep(RETARDO); //pausa un poco para dar efecto de animacion
            }

        }catch(InterruptedException e){ //el hilo interrupido simplemente termina

        }

    }
}
/*
 * import java.awt.*;
 * 
 * public class PelotaRunnable implements Runnable{
 *      public static final int PASOS = 1000;
 *      public static final int RETARDO = 3;
 *      public Pelota pelota;
 *      public Component componente;
 *      
 *      PelotaRunnable(Pelota pelot, Component component){
 *          pelota = pelot;
 *          componente = component;
 *      }
 *      public void run(){
 *          try{
 *              for(int i=0;i<PASOS;i++){
 *                  pelota.mover(componente.getBounds());
 *                  componente.repaint();
 *                  Thread.sleep(RETARDO);
 *              }
 *          }catch(InterruptedException e)
 *      }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */