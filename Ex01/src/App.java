import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      //EXERCICIO ESCOLHIDO NUMERO 1 
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um valor: ");
      int valor = scanner.nextInt();
      scanner.nextLine(); // Consumir a nova linha pendente
        if (valor > 10) {
          System.out.println("É MAIOR QUE 10!");
      } else {
          System.out.println("NÃO É MAIOR QUE 10!");
      }
      
      scanner.close();

    }
}