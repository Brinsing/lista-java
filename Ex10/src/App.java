import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //EXERCICIO ESCOLHIDO NUMERO 8
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora de início do jogo: ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite a hora de fim do jogo: ");
        int horaFim = scanner.nextInt();

        int duracao;

        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.println("Duração do jogo: " + duracao + " horas");

        scanner.close();
    }
}
