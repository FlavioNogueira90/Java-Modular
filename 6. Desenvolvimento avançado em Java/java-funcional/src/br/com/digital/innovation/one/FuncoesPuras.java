package br.com.digital.innovation.one;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificarSeMaior = (paramento, valorComparacao) -> paramento > valorComparacao;

        System.out.println(verificarSeMaior.test(12,13));
        System.out.println(verificarSeMaior.test(13,12));
        System.out.println(verificarSeMaior.test(12,13));
    }
}
