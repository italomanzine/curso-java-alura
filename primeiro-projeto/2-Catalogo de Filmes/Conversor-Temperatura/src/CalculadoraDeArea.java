public class CalculadoraDeArea {
    // Crie um menu que oferece duas opções ao usuário: "1. Calcular área do
    // quadrado" e "2. Calcular área do
    // círculo". Solicite a escolha do usuário e realize o cálculo da área com base
    // na opção selecionada.
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é " + areaQuadrado);
                scanner.close();
                break;
            case 2:
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.println("A área do círculo é " + areaCirculo);
                scanner.close();
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                break;
        }
    }
}
