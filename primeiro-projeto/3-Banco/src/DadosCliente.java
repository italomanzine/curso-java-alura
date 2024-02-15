public class DadosCliente {
    private String nome;
    private String tipoConta;
    private double saldo;

    public DadosCliente(String nome, String tipoConta, double saldo) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return this.saldo;
    }
}
