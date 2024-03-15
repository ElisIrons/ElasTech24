import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número para exibir a tabuada do mesmo: ");
        int numero = leitura.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + " = " + numero * i);
        }
    }
}