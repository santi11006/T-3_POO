package src;

import java.util.Scanner;

public class TestEcuacionSegundoGrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el valor de a: ");
        double a = sc.nextInt();
        System.out.println("Dime el valor de b: ");
        double b = sc.nextInt();
        System.out.println("Dime el valor de c: ");
        double c = sc.nextInt();

        if (EcuacionesSegundoGrado.esResoluble(a, b, c)){
            System.out.println("Es resoluble");
            double x1 = EcuacionesSegundoGrado.calcularX1(a, b, c);
            System.out.println("X1 es: "+ x1);
            double x2 = EcuacionesSegundoGrado.calcularX1(a, b, c);
            System.out.println("X1 es: "+ x2);

        }else {
            System.out.println("No se puede hacer");
        }

    }
}
