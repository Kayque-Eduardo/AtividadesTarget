import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número para a verificação
        System.out.print("Informe o número para a verificação se pertence à sequência de Fibonacci: ");
        int NF = scanner.nextInt();

        // Verifica se o número pertence à sequência
        boolean Fibo = pertenceFibonacci(NF);

        // Exibe o resultado
        if (Fibo) {
            System.out.println("O número " + NF + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + NF + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean pertenceFibonacci(int NF2) {
        int F1 = 0, F2 = 1, RF = 0;

    
        if (NF2 == F1 || NF2 == F2) {
            return true;
        }

        // Verificandp a sequência de Fibonacci
        while (RF < NF2) {
            RF = F1 + F2;
            if (RF == NF2) {
                return true;
            }
            F1 = F2;
            F2 = RF;
        }

        return false;
    }
}
