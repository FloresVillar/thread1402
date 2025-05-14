package pelotashilos;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

class LaminaPelota extends JPanel{
    public ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
    public void agregarPelota(Pelota b){
        pelotas.add(b);
    }
    @Override //sobreescribiendo el metodo 
    public void paintComponent(Graphics g){ //se llama automaticamente cuando necesita redibujar en el panel, aqui es donde se dibjuran las pelotas  
        super.paintComponent(g); //para limpiar el area antes de redibujar
        Graphics2D g2 = (Graphics2D)g; //convirtiendo el objeto Graphics a Graphics2D
        for (Pelota b : pelotas){ //recorre toda la lista y dibuja su forma (shape) en el panel usand fill
            g2.fill(b.getShape());//fill las pinta solidas
        }
    }

}


/*
 * import java.awt.*;
 * import java.awt.event;
 * import java.swing.*;
 * import java.utils.*;
 * 
 * public class LaminaPelota{
 *      public ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
 *      public void agregar(Pelota p){
 *          pelotas.add(p)
 *      }
 *      @override
 *      public void paintComponent(Graphics g){
 *          Graphics2D g2 = (Graphics2D)g;
 *          for(Pelot pelota:pelotas){
 *              g2.fill(pelota.shape())
 *          }    
 *      }     
 * }
 * 
 * 
 */