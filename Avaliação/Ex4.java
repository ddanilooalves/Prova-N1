/*4. Faça um programa que receba um nome (String) 2 notas (double) (valide as notas,
onde 0.0 ≤ nota ≤ 10) de um número indeterminado de alunos. Calcule e mostre (do-while):
a. A média aritmética das 2 notas lidas; Ex. Fulano obteve média: 8,5
b. Uma mensagem de acordo com as regras: Até 4 (Reprovado); Entre 4 e 6 (Exame);
de 6 para cima (Aprovado);

c. O total de alunos;
d. Quantidade de alunos Aprovados, Reprovados e de Exame.
e. A Média da classe.
f. O nome e a média dos alunos com a maior e menor média respectivamente.

As letras ‘a’ e ‘b’ deverão ser mostradas para cada aluno e as letras ‘c’, ‘d’, ‘e’, ‘f’ deverão
ser mostradas ao se encerrar a coleta de notas dos alunos.*/

package Avaliação;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String maiorName = "";
            double mediaMenor = Double.MAX_VALUE;
            String menorName = "";
            double mediaMaior = Double.MIN_VALUE;
            char resp;
            String name;
            double n1, n2, media, somaMedia = 0, mediaSomaMedia = 0;
            int qntalunos = 0, alunoReprovado = 0, alunoExame = 0, alunoAprovado = 0;

            do {
                System.out.println("Caro aluno, informe seu nome: ");
                name = sc.next();

                do {
                System.out.println("\n" + name + " informe sua nota 1: ");
                n1 = sc.nextDouble();
                } while (n1 < 0.0 || n1 > 10.0);

                do {
                System.out.println("Agora informe sua nota 2:");
                n2 = sc.nextDouble();
                } while (n2 < 0.0 || n2 > 10.0);

                media = (n1 + n2) / 2;
                qntalunos++;
                somaMedia += media;
                System.out.println("\nA média do aluno " + name + " é: " + media + "\n");

                if (media <= 4) {
                    System.out.println("### REPROVADO ###\n");
                    alunoReprovado++;
                }
                if (media > 4 && media < 6) {
                    System.out.println("### EXAME ###\n");
                    alunoExame++;
                }
                if (media >= 6) {
                    System.out.println("### APROVADO ###\n");
                    alunoAprovado++;
                }
                if (media > mediaMaior) {
                    mediaMaior = media;
                    maiorName = name;
                }

                if (media < mediaMenor) {
                    mediaMenor = media;
                    menorName = name;
                }
                
                
                System.out.println("Continuar preenchendo a lista dos alunos (s ou n)? ");
                resp = sc.next().charAt(0);
                System.out.println("\n");

                sc.nextLine();
            } while (resp == 's');

            mediaSomaMedia = somaMedia / qntalunos;

            System.out.println("### O total de alunos da sala é de: " + qntalunos + " alunos(as) ###");
            System.out.println("### Quantidade de alunos APROVADOS: " + alunoAprovado + " ###");
            System.out.println("### Quantidade de alunos REPROVADOS: " + alunoReprovado + " ###");
            System.out.println("### Quantidade de aunos de EXAME: " + alunoExame + " ###");
            System.out.println("### Média da sala: " + mediaSomaMedia + " ###");
            System.out.println("### " + maiorName + " é o aluno com maior média da sala, com: " + mediaMaior + " ###");
            System.out.println("### " + menorName + " é o aluno com menor média da sala, com: " + mediaMenor + " ###");
        }
    }
    
}
