package com.example.dio_code.algoritmos_basicos;

import java.util.Scanner;

public class BuscaSequencial{
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int valor = leitor.nextInt(), posicao = -1, i = 0;

        while (i < elementos.length) {
            if (elementos[i] == valor) {
                posicao = i;
                break;
            }
            i++;
        }
        if (posicao != -1) {
            System.out.println("Achei " + valor + " na posicao " + posicao);
        } else {
            System.out.println("Numero " + valor + " nao encontrado!");
        }
        leitor.close();
    }
}
