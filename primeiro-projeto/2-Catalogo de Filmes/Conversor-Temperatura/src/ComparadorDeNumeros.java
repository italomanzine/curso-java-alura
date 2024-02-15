public class ComparadorDeNumeros {
    // Peça ao usuário para inserir dois números inteiros. Compare os números e
    // imprima uma mensagem
    // indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();
        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números são iguais.");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("O primeiro número é maior.");
        } else {
            System.out.println("O segundo número é maior.");
        }
        scanner.close();
    }
}
