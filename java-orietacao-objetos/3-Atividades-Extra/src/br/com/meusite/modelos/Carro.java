package br.com.meusite.modelos;

public class Carro {
    // Crie uma classe Carro com métodos para representar um modelo específico ao
    // longo de três anos. Implemente métodos para definir o nome do modelo, os
    // preços médios para cada ano, e calcular e exibir o menor e o maior preço.
    // Adicione uma subclasse ModeloCarro para criar instâncias específicas,
    // utilizando-a na classe principal para definir preços e mostrar informações.
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public Carro(String modelo, double precoAno1, double precoAno2, double precoAno3) {
        this.modelo = modelo;
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public double menorPreco() {
        double menor = precoAno1;
        if (precoAno2 < menor) {
            menor = precoAno2;
        }
        if (precoAno3 < menor) {
            menor = precoAno3;
        }
        return menor;
    }

    public double maiorPreco() {
        double maior = precoAno1;
        if (precoAno2 > maior) {
            maior = precoAno2;
        }
        if (precoAno3 > maior) {
            maior = precoAno3;
        }
        return maior;
    }

    @Override
    public String toString() {
        return String.format("Modelo: %s\nPreço Ano 1: %.2f\nPreço Ano 2: %.2f\nPreço Ano 3: %.2f",
                modelo, precoAno1, precoAno2, precoAno3);
    }

}
