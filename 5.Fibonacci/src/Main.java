public class Main {
    public static void main(String[] args) {

        int i, inicio = 0, primeiro = 1;

        System.out.println(primeiro);

        for (i = 2; i <= 20; i++) {
            int proximo = inicio + primeiro;
            System.out.println(proximo);
            inicio = primeiro;
            primeiro = proximo;
        }
    }
}