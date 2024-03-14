import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer do scanner
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double mediaTurma = soma / notas.length;

        System.out.println("Média da turma: " + mediaTurma);

        System.out.println("Alunos com aproveitamento igual ou superior à média da turma:");
        for (int i = 0; i < nomes.length; i++) {
            if (notas[i] >= mediaTurma) {
                System.out.println(nomes[i] + ": " + notas[i]);
            }
        }

        System.out.println("Alunos com aproveitamento abaixo da média da turma:");
        for (int i = 0; i < nomes.length; i++) {
            if (notas[i] < mediaTurma) {
                System.out.println(nomes[i] + ": " + notas[i]);
            }
        }
    }
}
