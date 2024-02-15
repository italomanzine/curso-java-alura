public class App {
    public static void main(String[] args) throws Exception {
        DadosCliente cliente = new DadosCliente("Fulano", "Conta Corrente", 1000.00);
        MenuPrincipal menuPrincipal = new MenuPrincipal(cliente);

        menuPrincipal.exibirMenu();
    }
}
