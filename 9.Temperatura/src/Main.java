import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("Digite a opção que represente qual conversão deseja fazer: ");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("3 - Sair");
            opcao = leitura.nextInt();

            double temperatura, conversao = 0;

            switch (opcao) {
                case 1:
                    System.out.println("Digite a temperatura em Celsius:");
                    temperatura = leitura.nextDouble();
                    conversao = temperatura * 1.8 + 32;
                    System.out.println("A temperatura " + temperatura + " graus Celsius convertida é " + conversao + " graus Fahrenheit");
                    break;
                case 2:
                    System.out.println("Digite a temperatura em Fahrenheit:");
                    temperatura = leitura.nextDouble();
                    conversao = (temperatura - 32) / 1.8;
                    System.out.println("A temperatura " + temperatura + " graus Fahrenheit convertida é " + conversao + " graus Celsius");
                    break;
                case 3:
                    System.out.println("Encerrando");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}