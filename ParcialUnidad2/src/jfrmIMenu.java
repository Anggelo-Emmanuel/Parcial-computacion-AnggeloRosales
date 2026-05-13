
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rosales
 */
public class jfrmIMenu {
  public static void main(String[] args) {

        String clave;

        clave = JOptionPane.showInputDialog("Ingrese la contraseña");

        if (clave.equals("123")) {

            JOptionPane.showMessageDialog(null, "Bienvenido Anggelo");

            jfrmConversor ventana = new jfrmConversor();
            ventana.setVisible(true);

        } 
        
        else 
        
        {

            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");

            System.exit(0);
        }
    }
}

