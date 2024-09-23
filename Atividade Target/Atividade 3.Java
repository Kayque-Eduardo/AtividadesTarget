import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import javax.xml.xpath.*;

public class Atividade3 {

    public static void main(String[] args) {
        try {
            // Carregar o arquivo enviado por email XML
            File CA = new File("Fat.xml");
            DocumentBuilderFactory Fac = DocumentBuilderFactory.newInstance();
            DocumentBuilder B = Fac.newDocumentBuilder();
            Document D = B.parse(CA);
            D.getDocumentElement().normalize();

            // Carregando os valores do faturamento
            NodeList LV = D.getElementsByTagName("row");
            double MF = Double.MAX_VALUE;
            double MAF = Double.MIN_VALUE;
            double SF = 0;
            int DF = 0;

            // Processando os valores do farutamento
            for (int IF = 0; IF < LV.getLength(); IF++) {
                Element ELE = (Element) LV.item(IF);
                double VAL = Double.parseDouble(ELE.getElementsByTagName("valor").item(0).getTextContent());

                if (VAL > 0) {
                    DF++;
                    SF += VAL;
                    if (VAL < MF) {
                        MF = VAL;
                    }
                    if (VAL > MAF) {
                        MAF = VAL;
                    }
                }
            }

            // Media
            double MEF = DF > 0 ? SF / DF : 0;

            // Dias>medias
            int DAM = 0;
            for (int IF = 0; IF < LV.getLength(); IF++) {
                Element ELE = (Element) LV.item(IF);
                double Val = Double.parseDouble(ELE.getElementsByTagName("valor").item(0).getTextContent());
                if (Val > MEF) {
                	DAM++;
                }
            }

            // Exibindo os resultados
            System.out.printf("Menor faturamento: R$%.2f%n", MF);
            System.out.printf("Maior faturamento: R$%.2f%n", MAF);
            System.out.println("Número de dias acima da média: " + DAM);
            
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
