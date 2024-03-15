public class Main {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 2; i <= 100; i += 2) {
            soma += i;
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}