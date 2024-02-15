public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");

        String nomeDoFilme = "Top Gun: Maverick";
        int anoLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoLancamento);
        boolean incluidoNoPlano = true;
        String incluido = incluidoNoPlano ? "Sim" : "Não";
        double notaDoFilme = 8.5;

        // Média das notas
        double media = (9.8 + 6.3 + 8.0) /3;
        String sinopse;
        sinopse = """
                Filme: %s
                Média: %.2f
                Ano de Lançamento: %d
                Filme de ação dos anos 80
                Maverick é um piloto de caça
                Muito bom!
                Incluido no plano: %s
                """.formatted(nomeDoFilme, media, anoLancamento, incluido);
        System.out.println(sinopse);

        int classificacao;
        classificacao =  (int) (media /2);
        System.out.println("Classificação: " + classificacao);
    }
}