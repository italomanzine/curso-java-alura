package br.com.meusite.atividades;

public class Aluno {
    // Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize
    // métodos getters e setters para acessar e modificar esses atributos. Adicione
    // um método calcularMedia que retorna a média das notas do aluno.

    private String nome;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

}
