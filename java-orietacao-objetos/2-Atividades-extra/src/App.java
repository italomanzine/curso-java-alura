import br.com.meusite.atividades.Aluno;
import br.com.meusite.atividades.ContaBancaria;
import br.com.meusite.atividades.IdadePessoa;
import br.com.meusite.atividades.Livro;
import br.com.meusite.atividades.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        // Atividade 1
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(123);
        conta.setSaldo(1000);
        conta.setTitular("João");
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("");

        // Atividade 2
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("João");
        pessoa.setIdade(20);
        pessoa.verificarIdade();
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        pessoa.verificarIdade();
        System.out.println("");

        // Atividade 3
        Produto produto = new Produto();
        produto.setNome("Arroz");
        produto.setPreco(10.00);
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " + produto.getPreco());
        produto.aplicarDesconto(10);
        System.out.println("");

        // Atividade 4
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        double[] notas = { 7, 8, 9 };
        aluno.setNotas(notas);
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.print("Notas do aluno: ");
        for (int i = 0; i < aluno.getNotas().length; i++) {
            System.out.print(aluno.getNotas()[i] + ", ");
        }
        System.out.println("");
        System.out.println("Médias das notas: " + aluno.calcularMedia());
        System.out.println("");

        // Atividade 5
        Livro livro = new Livro();
        livro.setTitulo("O Senhor dos Anéis");
        livro.setAutor("J.R.R. Tolkien");
        livro.exibirDetalhes();

    }
}
