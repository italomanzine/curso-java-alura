public class MenuPrincipal {
    private DadosCliente cliente;

    public MenuPrincipal(DadosCliente cliente) {
        this.cliente = cliente;
    }

    public void exibirMenu() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            String menu = """
                    *********************************
                    Nome: %s
                    Tipo de conta: %s
                    Saldo Inicial: %.2f
                    *********************************

                    Operações:
                    1 - Visualizar saldo
                    2 - Enviar valor
                    3 - Receber valor
                    4 - Sair

                    Digite a opção desejada:
                    """.formatted(cliente.getNome(), cliente.getTipoConta(), cliente.getSaldo());
            System.out.println(menu);

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: " + cliente.getSaldo());
                    break;
                case 2:
                    enviarValor();
                    break;
                case 3:
                    receberValor();
                    break;
                case 4:
                    System.out.println("Obrigado por usar nossos serviços.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private void enviarValor() {
        System.out.println("Digite o valor a ser enviado:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double valor = scanner.nextDouble();

        if (valor > cliente.getSaldo()) {
            System.out.println("Saldo insuficiente.");
        } else {
            cliente.setSaldo(cliente.getSaldo() - valor);
            System.out.println("Saldo atualizado: " + cliente.getSaldo());
        }
    }

    private void receberValor() {
        System.out.println("Digite o valor a ser recebido:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double valor = scanner.nextDouble();

        cliente.setSaldo(cliente.getSaldo() + valor);
        System.out.println("Saldo atualizado: " + cliente.getSaldo());
    }
}
