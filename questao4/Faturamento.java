import java.lang.Math;

public class Faturamento {

    public static void main(String[] args) {

        double fatSaoPaulo = 67836.43;
        double fatRioDeJaneiro = 36678.66;
        double fatMinasGerais = 29229.88;
        double fatEspiritoSanto = 27165.48;
        double fatOutros = 19849.53;
        double soma = fatSaoPaulo + fatRioDeJaneiro + fatMinasGerais + fatEspiritoSanto + fatOutros;
        double percSaoPaulo = fatSaoPaulo / soma * 100;
        double percRioDeJaneiro = fatRioDeJaneiro / soma * 100;
        double percMinasGerais = fatMinasGerais / soma * 100;
        double percEspiritoSanto = fatEspiritoSanto / soma * 100;
        double percOutros = fatOutros / soma * 100;
        System.out.println("Percentagem de representação de São Paulo: " + Math.round(percSaoPaulo) + "%");
        System.out.println("Percentagem de representação do Rio de Janeiro: " + Math.round(percRioDeJaneiro) + "%");
        System.out.println("Percentagem de representação de Minas Gerais: " + Math.round(percMinasGerais) + 
        "%");
        System.out.println("Percentagem de representação do Espírito Santo: " + Math.round(percEspiritoSanto)+ "%");
        System.out.println("Percentagem de representação dos outros estados: " + Math.round(percOutros) + "%");



    }

}