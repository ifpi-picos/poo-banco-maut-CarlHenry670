
   import java.time.LocalDate;
   import java.util.Scanner;
    public class App {
        public static void main(String[] args) {
            int opcao;
            Cliente Carlos = new Cliente("Carlos", "123.231.432-12", "12/02/2005", new Endereco("240", "Davi Xereta", "Portelinha", "São Paulo", "SP"));
            ContaCorrente contaCorrenteA = new ContaCorrente("20212", "3630", 1000, Carlos, new NotificacaoEmail());
            ContaPoupanca contaPoupancaB = new ContaPoupanca("20213", "3630", 1000, Carlos, new NotificacaoSMS());
            Cliente Victor = new Cliente("Victor", "212.540.300-11", "23/02/2003", new Endereco("544", "Santo Antonio", "Centro", "Salvador", "BA"));
            ContaCorrente contaCorrenteC = new ContaCorrente("20214", "3630", 1000, Victor, new NotificacaoSMS());
            ContaPoupanca contaPoupancaD = new ContaPoupanca("20215", "3630", 1000, Victor, new NotificacaoEmail());   
            Scanner scanner = new Scanner(System.in);
            do {
               {
System.out.println("******************************************************************************************************");     
System.out.println("******************************************************************************************************");
System.out.println("************************************BANCO MAUT**************************************************");
System.out.println("**********ALUNO: Carlos Henrique ****************CURSO: ADS II*********************");     
System.out.println("******************************************************************************************************");
System.out.println("******************************************************************************************************");     
System.out.println("******************************************************************************************************");

System.out.println("ESCOLHA UMA OPÇÃO: ");
System.out.println("1 - CRIAR CONTA");
System.out.println("2 - DEPOSITAR");
System.out.println("3 - SACAR");
System.out.println("4 - TRANSFERIR");
System.out.println("5 - EXTRATO");
System.out.println("6 - SAIR");

opcao = scanner.nextInt();

if(opcao == 1){
    System.out.println("ESCOLHA UMA OPÇÃO: ");
    System.out.println("1 - CONTA CORRENTE");
    System.out.println("2 - CONTA POUPANÇA");
    opcao = scanner.nextInt();

    if (opcao == 1){
        System.out.println("CONTA CORRENTE");
        System.out.println("DIGITE O NOME DO CLIENTE: ");
        String nome = scanner.next();
        System.out.println("DIGITE O CPF DO CLIENTE: ");
        String cpf = scanner.next();
        System.out.println("DIGITE O DATA DE NASCIMENTO DO CLIENTE: ");
        String dataNascimento = scanner.next();
        System.out.println("DIGITE O NUMERO DA CASA DO CLIENTE: ");
        String numero = scanner.next();
        System.out.println("DIGITE O NOME DA RUA DO CLIENTE: ");
        String rua = scanner.next();
        System.out.println("DIGITE O BAIRRO DO CLIENTE: ");
        String bairro = scanner.next();
        System.out.println("DIGITE A CIDADE DO CLIENTE: "); 
        String cidade = scanner.next();
        System.out.println("DIGITE O ESTADO DO CLIENTE: ");
        String estado = scanner.next();
        System.out.println("DIGITE O NUMERO DA CONTA: ");
        String numconta = scanner.next();
        System.out.println("DIGITE O NUMERO DA AGENCIA: ");
        String agencia = scanner.next();
        System.out.println("DIGITE O SALDO DA CONTA: ");
        double saldo = scanner.nextDouble();
        Cliente cliente = new Cliente(nome, cpf, dataNascimento, new Endereco(numero, rua, bairro, cidade, estado));
        ContaCorrente contaCorrente = new ContaCorrente(numconta, agencia, saldo, cliente, new NotificacaoEmail());
        System.out.println("CONTA CRIADA COM SUCESSO");
        System.out.println("ESCOLHA A NOTIFICAÇAO: ");
        if (opcao == 1){
            System.out.println("1 - NOTIFICAÇÃO POR EMAIL");
            System.out.println("2 - NOTIFICAÇÃO POR SMS");
            opcao = scanner.nextInt();
            if (opcao == 1){
                contaCorrente.setNotificacao(new NotificacaoEmail());
            }else if (opcao == 2){
                contaCorrente.setNotificacao(new NotificacaoSMS());
            }
        }

    }else if (opcao == 2){
        System.out.println("CONTA POUPANÇA");
        System.out.println("DIGITE O NOME DO CLIENTE: ");
        String nome = scanner.next();
        System.out.println("DIGITE O CPF DO CLIENTE: ");
        String cpf = scanner.next();
        System.out.println("DIGITE O DATA DE NASCIMENTO DO CLIENTE: ");
        String dataNascimento = scanner.next();
        System.out.println("DIGITE O NUMERO DA CASA DO CLIENTE: ");
        String numero = scanner.next();
        System.out.println("DIGITE O NOME DA RUA DO CLIENTE: ");
        String rua = scanner.next();
        System.out.println("DIGITE O BAIRRO DO CLIENTE: ");
        String bairro = scanner.next();
        System.out.println("DIGITE A CIDADE DO CLIENTE: "); 
        String cidade = scanner.next();
        System.out.println("DIGITE O ESTADO DO CLIENTE: ");
        String estado = scanner.next();
        System.out.println("DIGITE O NUMERO DA CONTA: ");
        String numconta = scanner.next();
        System.out.println("DIGITE O NUMERO DA AGENCIA: ");
        String agencia = scanner.next();
        System.out.println("DIGITE O SALDO DA CONTA: ");
        double saldo = scanner.nextDouble();
        Cliente cliente = new Cliente(nome, cpf, dataNascimento, new Endereco(numero, rua, bairro, cidade, estado));
        ContaPoupanca contaPoupanca = new ContaPoupanca(numconta, agencia, saldo, cliente, new NotificacaoEmail());
        System.out.println("CONTA CRIADA COM SUCESSO");
        System.out.println("ESCOLHA A NOTIFICAÇAO: ");
            System.out.println("1 - NOTIFICAÇÃO POR EMAIL");
            System.out.println("2 - NOTIFICAÇÃO POR SMS");
            opcao = scanner.nextInt();
            if (opcao == 1){
                contaPoupanca.setNotificacao(new NotificacaoEmail());
            }else if (opcao == 2){
                contaPoupanca.setNotificacao(new NotificacaoSMS());
            }
    }
}
}
            } while (true);
        }
}
