package com.example.dio_code.algoritmos_intermed;

import java.util.Scanner;

public class FatorialDesajeitado {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res = 0;
        int cnt = 1;
        int tmp = n;
        n--;
        while (n > 0) {

              tmp *= n;
              n--;

              if(n != 0){
                tmp /= n;
                n--;
                }
              tmp += n;
              n--;

              res += tmp;
              tmp = -n;

              if (n == 1) {
                  res += tmp;

                }
                  n--;
              }


        System.out.println(res);
    }
}


