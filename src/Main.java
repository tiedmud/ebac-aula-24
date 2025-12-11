import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n\n");

        Scanner scanner = new Scanner(System.in);

        int operacao = 0;

        Produto produto = null;
        List<Produto> listaProduto = new ArrayList<>();

        do {
            System.out.printf("Digite a operação:\n1 - Cadastrar\n2 - Exibir\n3 - Sair");
            operacao = scanner.nextInt();
            scanner.nextLine();

            switch (operacao) {
                case 1:
                    System.out.printf("\nDigite o nome:\n");
                    String nome = scanner.nextLine();

                    System.out.printf("Digite o preço:\n");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    produto = new Produto();
                    produto.setNome(nome);
                    produto.setPreco(preco);

                    listaProduto.add(produto);
                break;

                case 2:

                break;

                default:
                break;
            }
        } while (operacao == 1 || operacao == 2);


    }
}