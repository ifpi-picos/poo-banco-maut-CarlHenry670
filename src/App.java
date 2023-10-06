import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua ABC", "Cidade A", "Piaui", "64645-000");


        Cliente cliente = new Cliente("Cliente 1", "99999999", LocalDate.of(1990, 1, 1), endereco);

        Conta conta = new Conta("123456", "7890", 1000.0);

        conta.depositar(500.0);
        conta.sacar(200.0);



        Transacao transacao = new Transacao(LocalDate.now(), 300.0, "Saida");
        System.out.println("Informacoes do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCPF());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        System.out.println("Endereço: " + cliente.getEndereco().getRua() + ", " +
                           cliente.getEndereco().getCidade() + ", " +
                           cliente.getEndereco().getEstado() + ", " +
                           cliente.getEndereco().getCep());

        System.out.println("\nInformacoes da Conta:");
        System.out.println("Numero da Conta: " + conta.getConta());
        System.out.println("Agencia: " + conta.getAgencia());
        System.out.println("Saldo: " + conta.getSaldo());

        System.out.println("\nInformacoes da Transacao:");
        System.out.println(transacao);
    }
}

