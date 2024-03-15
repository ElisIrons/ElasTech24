import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite apenas números inteiros positivos!\nDigite um número: ");
        int numero = leitura.nextInt();
        int soma = 0, contador = 0;
        double media;

        while (numero >= 0) {
            soma = soma + numero;
            contador++;
            System.out.println("Digite outro número: ");
            numero = leitura.nextInt();
        }
        if (contador > 0) {
            media = (double) soma / contador;
            System.out.println("A média dos números inseridos é: " + media);
        } else {
            System.out.println("Apenas números inteiros positivos!");
        }
    }
}