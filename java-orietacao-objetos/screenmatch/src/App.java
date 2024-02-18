import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        Filme filme1 = new Filme();
        filme1.setNome("O Poderoso Chefão");
        filme1.setAnoDeLancamento(1972);
        filme1.setIncluidoNoPlano(true);
        filme1.setDuracaoEmMinutos(175);

        filme1.exibeFichaTecnica();
        filme1.avalia(5);
        filme1.avalia(4);
        filme1.avalia(5);

        System.out.println("Total de avaliações: " + filme1.getTotalDeAvailacoes());
        System.out.println(filme1.mediaDasAvaliacoes());
        System.out.println("-------------------------------------------------");

        Serie serie1 = new Serie();
        serie1.setNome("Breaking Bad");
        serie1.setAnoDeLancamento(2008);
        serie1.setIncluidoNoPlano(true);
        serie1.setTemporadas(5);
        serie1.setEpsodiosPorTemporada(13);
        serie1.setMinutosPorEpisodio(45);
        serie1.exibeFichaTecnica();
        System.out.println("Duração total da série: " + serie1.duracaoEmMinutos());

        Filme filme2 = new Filme();
        filme2.setNome("O Poderoso Chefão 2");
        filme2.setAnoDeLancamento(1974);
        filme2.setIncluidoNoPlano(true);
        filme2.setDuracaoEmMinutos(202);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println("Tempo total: " + calculadora.getTempoTotal());
    }
}
