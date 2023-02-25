package ejecutable;

import javax.swing.JOptionPane;

public class Factorial
{
    public static void main(String[] args) {
        /* Declaración de variables */
        int k;
        int factorial = 1;
        

    // Input
        k = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del número que quieras evaluar el factorial: "));
        int numero = k;
    // Processing

    while (numero != 0){
        factorial = factorial * numero;
        numero -= 1;
    }

    // Output
    JOptionPane.showMessageDialog(null, "El factorial del número "+k+ " es: "+factorial , "Factorial", JOptionPane.INFORMATION_MESSAGE);

    // Fin
        System.exit(0);
    }
    
}