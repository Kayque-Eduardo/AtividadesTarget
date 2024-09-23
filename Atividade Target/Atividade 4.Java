import java.util.HashMap;
import java.util.Map;

public class Atividade4 {

    public static void main(String[] args) {
        // Aqui referimos o Faturamento mensal por estado
        Map<String, Double> FE = new HashMap<>();
        FE.put("SP", 67836.43);
        FE.put("RJ", 36678.66);
        FE.put("MG", 29229.88);
        FE.put("ES", 27165.48);
        FE.put("Outros", 19849.53);

        // Fatueamento total
        double FT = 0;
        for (double F : FE.values()) {
            FT += F;
        }

        // Calculando a %
        System.out.println("Percentual de faturamento por estado:");
        for (Map.Entry<String, Double>  MF: FE.entrySet()) {
            String E = MF.getKey();
            double VF = MF.getValue();
            double PF = (VF / FT) * 100;
            System.out.printf("%s: %.2f%%%n", E, PF);
        }
    }
}