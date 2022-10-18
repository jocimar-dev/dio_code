package com.example.dio_code.algoritmos_basicos;

import java.util.*;

public class CriarBooleanos {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();

        System.out.println(somatorio(num));
        numero.close();
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
