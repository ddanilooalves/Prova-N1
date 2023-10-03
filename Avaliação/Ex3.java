/*3. Considere um ponto P(x0, y0) e uma reta s de equação s: ax + by + c = 0. Faça um
programa que leia as coordenadas de P e os coeficientes da reta s e calcule a distância
entre P e s, dada através da fórmula abaixo:
D(P, s) =

|ax0 + by0 + c|
√a^2 + b^2 
*/

package Avaliação;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double x0, y0, a, b, c, distancia;

            System.out.println("Informe as coordenadas do ponto P (X0, Y0): ");
            x0 = sc.nextDouble();
            y0 = sc.nextDouble();

            System.out.println("Informe os coeficientes da reta S (A, B, C): ");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            distancia = Math.abs(a * x0 + b * y0 + c) / Math.sqrt(a * a + b * b);

            System.out.println("A distância entre P e S é: " + distancia);
        }
    }
    
}
