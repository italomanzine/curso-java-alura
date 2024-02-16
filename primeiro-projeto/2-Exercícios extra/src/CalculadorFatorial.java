public class CalculadorFatorial {
    // Crie um programa que solicite ao usuário um número e calcule o fatorial desse
    // número.
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.printf("O fatorial de %d é %d\n", numero, fatorial);
        scanner.close();
    }
}
