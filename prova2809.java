import java.util.Scanner;
public class prova2809
	{

	 	public static void main(String[] args) {
			
		
		Scanner ler = new Scanner(System.in);

		int sm = 0, ng = 0;

		for(int a = 0; a<11; a++){
			int b = ler.nextInt();


				if (b>=0){
					sm = sm+ b;
				}
		
				else{
					ng +=1;
				}
		}	
		System.out.println("Soma de todos positivos: "+sm+"\nTotal de negativos: "+ng);

	}
}
