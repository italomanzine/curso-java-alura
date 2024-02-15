public class JogoAdivinhacao {
    // Crie um programa que simula um jogo de adivinhação, que deve gerar um número
    // aleatório entre 0 e 100
    // e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A
    // cada tentativa, o programa
    // deve informar se o número digitado pelo usuário é maior ou menor do que o
    // número gerado.
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 100);
        int tentativas = 5;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < tentativas; i++) {
            System.out.printf("Tentativa %d de %d. Digite um número: ", i + 1, tentativas);
            int numero = scanner.nextInt();
            if (numero == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou!");
                break;
            } else if (numero < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }

            if (i == tentativas - 1) {
                System.out.println("Suas tentativas acabaram. O número era " + numeroAleatorio);
            }
        }
        scanner.close();
    }
}
