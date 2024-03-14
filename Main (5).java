
public class SomaQuintaColuna {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int somaQuintaColuna = 0;


        int contador = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = contador;
                contador++;
                if (contador > 9) {
                    contador = 1;
                }
            }
        }


        System.out.println("Conteúdo da matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < matriz.length; i++) {
            somaQuintaColuna += matriz[i][4]; // A 5ª coluna tem índice 4
        }

        System.out.println("A soma dos elementos da 5ª coluna é: " + somaQuintaColuna);
    }
}

