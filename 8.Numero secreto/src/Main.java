import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        int palpite = 0;
        int numerodasorte = random.nextInt(100) + 1;

        System.out.println("Vamos iniciar o jogo");
        System.out.println("Você deve acertar o número que o robo está pensando!");

        while (palpite != numerodasorte) {
            System.out.println("Digite um número, vamos ver se você acerta: ");
            palpite = leitura.nextInt();

            if (palpite == numerodasorte) {
                System.out.println("Parabéns! Você acertou!");
            } else if (palpite < numerodasorte) {
                System.out.println("O número secreto é maior");
            } else {
                System.out.println("O número secreto é menor");
            }
        }
    }
}