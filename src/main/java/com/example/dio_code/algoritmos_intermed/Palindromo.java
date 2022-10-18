package com.example.dio_code.algoritmos_intermed;

import java.util.Locale;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        StringBuilder palavraInvertida = new StringBuilder(palavra).reverse();
        if (palavra.equals(palavraInvertida.toString())) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

}
