package br.com.zup;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        System.out.println("Digite o primeiro número: ");
        double numero1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        double numero2 = input.nextDouble();
        System.out.println("Digite qual operação realizar (+, -, /, *, %)");
        char operador = input.next().charAt(0);

        if (operador == '+') {
            System.out.println(numero1 + " + " + numero2 + " = " + (calculadora.somar(numero1, numero2)));
        } else if (operador == '-') {
            System.out.println(numero1 + " - " + numero2 + " = " + (calculadora.subtrair(numero1, numero2)));
        } else if (operador == '/') {
            System.out.println(numero1 + " / " + numero2 + " = " + (calculadora.dividir(numero1, numero2)));
        } else if (operador == '*') {
            System.out.println(numero1 + " * " + numero2 + " = " + (calculadora.multiplicar(numero1, numero2)));
        } else if (operador == '%') {
            System.out.println(numero1 + " % " + numero2 + " = " + (calculadora.modulo(numero1, numero2)));
        } else {
            System.out.println("Operador inválido! Escreva uma das opções apresentadas.");
        }
    }
}