package br.com.digital.innovation.one;

import java.io.IOException;
import java.util.Scanner;

public class Pares {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int n = ler.nextInt();
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0)
                System.out.println(i);
        }

    }

}
