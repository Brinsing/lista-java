import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //EXERCICIO ESCOLHIDO NUMERO 27
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro homem: ");
        int idadeHomem1 = scanner.nextInt();

        System.out.print("Digite a idade do segundo homem: ");
        int idadeHomem2 = scanner.nextInt();

        System.out.print("Digite a idade da primeira mulher: ");
        int idadeMulher1 = scanner.nextInt();

        System.out.print("Digite a idade da segunda mulher: ");
        int idadeMulher2 = scanner.nextInt();

        int homemMaisVelho = Math.max(idadeHomem1, idadeHomem2);
        int mulherMaisNova = Math.min(idadeMulher1, idadeMulher2);

        int somaIdades = homemMaisVelho + mulherMaisNova;
        int produtoIdades = idadeHomem1 * idadeMulher2;

        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + somaIdades);
        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produtoIdades);

        scanner.close();
    }
}
