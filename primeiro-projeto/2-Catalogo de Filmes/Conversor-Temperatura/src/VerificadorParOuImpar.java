public class VerificadorParOuImpar {
    // Crie um programa que solicite ao usuário a entrada de um número inteiro.
    // Verifique se o número é par
    // ou ímpar e exiba uma mensagem correspondente.
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
        scanner.close();
    }
}
