package ejecutable;

import javax.swing.JOptionPane;

public class Capital
{
    public static void main(String[] args) {
        /* Declaración de variables */
            double c1, c2, c3, k, b, d;

        // Input
        c1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el capital de Pedro: "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el capital de Juan: "));
        c3 = Double.parseDouble(JOptionPane.showInputDialog("Digite el capital del negocio: "));
        k = 0;
        b = c1 + c2;

        // Processing and Output

        while (b <= c3){
            c1 = ((c1*0.03)+c1);
            c2 = ((c2*0.04)+c2);
            b = c1 + c2;
            k = k + 1;
        }
        JOptionPane.showMessageDialog(null, "El capital de Pedro y Juan será viable para el negocio luego de "+k+ " meses.", "Capital Compuesto", JOptionPane.INFORMATION_MESSAGE);

        
        // Fin
        System.exit(0);
    }
}
