import java.util.Scanner;

 

public class atv3011Vet {

 

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int a;
        double soma=0;
        int number[] = new int[10];

        for (a=0; a<=9; a++){
        	System.out.println("digite um número para a posição " + a + " :");
        	number
        	soma = soma + number[a];
        }
        System.out.println("A soma dos números do vetor é " + soma);
        System.out.println("A média dos números do vetor é " + (soma/10));
    }
}

        