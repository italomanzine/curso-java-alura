package br.com.meusite.modelos;

public class ContaBancaria {
    // Crie uma classe ContaBancaria com métodos para realizar operações bancárias
    // como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse
    // ContaCorrente que herda da classe ContaBancaria. Adicione um método
    // específico para a subclasse, como cobrarTarifaMensal(), que desconta uma
    // tarifa mensal da conta corrente.

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

}
