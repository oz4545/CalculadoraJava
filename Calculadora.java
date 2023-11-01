package Calculadora;

import java.util.Scanner;

public class Calculadora {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res = 0;
        String operacion;

        do {
            // leer numero 1
            String numero1;
            do {
                System.out.println("\n Ingresa el primer numero");
                numero1 = sc.nextLine();
            } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
            double nume1 = Double.parseDouble(numero1);

            do {
                System.out.println("\n ¿Que operación desea hacer? (Solo coloque un signo)");
                System.out.println("Las operaciones son las siguientes: \n + = Suma \n - = Resta \n"
                        + " x = Multiplicacion \n / = Division \n * = Potencia."
                        + "\n % = residuo");

                operacion = sc.nextLine();
                if (operacion.equals("+") || operacion.equals("-") ||
                        operacion.equals("X") || operacion.equals("/") ||
                        operacion.equals("*")) {
                }

                // Leer numero 2
                String numero2;
                do {
                    System.out.println("\n Por favor, dame el segundo número.");
                    numero2 = sc.nextLine();
                } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                double nume2 = Double.parseDouble(numero2);

                // Respuesta

                System.out.println("(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
            } while (true);
        } while (true);

    }

    @Override
    public String toString() {
        return "Calculadora []";
    }
}