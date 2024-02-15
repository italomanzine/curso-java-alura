public class LetraPalavraConcatenador {
    // Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas
    // variáveis e concatene-as em uma mensagem.
    public static void main(String[] args) {
        char letra = 'A';
        String palavra = " bola";
        String resultado = """
                A letra %c e a palavra %s foram concatenadas: %c%s
                """.formatted(letra, palavra, letra, palavra);
        System.out.println(resultado);
    }
}
