import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //EXERCICIO ESCOLHIDO NUMERO 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        if (media >= 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();

        
        
    }
}
