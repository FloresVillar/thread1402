package pelotashilos;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*; //librerias
class Pelota {
    private static final int TAMX = 15;
    private static final int TAMY = 15; //dimensiones
    //private double x= 0; //coordenadas
    //private double y= 0;
    private double x,y;
    private double dx= 1;
    private double dy= 1; //incrementos 
    Pelota(double xx,double yy){
        x = xx;
        y = yy;
    }
    public void mover (Rectangle2D limites){
        x += dx;
        y += dy;
        if (x < limites.getMinX()){//si x es menor que el borde izquierdo
            x = limites.getMinX(); //
            dx = -dx;       //se entiende que x ya estaba disminuyendo antes
        }
        if(x + TAMX >= limites.getMaxX()){ //la posicion mas el tamaño de la pelota esta fuera del limite
            x = limites.getMaxX() - TAMX;
            dx = -dx;
        }
        if(y < limites.getMinY()){
            y = limites.getMinY();
            dy = -dy;
        }
        if(y + TAMY >= limites.getMaxY()){
            y = limites.getMaxY() - TAMY;
            dy = -dy;
        }
    }
    public Ellipse2D getShape(){
        return new Ellipse2D.Double(x,y,TAMX,TAMY);


    }

}
