package br.com.digital.innovation.one;

import java.io.OutputStream;
import java.util.function.UnaryOperator;

public class Aula {
    public static void main(String[] args) {
        //PARADIGMA IMPERATIVO
        int valor = 10;
        int resultado = valor * 3;
        System.out.println(resultado);

        //PARADIGMA FUNCIONAL
        //Mesmo processo agora com utilização de lambda
        UnaryOperator<Integer> calcularValorVezesTres = valor2 -> valor2 * 3;
        int valor2 = 10;
        System.out.println(calcularValorVezesTres.apply(valor2));
        System.out.println(valor2);

    }
}
