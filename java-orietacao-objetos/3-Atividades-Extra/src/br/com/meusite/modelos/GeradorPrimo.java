package br.com.meusite.modelos;

public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int numero) {
        int proximoPrimo = numero + 1;
        while (true) {
            if (verificarPrimalidade(proximoPrimo)) {
                return proximoPrimo;
            }
            proximoPrimo++;
        }
    }

}
