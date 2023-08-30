import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //EXERCICIO ESCOLHIDO NUMERO 6
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int maior = Math.max(valor1, valor2);

        System.out.println("O maior valor é: " + maior);

        scanner.close();
        
    }
}
