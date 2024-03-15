import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String[] listaDeCompras = new String[10];

        String item = "";
        int itemDaLista = 0;

        System.out.println("Lista de compras!\nDigite o item que deseja incluir, caso a lista esteja completa, digite sair!");

        while (!item.equals("sair")) {
            if (itemDaLista == listaDeCompras.length) {
                String[] novoArray = new String[listaDeCompras.length * 2];
                for (int i = 0; i < listaDeCompras.length; i++) {
                    novoArray[i] = listaDeCompras[i];
                }
                listaDeCompras = novoArray;
            }

            System.out.println("Digite o item: ");
            item = leitura.next();
            if (!item.equals("sair")) {
                listaDeCompras[itemDaLista] = item;
                itemDaLista++;
            }
        }

        System.out.print("Lista de compras feita: ");
        for (int i = 0; i < itemDaLista; i++) {
            System.out.print(listaDeCompras[i] + " ");
        }
    }
}