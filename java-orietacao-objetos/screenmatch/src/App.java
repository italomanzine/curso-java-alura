public class App {
    public static void main(String[] args) throws Exception {
        Filme filme1 = new Filme();
        filme1.nome = "O Poderoso Chefão";
        filme1.anoDeLancamento = 1972;
        filme1.incluidoNoPlano = true;
        filme1.duracaoEmMinutos = 175;

        filme1.exibeFichaTecnica();
        filme1.avalia(5);
        filme1.avalia(4);
        filme1.avalia(5);
        System.out.println(filme1.somaDasAvaliacoes);
        System.out.println(filme1.totalDeAvailacoes);
        System.out.println(filme1.mediaDasAvaliacoes());
    }
}
