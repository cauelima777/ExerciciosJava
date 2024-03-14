import java.util.Scanner;

public class MaiorElementoMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo as matrizes 4x4
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] matrizMaior = new int[4][4];

        System.out.println("Digite os elementos da primeira matriz 4x4:");
        lerMatriz(scanner, matriz1);

        System.out.println("Digite os elementos da segunda matriz 4x4:");
        lerMatriz(scanner, matriz2);


        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizMaior[i][j] = Math.max(matriz1[i][j], matriz2[i][j]);
            }
        }


        System.out.println("A matriz resultante com os maiores elementos é:");
        imprimirMatriz(matrizMaior);

        scanner.close();
    }


    static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }


    static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
