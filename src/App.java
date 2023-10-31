
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Cliente Carlos = new Cliente("Carlos", "123.231.432-12", LocalDate.of(2020, 03, 12),
                new Endereco("240", "Davi Xereta", "Portelinha", "São Paulo", "SP"));
        ContaCorrente contaCorrenteA =
                new ContaCorrente("20212", "3630", 1000, 0, Carlos, new NotificacaoEmail(), 3);
        ContaPoupanca contaPoupancaB =
                new ContaPoupanca("20213", "3630", 1000, Carlos, new NotificacaoSMS());
        Cliente Victor = new Cliente("Victor", "212.540.300-11", LocalDate.of(2020, 02, 13),
                new Endereco("544", "Santo Antonio", "Centro", "Salvador", "BA"));
        ContaCorrente contaCorrenteC =
                new ContaCorrente("20214", "3630", 1000, 1000, Victor, new NotificacaoSMS(), 2);
        ContaPoupanca contaPoupancaD =
                new ContaPoupanca("20215", "3630", 1000, Victor, new NotificacaoEmail());


        contaCorrenteA.depositar(100);
        System.out.println(contaCorrenteA.getSaldo());
        contaCorrenteA.sacar(100);
        System.out.println(contaCorrenteA.getSaldo());
        contaCorrenteA.transferir(contaCorrenteC, 100);
        contaCorrenteA.transferir(contaCorrenteC, 100);
        contaCorrenteA.transferir(contaCorrenteC, 100);
        contaCorrenteA.transferir(contaCorrenteC, 100);
        contaCorrenteA.transferir(contaCorrenteC, 100);
        // esta transação não funcionou, mas deveria funcionar pegando o limite do cheque especial
        contaCorrenteA.transferir(contaCorrenteC, 500);
        contaCorrenteA.exibirTransacoes(); // deveria exibir o saldo atual no extrato
        System.out.println(contaCorrenteA.getSaldo());

        System.out.println(contaPoupancaB.getSaldo());
        contaPoupancaB.depositar(100);
        System.out.println(contaPoupancaB.getSaldo());
        contaPoupancaB.sacar(100);
        System.out.println(contaPoupancaB.getSaldo());
        contaPoupancaB.getTransacoes();
    }

}
