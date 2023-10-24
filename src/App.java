/*import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;*/
    import java.time.LocalDate;

    public class App {
        public static void main(String[] args) {
            Cliente Carlos = new Cliente("Carlos", "123.231.432-12", LocalDate.of(2023, 10, 28), new Endereco("240", "Davi Xereta", "Portelinha", "São Paulo", "SP"));
            ContaCorrente contaCorrenteA = new ContaCorrente("20212", "3630", 1000, Carlos, new NotificacaoEmail());
            ContaPoupanca contaPoupancaB = new ContaPoupanca("20213", "3630", 1000, Carlos, new NotificacaoSMS());
            Cliente Victor = new Cliente("Victor", "212.540.300-11", LocalDate.of(2023, 12, 11), new Endereco("544", "Santo Antonio", "Centro", "Salvador", "BA"));
            ContaCorrente contaCorrenteC = new ContaCorrente("20214", "3630", 1000, Victor, new NotificacaoSMS());
            ContaPoupanca contaPoupancaD = new ContaPoupanca("20215", "3630", 1000, Victor, new NotificacaoEmail());

//*CONTA CORRENTE P CCORRENTE */
            contaCorrenteA.depositar(1000);
            System.out.println("\nO a conta corrente de Carlos recebeu um depósito de 1000R$");
            System.out.println("Saldo Atual: " + contaCorrenteA.getSaldo());

            contaCorrenteA.transferir(contaCorrenteC, 100);
            System.out.println("Saldo Atual: " + contaCorrenteC.getSaldo());

                System.out.println("Saldo Atual conta A: " + contaCorrenteA.getSaldo());
            contaCorrenteA.transferir(contaCorrenteC, 100);
              System.out.println("Saldo Atual: " + contaCorrenteC.getSaldo());

                  System.out.println("Saldo Atual conta A: " + contaCorrenteA.getSaldo());

            contaCorrenteA.transferir(contaCorrenteC, 100);
              System.out.println("Saldo Atual: " + contaCorrenteC.getSaldo());

                  System.out.println("Saldo Atual conta A: " + contaCorrenteA.getSaldo());

              System.out.println("Saldo Atual conta A: " + contaCorrenteA.getSaldo());

/*CONTA POUPANÇA LOGICA */
System.out.println("******************************************************************************************************");

            contaPoupancaB.depositar(1000);
            System.out.println("\nA conta poupança de Carlos recebeu um depósito de 1000R$");
            System.out.println("Saldo Atual: " + contaPoupancaB.getSaldo());

            contaPoupancaB.transferir(contaPoupancaD, 100);
            System.out.println("Saldo Atual: " + contaPoupancaD.getSaldo());

                System.out.println("Saldo Atual conta B: " + contaPoupancaB.getSaldo());
            contaPoupancaB.transferir(contaPoupancaD, 100);
              System.out.println("Saldo Atual: " + contaPoupancaD.getSaldo());

                  System.out.println("Saldo Atual conta B: " + contaPoupancaB.getSaldo());

            contaPoupancaB.transferir(contaPoupancaD, 100);
              System.out.println("Saldo Atual: " + contaPoupancaD.getSaldo());

                  System.out.println("Saldo Atual conta B: " + contaPoupancaB.getSaldo());

              System.out.println("Saldo Atual conta B: " + contaPoupancaB.getSaldo());
        }

        

}
