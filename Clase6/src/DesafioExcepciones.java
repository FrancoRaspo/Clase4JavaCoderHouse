import javax.swing.*;

public class DesafioExcepciones {
    public static void main(String[] args) {
        double numero1 = 0, numero2 = 0;

        try {
            numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingreso un numero para sumar"));
            numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingreso otro numero para sumar"));

            double suma = Suma(numero1, numero2);
            JOptionPane.showMessageDialog( null ,
                    "El resultado de la suma " + numero1 + " + " + numero2 + " es " + suma);
        } catch (NegativeNumberException e) {
            JOptionPane.showMessageDialog( null, e.getMessage() +
                    " Verifique " + numero1 + " + " + numero2 + " = ?");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog( null,"Ingrese números por favor!");
            main(args);
        }


    }

    private static double Suma(double numero1, double numero2) throws NegativeNumberException {

        if (numero1 < 0 || numero2 < 0) {
            throw new NegativeNumberException("Debe ingresar números positivos para sumar.");

        }

        return numero1 + numero2;

    }

}
