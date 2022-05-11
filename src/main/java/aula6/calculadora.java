package aula6;

import java.util.Scanner;

public class calculadora {

    static int menu() {
        Scanner ler = new Scanner(System.in);
        System.out.println("--Menu--");
        System.out.println("1-Adição");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        System.out.println("Operação:");

        int op = ler.nextInt();
        return op;

    }

    static double entradaDados() {
        System.out.println("--Entrada de Dados--");
        Scanner ler = new Scanner(System.in);
        System.out.println("Número: ");
        double n = ler.nextDouble();
        return n;
    }

    static double add(double n1, double n2) {
        System.out.println("---Adição---");
        double r = n1 + n2;
        return r;
    }

    static double sub(double n1, double n2) {
        System.out.println("---Subtração---");
        double r = n1 - n2;
        return r;
    }

    static double mult(double n1, double n2) {
        System.out.println("---Multiplicação---");
        double r = n1 * n2;
        return r;
    }

    static double div(double n1, double n2) {
        System.out.println("---Divisão---");
        double r = n1 / n2;
        return r;
    }

    static void imprimir(double result) {
        System.out.println("--Imprimir--");
        System.out.println("Resultado: " + result);

    }

    static double controlador(double n1, double n2, int op) {
        System.out.println("--Controlador--");

        double r = 0;

        switch (op) {
            case 1:
                r = add(n1, n2);

                break;
            case 2:
                r = sub(n1, n2);
                break;
            case 3:
                r = mult(n1, n2);
                break;
            case 4:
                r = div(n1, n2);
                break;
        }
        return r;
    }

    public static void main(String[] args) {
        int op = menu();
        double n1 = entradaDados();
        double n2 = entradaDados();
        double r = controlador(n1, n2, op);
        imprimir(r);
    }

}
