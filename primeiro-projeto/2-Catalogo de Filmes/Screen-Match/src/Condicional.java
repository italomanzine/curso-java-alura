public class Condicional {
  public static void main(String[] args) {
    int anoLancamento = 2022;
    boolean incluidoNoPlano = false;
    double notaDoFilme = 8.5;
    String tipoPlano = "Premium";

    if (anoLancamento >= 2020) {
      System.out.println("Filme lançado recentemente");
    } else {
      System.out.println("Filme lançado há algum tempo");
    }

    if (incluidoNoPlano == true && tipoPlano.equals("Premium")) {
      System.out.println("Filme incluído no plano");
    } else {
      System.out.println("Filme não incluído no plano");
    }
  }
}
