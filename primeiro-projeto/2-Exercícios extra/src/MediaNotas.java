public class MediaNotas {
    //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double media = (nota1 + nota2) / 2;

        String resultado = """
                A média das notas %.2f e %.2f é %.2f
                """.formatted(nota1, nota2, media);
        System.out.println(resultado);
    }
}
