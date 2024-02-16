import br.com.alura.screenmatch.modelos.Filme;

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
    }
}
