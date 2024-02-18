package br.com.meusite.modelos;

public class ContaCorrente extends ContaBancaria {
    public void cobrarTarifaMensal() {
        double tarifa = 30;
        setSaldo(getSaldo() - tarifa);
    }

}
