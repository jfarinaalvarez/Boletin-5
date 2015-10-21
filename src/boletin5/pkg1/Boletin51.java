package boletin5.pkg1;

import javax.swing.JOptionPane;

public class Boletin51 {

    public static void main(String[] args) {
        Coche coche1 = new Coche();
        
        String valor=JOptionPane.showInputDialog("¿Acelera?");
        String menos=JOptionPane.showInputDialog("¿Disminuye?");
        coche1.acelerar(Integer.parseInt(valor));
        coche1.frenar(Integer.parseInt (menos));
        
        JOptionPane.showMessageDialog(null,"Velocidad actual:"+coche1.getVelocidade());
    }
    
}
