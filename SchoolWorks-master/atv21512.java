//2 - Faça um programa que preencha uma Matriz de 3x10 conforme a imagem em anexo. Imprimir o conteúdo da Matriz.
public class atv21512 {

    public static void main(String[] args) {
    int vet[][] = new int[3][10];

        for (int a = 0; a <= 2; a++) {
            
        for (int b = 0; b <= 9; b++) {
                vet[a][b]=b;
            }
        }
        for (int a = 0; a <= 2; a++) {
            System.out.println(" ");
            
        for (int b = 0; b <= 9; b++) {
             System.out.print(vet[a][b]);
    }
}
    }
}