import java.time.LocalDate;
// 
public class App {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua ABC", "Cidade A", "Piaui", "64645-000");
        Cliente cliente1 = new Cliente("Cliente 1", "99999999", LocalDate.of(1990, 1, 1), endereco);
        Conta conta1 = new Conta("123456", "7890", 1000.0);
        Conta conta2 = new Conta("654321", "10121", 1000.0);
        cliente1.adicionarConta(conta1);
        cliente1.adicionarConta(conta2);

        System.out.println(conta1);
        System.out.println(conta2);

        conta1.transferir(conta2, 150);

          System.out.println(conta1);
        System.out.println(conta2);

        /*Transacao transacao = new Transacao(LocalDate.now(), 300.0, "Saida");
        System.out.println("\nInformacoes da Transacao:");
        System.out.println(transacao);*/
    }
}

