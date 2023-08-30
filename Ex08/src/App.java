import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //EXERCICIO ESCOLHIDO NUMERO 12
       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade atual em estoque: ");
        int quantidadeAtual = scanner.nextInt();

        System.out.print("Digite a quantidade máxima em estoque: ");
        int quantidadeMaxima = scanner.nextInt();

        System.out.print("Digite a quantidade mínima em estoque: ");
        int quantidadeMinima = scanner.nextInt();

        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

        if (quantidadeAtual >= quantidadeMedia && quantidadeAtual <= quantidadeMaxima) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }

        scanner.close();
    }
}
