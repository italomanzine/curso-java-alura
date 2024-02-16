import java.util.Scanner;

public class OutroLoop {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    double mediaAvaliacao = 0;
    double nota = 0;
    int totalAvaliacoes = 0;

    while (nota != -1) {
      System.out.println("Digite a nota do filme ou -1 para encerrar: ");
      nota = leitura.nextDouble();

      if (nota != -1) {
        mediaAvaliacao += nota;
        totalAvaliacoes++;
      }
    }

    System.out.println("Média das notas: " + mediaAvaliacao / totalAvaliacoes);

  }
}
