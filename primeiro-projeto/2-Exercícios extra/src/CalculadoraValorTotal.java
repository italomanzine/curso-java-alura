public class CalculadoraValorTotal {
    //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total
    // multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

    public static void main(String[] args) {
        double precoProduto = 10.5;
        int quantidade = 5;
        double valorTotal = precoProduto * quantidade;
        System.out.println("O valor total da compra é R$ %.2f".formatted(valorTotal));
    }
}
