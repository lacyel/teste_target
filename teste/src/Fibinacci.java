
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificarFibonacci(int numero) {
        // Inicializa os dois primeiros números da sequência de Fibonacci
        int a = 0;
        int b = 1;

        // Enquanto o próximo número da sequência for menor ou igual ao número fornecido
        while (b <= numero) {
            // Se o próximo número for igual ao número fornecido, retorna verdadeiro
            if (b == numero) {
                return true;
            }
            // Calcula o próximo número na sequência de Fibonacci
            int proximo = a + b;
            // Atualiza os valores de 'a' e 'b' para os próximos números na sequência
            a = b;
            b = proximo;
        }
        // Se o número fornecido não estiver na sequência, retorna falso
        return false;
    }
}
