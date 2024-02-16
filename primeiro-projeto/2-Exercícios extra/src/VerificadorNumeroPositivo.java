public class VerificadorNumeroPositivo {
    // Crie um programa que solicite ao usuário digitar um número. Se o número for
    // positivo,
    // exiba "Número positivo", caso contrário, exiba "Número negativo".
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Zero é um número neutro.");
        }
        scanner.close();
    }
}
