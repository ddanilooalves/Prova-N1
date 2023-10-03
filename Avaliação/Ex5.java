/*5. Escreva um programa que leia dois vetores – V1 e V2 – cada um com N(N<=10)
valores reais e um terceiro vetor – Op - com N valores do tipo caracter. Seu programa
deve gerar um vetor – Resul como sendo o resultado das operações de V1 com V2, onde
o código da operação está no vetor Op nas respectivas posições. */

package Avaliação;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o tamanho dos vetores: ");
            int n = sc.nextInt();
            double[] v1 = new double[n];
            double[] v2 = new double[n];
            char[] oP = new char[n];
            double[] resul = new double[n];

            if (n <= 0 || n > 10) {
                System.out.println("N deve estar entre 1 e 10!");
                return;
            }

            System.out.println("Digite os valores do Vetor 1: ");
            for (int i = 0; i < n; i++) {
                v1[i] = sc.nextDouble();
            }

            System.out.println("Digite os valores do Vetor 2: ");
            for (int i = 0; i < n; i++) {
                v2[i] = sc.nextDouble();
            }

            System.out.println("Digite os códigos operacionais: ");
            for (int i = 0; i < n; i++) {
                oP[i] = sc.next().charAt(0);
            }

            for (int i = 0; i < n; i++) {
                switch (oP[i]) {
                    case '+':
                        resul[i] = v1[i] + v2[i];
                        break;
                    
                    case '-':
                        resul[i] = v1[i] - v2[i];
                        break;

                    case '*':
                        resul[i] = v1[i] * v2[i];
                        break;

                    case '/':
                        if (v2[i] != 0) {
                            resul[i] = v1[i] / v2[i];
                        } else {
                            System.out.println("Divisão por zero.");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Operação inválida: " + oP[i]);
                        return;
                }
            }
            System.out.println("### Resultado das operações ###");
            for (int i = 0; i < n; i++) {
                System.out.println("Resultado [" + oP[i] + "] - " + resul[i]);
            }
        }
    }
}
