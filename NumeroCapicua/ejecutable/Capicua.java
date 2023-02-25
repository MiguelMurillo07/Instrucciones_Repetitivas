package ejecutable;

import javax.swing.JOptionPane;

public class Capicua{
    public static void main(String[] args) {
        /* Declaración de variables */
    int z, x, cifra;
    int inverso = 0;

    // Input
    z = Integer.parseInt(JOptionPane.showInputDialog("Digite el número que quiera evaluar: "));
    x = z;
    
    // Processing and Output
    while (x > 0){
        cifra = x % 10;
        inverso = inverso * 10 + cifra;
        x = x / 10;
    }
    if (z == inverso){
        JOptionPane.showMessageDialog(null, "El número "+z+" SI es capicúa." , "Número capicúa.", JOptionPane.INFORMATION_MESSAGE);
    }
    else
    JOptionPane.showMessageDialog(null, "El número "+z+" NO es capicúa." , "Factorial", JOptionPane.INFORMATION_MESSAGE);

    // Fin
    System.exit(0);
    }
}