public class ConversorDolarReal {
    // Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o
    // valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e
    // imprima o resultado formatado.
    public static void main(String[] args) {
        double valorEmDolares = 100;
        double valorEmReais = valorEmDolares * 4.94;
        System.out.println("O valor de %.2f dólares é equivalente a R$ %.2f".formatted(valorEmDolares, valorEmReais));
    }
}
