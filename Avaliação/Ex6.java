/*6. [EXTRA] Faça um programa para o “jogo de adivinhar um número”. O computador
deve sortear um número entre 1 e N e pedir para o usuário tentar adivinhar este número.
O usuário vai dizer o seu palpite, e o computador deve responder, se ele é maior ou menor
que o número que ele sorteou. O programa termina somente quando o usuário acertar
exatamente qual o número que o computador tinha sorteado, escrevendo uma mensagem
de felicitações para o nosso usuário e indicando o número total de tentativas feitas até
acertar o número. */

package Avaliação;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe o valor para o N: ");
            int n = sc.nextInt();

            int numSorteado = sorteia(1, n);
            int tentativas = 0;

            System.out.println("\n### Vamos iniciar o jogo de adivinhar... ###\n");

            int palpite;

            do {
                System.out.print("Digite seu humilde palpite: ");
                palpite = sc.nextInt();
                tentativas++;

                if (palpite < 1 || palpite > n) {
                    System.out.println("\n!! O número digitado não faz parte do intervalo entre os números " + 1  + " e " + n + " !!\n");
                } else if (palpite < numSorteado) {
                    System.out.println("\n### O seu palpite é menor do que o número sorteado. ###\n");
                } else if (palpite > numSorteado) {
                    System.out.println("\n### O seu palpite é maior do que o número sorteado. ###\n");
                }
                
            } while (palpite != numSorteado);

                System.out.println("\nParabéns!!");
                System.out.println("Você adivinhou o número escolhido pela máquina.");
                System.out.println("o seu total de tentativas foi: " + tentativas + " vezes.\n");
        }
    }

    public static int sorteia (int limitInferior, int limitSuperior) {
        Random r = new Random();
        return r.nextInt(limitSuperior - limitInferior + 1) + limitInferior;
    }
}
