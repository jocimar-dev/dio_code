package com.example.dio_code.algoritmos_basicos;

import java.util.Scanner;

public class SomaMultiplos {

    public static void main(String[] args) {
       int soma = 0;
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int N = input.nextInt();
        for(int i = 1; i <= N; i++){
            if(i % A == 0) {
                soma += i;
            }
        }
        System.out.println(soma);
   }
}
