package pelota;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

class LaminaPelota extends JPanel{
    public ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
    public void add(Pelota b){
        pelotas.add(b);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        for (Pelota b : pelotas){
            g2.fill(b.getShape());
        }
    }
    
}