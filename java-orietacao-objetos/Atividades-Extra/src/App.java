public class App {
    public static void main(String[] args) throws Exception {
        // Atividade 1
        Pessoa pessoa = new Pessoa();
        pessoa.exibeOlaMundo();
        System.out.println("");

        // Atividade 2
        Calculadora calculadora = new Calculadora();
        calculadora.numero = 5;
        System.out.println(calculadora.dobraNumero());
        System.out.println("");

        // Atividade 3
        Musica musica = new Musica();
        musica.titulo = "Overtaken";
        musica.artista = "One Piece";
        musica.anoLancamento = 2009;
        musica.exibeFichaTecnica();
        musica.avaliaMusica(5);
        musica.avaliaMusica(4);
        musica.avaliaMusica(3);
        System.out.println(musica.calculaMediaAvaliacoes());
        System.out.println("");

        // Atividade 4
        Carro carro = new Carro();
        carro.modelo = "Astra";
        carro.ano = 2008;
        carro.cor = "Cinza";
        carro.exibeFichaTecnica();
        System.out.println(carro.calculaIdade());
        System.out.println("");

        // Atividade 5
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.idade = 20;
        aluno.exibeInformacoes();
    }
}
