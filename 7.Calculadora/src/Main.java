import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int opcao = 1;

        while (opcao != 0) {
            System.out.println("Digite o primeiro número para realizar as operações aritméticas de adição, subtração, multiplicação e divisão: ");
            double n1 = leitura.nextDouble();

            System.out.println("Digite o segundo número: ");
            double n2 = leitura.nextDouble();

            double soma, sub, multi, div;
            soma = n1 + n2;
            System.out.println("O resultado da soma = " + soma);
            sub = n1 - n2;
            System.out.println("O resultado da subtração = " + sub);
            multi = n1 * n2;
            System.out.println("O resultado da multiplicação = " + multi);
            div = n1 / n2;
            System.out.println("O resultado da divisão= " + div);

            System.out.println("Caso queira sair, digite 0 e se quiser continuar aperte qualquer outro número ");
            opcao = leitura.nextInt();

            if (opcao == 0)
                break;
        }
    }
}