package game;

import javax.swing.JOptionPane;

public class UserInterface {
    public static void printMessage(String msg) {
        JOptionPane.showMessageDialog( null, msg);
    }

    public static int askForInt(String msg) {
        String pin;
        pin = JOptionPane.showInputDialog(msg);
        int x;
        if (pin == null) {
            return -2;
        }
        try {       
            x = Integer.parseInt(pin); // Parse string into number
            return x;
        } catch (NumberFormatException e) {
            return -1;
        }
 

    }
    
    public static String namnVal(String msg) {
        String namn;
        namn = JOptionPane.showInputDialog(msg);
        return namn;
    }
}


  
