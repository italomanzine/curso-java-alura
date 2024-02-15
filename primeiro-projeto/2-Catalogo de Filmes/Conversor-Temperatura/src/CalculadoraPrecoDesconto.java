public class CalculadoraPrecoDesconto {
  // Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o
  // preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um
  // valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais,
  // aplique-o ao preço original e imprima o novo preço com desconto.
  public static void main(String[] args) {
    double precoOriginal = 100;
    double percentualDesconto = 10;
    double valorDesconto = precoOriginal * percentualDesconto / 100;
    double precoComDesconto = precoOriginal - valorDesconto;
    System.out.println("O preço original é R$ %.2f. O desconto de %.2f%% é R$ %.2f. O preço com desconto é R$ %.2f"
        .formatted(precoOriginal, percentualDesconto, valorDesconto, precoComDesconto));
  }
}
