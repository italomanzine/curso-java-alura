import java.util.Scanner;

public class Leitura {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite o nome do filme: ");
    String filme = leitura.nextLine();

    System.out.println("Digite o ano de lançamento: ");
    int anoDeLancamento = leitura.nextInt();

    System.out.println("Digite a nota do filme: ");
    double notaFilme = leitura.nextDouble();

    System.out.println("Filme: " + filme);
    System.out.println("Ano de lançamento: " + anoDeLancamento);
    System.out.println("Nota do filme: " + notaFilme);
  }
}
