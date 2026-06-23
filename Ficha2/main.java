package UMinho.POO.Ficha2;

import java.util.Scanner;


public class main {

    private static Scanner sc = new Scanner(System.in);

    private static int leInteiroPositivo(String prompt) {

        int res;    
        do {
            res = sc.nextInt();
        } while (res <= 0);

        return res;
    }

    private static int[] leArrayInternos(int tam) {
        int res[] = new int[tam];

        for(int i=0; i<tam; i++) {
            System.out.print(i);
            res[i] = sc.nextInt();
        }
        return res;
    }

    public static void main(String[] args) {
        int tam = leInteiroPositivo();
        int inteiros[] = leArrayInternos(tam);
    }
}
