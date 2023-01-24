import java.util.Scanner;

public class Inverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma palavra para ser invertida: ");
        String string = scanner.next(); 
        String stringInvertida = inverteString(string);
        System.out.println("Ao inverter " + string + " obtemos:");
        System.out.println(stringInvertida);

    }

    static String inverteString(String string) {
        String stringInvertida = "";
        for(int i = string.length() - 1; i >= 0; i--) {
            stringInvertida += string.charAt(i);
        }
        return stringInvertida;
    }

}