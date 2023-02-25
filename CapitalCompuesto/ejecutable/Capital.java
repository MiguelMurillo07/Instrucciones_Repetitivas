package ejecutable;

import javax.swing.JOptionPane;

public class Capital
{
    public static void main(String[] args) {
        /* Declaración de variables */
            double c1, c2, c3, k, m, b, d;

        // Input
        c1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el capital de Pedro: "));
        c2 =Double.parseDouble(JOptionPane.showInputDialog("Digite el capital de Juan: "));
        c3 = 0;
        k = 0;
        m = 0;

        // Processing and Output
        b = 2*c1;
        d = 2*c2;

        while (c1 <= b){
            c1 = ((c1*0.03)+c1);
            k = k + 1;
        }
        JOptionPane.showMessageDialog(null, "El capital de Pedro se duplicará luego de "+k+ " meses.", "Capital Compuesto", JOptionPane.INFORMATION_MESSAGE);

        while (c2 <= d){
            c2 = ((c2*0.04)+c2);
            m = m + 1;
        }
        JOptionPane.showMessageDialog(null, "El capital de Juan se duplicará luego de "+m+ " meses.", "Capital Compuesto", JOptionPane.INFORMATION_MESSAGE);


        // Fin
        System.exit(0);
    }
}