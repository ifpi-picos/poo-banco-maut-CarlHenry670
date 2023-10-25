
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Cliente Carlos = new Cliente("Carlos", "123.231.432-12", LocalDate.of(2020, 03, 12),
                new Endereco("240", "Davi Xereta", "Portelinha", "São Paulo", "SP"));
        ContaCorrente contaCorrenteA = new ContaCorrente("20212", "3630", 1000, 0, Carlos, new NotificacaoEmail(), 3);
        ContaPoupanca contaPoupancaB = new ContaPoupanca("20213", "3630", 1000, Carlos, new NotificacaoSMS());
        Cliente Victor = new Cliente("Victor", "212.540.300-11", LocalDate.of(2020, 02, 13),
                new Endereco("544", "Santo Antonio", "Centro", "Salvador", "BA"));
        ContaCorrente contaCorrenteC = new ContaCorrente("20214", "3630", 1000, 1000, Victor, new NotificacaoSMS(), 2);
        ContaPoupanca contaPoupancaD = new ContaPoupanca("20215", "3630", 1000, Victor, new NotificacaoEmail());
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(Carlos);
        clientes.add(Victor);

        List<Conta> contas = new ArrayList<>();
        contas.add(contaCorrenteA);
        contas.add(contaPoupancaB);
        contas.add(contaCorrenteC);
        contas.add(contaPoupancaD);

        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);

            System.out.println("INFORMAÇÕES SOBRE O CLIENTE");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCPF());
            System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
            System.out.println("Endereço: " + cliente.getEndereco().getRua() + ", " + cliente.getEndereco().getNumero()
                    + ", " + cliente.getEndereco().getBairro() + ", " + cliente.getEndereco().getCidade() + ", "
                    + cliente.getEndereco().getEstado());
            System.out.println("*********************************");
            System.out.println("*********************************");
            for (int j = 0; j < contas.size(); j++) {
                Conta conta = contas.get(j);
                if (conta.getCliente().getCPF().equals(cliente.getCPF())) {
                    if (conta instanceof ContaCorrente) {
                        System.out.println("INFORMAÇÕES SOBRE A CONTA (CORRENTE) DO CLIENTE");
                    } else if (conta instanceof ContaPoupanca) {
                        System.out.println("INFORMAÇÕES SOBRE A CONTA (POUPANÇA) DO CLIENTE");
                    }

                    System.out.println("Número da conta: " + conta.getNumconta());
                    System.out.println("Agência: " + conta.getAgencia());
                    System.out.println("Saldo: " + conta.getSaldo());
                    System.out.println("*********************************");
                }
            }

        }
                    
              contaCorrenteA.depositar(100); // DEPOSITO CORRENTE
             System.out.println(contaCorrenteA.getSaldo());
             
              contaCorrenteA.sacar(100); // SAQUE CORRENTE
              System.out.println(contaCorrenteA.getSaldo());
             

            
              System.out.println(contaCorrenteA.getChequeEspecial()); // CHEQUE CORRENTE ESPECIAL
              System.out.println(contaCorrenteA.getSaldo());
             

              System.out.println(contaCorrenteA.getSaldo());

            contaCorrenteA.transferir(contaPoupancaB, 100); // TRANSFERENCIA CORRENTE
            System.out.println(contaCorrenteA.getSaldo());

            contaCorrenteA.transferir(contaCorrenteC, 100); // TRANSFERENCIA CORRENTE
            System.out.println(contaCorrenteA.getSaldo());

            contaCorrenteA.transferir(contaCorrenteC, 100); // TRANSFERENCIA CORRENTE
            System.out.println(contaCorrenteA.getSaldo());


System.out.println(contaPoupancaB.getSaldo());
            contaPoupancaB.transferir(contaCorrenteC, 100); // TRANSFERENCIA POUPANÇA
            System.out.println(contaPoupancaB.getSaldo());

            contaPoupancaB.depositar(100); // DEPOSITO POUPANÇA
            System.out.println(contaPoupancaB.getSaldo());

            contaPoupancaB.sacar(100); // SAQUE POUPANÇA
            System.out.println(contaPoupancaB.getSaldo());

            
System.out.println(contaPoupancaB.getSaldo());
            contaPoupancaB.transferir(contaCorrenteC, 100);
            System.out.println(contaPoupancaB.getSaldo());

            contaPoupancaB.depositar(100); // DEPOSITO POUPANÇA
            System.out.println(contaPoupancaB.getSaldo());

            contaPoupancaB.sacar(100); // SAQUE POUPANÇA
            System.out.println(contaPoupancaB.getSaldo());
    }

}
