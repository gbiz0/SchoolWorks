import java.util.Scanner;
public class atv1409{

    public static void main(String[] args){


        Scanner ler = new Scanner(System.in);

        int a = 0, menor = Integer.MIN_VALUE, maior = Integer.MAX_VALUE;
        for (int b = 0; b < 20; b++)
        {
            a = ler.nextInt();

            if (menor < a) menor = a;
            if (maior > a) maior = a;
        }

        System.out.println("O menor numero é: " + maior + " e o maior numero é: " + menor);

    }
}