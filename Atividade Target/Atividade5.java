import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        // Primeiro iremos solicitar uma string para o usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string para ser invertida: ");
        String Si = scanner.nextLine();
        
        // Invertendo a string
        String SF = inverter(Si);
        
        // Exibe o resultado
        System.out.println("String invertida: " + SF);
        
        scanner.close();
    }

    public static String inverter(String str) {
        String resultado = "";
        for (int STI = str.length() - 1; STI >= 0; STI--) {
            resultado += str.charAt(STI);
        }
        return resultado;
    }
}
