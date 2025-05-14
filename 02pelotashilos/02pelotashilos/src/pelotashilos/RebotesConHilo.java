package pelotashilos;  //definiendo el paquete al que pertenece esta clase

import javax.swing.JFrame; //para crear na ventana

public class RebotesConHilo { 
    public static void main(String[] args) {
        JFrame marco = new MarcoRebote(); //creando una ventana de tipo MarcoRebote
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana se termina el programa
        marco.setVisible(true); //hace visible la ventana
    }

}


/* importar las librerias
 *  definir la clase
 *      en main crear la ventana
 *      añadir la configuracion para terminar si se cierra la ventana
 *      hacer visible
 * import javax.swing.JFrame para crear una  ventana
 * public class ReboteConHilos {
 *  public static void main(){
 *          JFrame ventana =new MarcoRebote() ;
 *          ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 *          ventana.setVisible(true)
 *      }
 * }
 * 
 * 
 */