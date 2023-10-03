package Avaliação;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe os lados do seu polígono: ");
            int n = sc.nextInt();

            int nd = n * (n - 3) / 2;

            if (n < 3) {
                System.out.println("Um polígono precisa ter mais de 3 lados!");
                System.out.println("Inicie o programa novamente...");
            } else {
                System.out.println("\n### O polígono convexo de " + n + " lados tem " + nd + " diagonais diferentes. ###\n");
            }
        }
    }
    
}
