import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //EXERCICIO ESCOLHIDO NUMERO 23
       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro time: ");
        String time1 = scanner.nextLine();

        System.out.print("Digite o número de gols do primeiro time: ");
        int golsTime1 = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha pendente

        System.out.print("Digite o nome do segundo time: ");
        String time2 = scanner.nextLine();

        System.out.print("Digite o número de gols do segundo time: ");
        int golsTime2 = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha pendente

        if (golsTime1 > golsTime2) {
            System.out.println("Vencedor: " + time1);
        } else if (golsTime2 > golsTime1) {
            System.out.println("Vencedor: " + time2);
        } else {
            System.out.println("EMPATE");
        }

        scanner.close();
    }
}
