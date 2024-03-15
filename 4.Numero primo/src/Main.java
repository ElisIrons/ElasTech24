import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número e vamos verificar se ele é um número primo ou não: ");
        int numero = leitura.nextInt();
        int conferindo = 0;
        
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                conferindo++;
                break;
            }
        }

        if (conferindo == 0) {
            System.out.println("O número informado é primo!");
        } else {
            System.out.println("O número informado não é primo!");
        }
    }
}