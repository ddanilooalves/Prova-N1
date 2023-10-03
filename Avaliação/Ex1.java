/*1. Considerando que algoritmos são estruturas de controle de fluxo para resolver um
problema, é correto afirmar que:
I – As etapas (ações) devem ser executadas seguindo uma sequência lógica, na etapa
de processamento de dados são executadas ações como: comparações, cálculos,
classificação etc.
II - Nas estruturas de controle, tais como as estruturas condicional simples, compostas
ou aninhadas, não é necessário verificar as condições para a realização de um comando
ou sequência de comandos.
III- Apresenta uma sequência lógica, e sem ambiguidade, de comandos que,
obedecidos, resultam numa sucessão finita e previsível de ações. 

A. ( ) Apenas I e III
B. ( ) Apenas II
C. ( ) Apenas III
D. ( ) Apenas I
E. ( ) I, II e III
*/

package Avaliação;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1. Considerando que algoritmos são estruturas de controle de fluxo para resolver um\r\n" + //
                    "problema, é correto afirmar que: \n");
            System.out.println("I - As etapas (ações) devem ser executadas seguindo uma sequência lógica, na etapa\r\n" + //
                    "de processamento de dados são executadas ações como: comparações, cálculos,\r\n" + //
                    "classificação etc.\r\n" + //
                    "II - Nas estruturas de controle, tais como as estruturas condicional simples, compostas\r\n" + //
                    "ou aninhadas, não é necessário verificar as condições para a realização de um comando\r\n" + //
                    "ou sequência de comandos.\r\n" + //
                    "III - Apresenta uma sequência lógica, e sem ambiguidade, de comandos que,\r\n" + //
                    "obedecidos, resultam numa sucessão finita e previsível de ações. \n");
            System.out.println("A. ( ) Apenas I e III\r\n" + //
                    "B. ( ) Apenas II\r\n" + //
                    "C. ( ) Apenas III\r\n" + //
                    "D. ( ) Apenas I\r\n" + //
                    "E. ( ) I, II e III \n");

            System.out.println("Informe a alternativa escolhida: ");
            char alternativa = sc.nextLine().charAt(0);

            switch (alternativa) {

                case 'A':
                case 'a':
                System.out.println("A. (X) Apenas I e III");
                System.out.println("### Alternativa correta ###");
                break;

                case 'B':
                case 'b':
                System.out.println("B. (X) Apenas II");
                System.out.println("Sua resposta está errada!");
                System.out.println("### Alternativa correta - (A) Apenas I e III ###");
                break;

                case 'C':
                case 'c':
                System.out.println("C. (X) Apenas III");
                System.out.println("Sua resposta está errada!");
                System.out.println("### Alternativa correta - (A) Apenas I e III ###");
                break;

                case 'D':
                case 'd':
                System.out.println("D. (X) Apenas I");
                System.out.println("Sua resposta está errada!");
                System.out.println("### Alternativa correta - (A) Apenas I e III ###");
                break;

                case 'E':
                case 'e':
                System.out.println("E. (X) I, II e III");
                System.out.println("Sua resposta está errada!");
                System.out.println("### Alternativa correta - (A) Apenas I e III ###");
                break;
            }
        }
    }
}