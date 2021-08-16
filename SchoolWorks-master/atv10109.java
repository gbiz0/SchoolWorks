import java.util.Scanner;
public class atv10109
	{

	 	public static void main(String[] args) {
			
		
		Scanner ler = new Scanner(System.in);

		int a = 0;
		int b = 0;

		for (int c= 0; c<9; c++)
		{
			a = ler.nextInt();

			if (a>9 && a<21) b++;
		}

		System.out.println("entrou: "+b);
		System.out.println("saiu: "+(10-b));
	}
}