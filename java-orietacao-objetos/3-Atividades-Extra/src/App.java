import br.com.meusite.modelos.Cachorro;
import br.com.meusite.modelos.ContaCorrente;
import br.com.meusite.modelos.Gato;
import br.com.meusite.modelos.GeradorPrimo;
import br.com.meusite.modelos.ModeloCarro;
import br.com.meusite.modelos.NumerosPrimos;
import br.com.meusite.modelos.VerificadorPrimo;

public class App {
    public static void main(String[] args) throws Exception {
        // Atividade 1
        ModeloCarro modelo1 = new ModeloCarro("Modelo 1", 10000, 20000, 30000);

        System.out.println(modelo1);
        System.out.println("Menor preço: " + modelo1.menorPreco());
        System.out.println("Maior preço: " + modelo1.maiorPreco());
        System.out.println("--------------------");

        // Atividade 2
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
        System.out.println("--------------------");

        // Atividade 3
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(1000);
        System.out.println("Saldo disponível: " + conta.getSaldo());
        conta.cobrarTarifaMensal();
        System.out.println("Saldo disponível após cobrança de tarifa: " + conta.getSaldo());
        System.out.println("--------------------");

        // Atividade 4
        VerificadorPrimo verificador = new VerificadorPrimo();
        System.out.println("O número 7 é primo? " + verificador.verificarSeEhPrimo(7));
        System.out.println("O número 10 é primo? " + verificador.verificarSeEhPrimo(10));
        System.out.println("O número 13 é primo? " + verificador.verificarSeEhPrimo(13));

        GeradorPrimo gerador = new GeradorPrimo();
        System.out.println("O próximo primo após 7 é: " + gerador.gerarProximoPrimo(7));
        System.out.println("O próximo primo após 10 é: " + gerador.gerarProximoPrimo(10));
        System.out.println("O próximo primo após 13 é: " + gerador.gerarProximoPrimo(13));

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);

    }
}
