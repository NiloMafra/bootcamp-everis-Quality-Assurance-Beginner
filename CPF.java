package br.com.digital.innovation.one;
import java.util.Scanner;
import java.util.Locale;

public class CPF {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);
        String[] cpf = new String[4];
        cpf = sc.nextLine().split("\\.|-");

            for(int i=0; i<cpf.length ; i++) {
                System.out.printf("%s\n", cpf[i]);
                sc.close();
            }
    }
}

