import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma temperatura em celsius:");

        int temperaturaCelsius = scanner.nextInt();
        int temperaturaFahrenheitSemDecimais;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        temperaturaFahrenheitSemDecimais = (int) temperaturaFahrenheit;

        System.out.println("\nTemperatura em Celsius: " + temperaturaCelsius);
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
        System.out.println("Temperatura em Fahrenheit (Sem Decimais): " + temperaturaFahrenheitSemDecimais);
    }
}
