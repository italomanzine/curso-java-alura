public class GeradorTabuada {
    // Crie um programa que solicite ao usuário um número e exiba a tabuada desse
    // número de 1 a 10.
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
        scanner.close();
    }
}
