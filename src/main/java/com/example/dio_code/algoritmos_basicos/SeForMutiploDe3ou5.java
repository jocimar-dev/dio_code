package com.example.dio_code.algoritmos_basicos;

import java.util.Scanner;

public class SeForMutiploDe3ou5 {

    public static void main(String[] args) {
        var numero = new Scanner(System.in);

        int multiplo = numero.nextInt();
        verificaMultiplo(multiplo);
    }

    static void verificaMultiplo(int multiplos) {
        if (multiplos % 3 == 0 && multiplos % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (multiplos % 3 == 0 || multiplos % 5 == 0) {
            if (multiplos % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println("Buzz");
            }
        } else {
            System.out.println(multiplos);
        }
    }

}
