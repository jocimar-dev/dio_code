package com.example.dio_code.algoritmos_intermed;

import java.util.Scanner;

public class OrdenaArray {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
        int i, a, j;
        int N = input.nextInt();
        int[] nums = new int[N];

        for (i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        for (i = 0; i < N; i++) {
            if (nums[i] % 2 != 0) {

                for (j = (i + 1); j < N; j++) {
                    if (nums[j] % 2 == 0) {
                        a = nums[i];
                        nums[i] = nums[j];
                        nums[j] = a;
                        j = N;
                    }
                }
            }
        }
        for (i = 0; i < N; i++) {
            System.out.println(nums[i]);
        }
    }
}


//public class OrdenaArray {
//    public static void main(String[] args) throws IOException {
//        Scanner input = new Scanner(System.in);
//        int elementos = Integer.parseInt(input.next());
//
//        List<Integer> listaNumeros = new ArrayList<>();
//
//        while (elementos > 0) {
//            input = new Scanner(System.in);
//            listaNumeros.add(Integer.parseInt(input.nextLine()));
//            elementos--;
//        }
//
//        List<Integer> pares = listaNumeros.stream().filter(listarPar -> listarPar % 2 == 0).sorted().toList();
//        List<Integer> impares = listaNumeros.stream().filter(listarImpar -> listarImpar % 2 != 0).sorted(Comparator.reverseOrder()).toList();
//
//        List<Integer> total = new ArrayList<>();
//        total.addAll(pares);
//        total.addAll(impares);
//        total.forEach(System.out::println);
//    }
//}