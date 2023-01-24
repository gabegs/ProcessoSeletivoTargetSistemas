import java.io.BufferedReader;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParser {

    public static void main(String[] args) {

        String strJson = getJSONFromFile("dados.json");
        Double soma = 0.0;
        Double maior = 0.0;
        Double menor = 100000.00;
        Double quantidade = 0.0;
        Double media = 0.0;
        Double qtdAcimaDaMedia = 0.0;

        try {

            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJson);
            JSONArray jsonArray = (JSONArray) object;

            for(int i = 0; i < jsonArray.size(); i++) {

                JSONObject jsonObject = (JSONObject) jsonArray.get(i);

                Object valorObject = jsonObject.get("valor");

                Double valor = Double.valueOf(valorObject.toString()).doubleValue();
                
                if(valor != 0) {
                    quantidade += 1;
                }

                soma += valor;

                if(valor > maior) {
                    maior = valor;
                }

                if(valor < menor && valor > 0.0) {
                    menor = valor;
                }

            }

            media = soma / quantidade;

            for(int i = 0; i < jsonArray.size(); i++) {

                JSONObject jsonObject = (JSONObject) jsonArray.get(i);

                Object valorObject = jsonObject.get("valor");

                Double valor = Double.valueOf(valorObject.toString()).doubleValue();

                if(valor > media) {
                    qtdAcimaDaMedia++;
                }

            }

            System.out.println("Valores maiores que a media: " + qtdAcimaDaMedia + ", Maior valor: " + maior + ", Menor valor: " + menor);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String getJSONFromFile(String fileName) {
        String jsonText = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText += line + "\n";
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonText;
    }

}
