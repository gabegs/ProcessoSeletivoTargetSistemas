import java.util.Scanner;
import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sequencia = new int[40];
        int escolha;
        boolean encontrado = false;
        for (int i = 0; i < 40; i++) {
            sequencia[i] = calculaFibonacci(i);
        }
        System.out.println("Escolha um número: ");
        escolha = scanner.nextInt();
        for (int i = 0; i < 40; i++) {
           
            if(escolha == sequencia[i]) {
                encontrado = true;
                break;
            }
        } 
        if(encontrado) {
            System.out.println("O número " + escolha + " está na sequência de Fibonacci");
        }
        else {
            System.out.println("O número " + escolha + " não está na sequência de Fibonacci");
        }
    }

    static int calculaFibonacci(int n) {
        int numero = 0;
        int anterior = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                numero = 1;
                anterior = 0;
            } else {
                numero += anterior;
                anterior = numero - anterior;
            }
        }
        return numero;
    }

}
