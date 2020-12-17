//1 - Faça um programa que preencha um Vetor com 10 posições. Tais posições devem conter os números pares de 0 a 20. Imprimir o conteúdo do Vetor.
public class atv1512
	{

	 	public static void main(String[] args) {
			
	 		int vet [] = new int [10];

	 		for(int b = 2; b < 20; b += 2)
	 		vet[(b/2)-1]=b;

	 		for (int b = 0; b < 10; b++)
	 		System.out.println(vet[b]);		



	}
}