// Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e 
// métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliaMusica(int avaliacao) {
        this.avaliacao += avaliacao;
        numAvaliacoes++;
    }

    double calculaMediaAvaliacoes() {
        return (double) avaliacao / numAvaliacoes;
    }

}
