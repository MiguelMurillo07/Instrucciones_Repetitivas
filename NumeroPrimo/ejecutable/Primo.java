package ejecutable;

import javax.swing.JOptionPane;

public class Primo{
    public static void main(String[] args) {
        /* Declaración de variables */
        int k, i;
        int numero = 0;

    // Input
        k = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor entero y positivo: "));

    // Processing and Output

        for(i = 1; i <= numero; i++);{
            if (numero % i == 0){
                k++;
            }
        }
        if (k != 2){
            JOptionPane.showMessageDialog(null, "El número NO es primo.", "Números Primos", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El número SI es primo.", "Números Primos", JOptionPane.PLAIN_MESSAGE);
        }

        // End
        System.exit(0);
    }
}