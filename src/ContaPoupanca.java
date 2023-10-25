import java.util.ArrayList;
import java.util.List;
    public class ContaPoupanca extends Conta {
        private double taxaTransferencia = 0.1; 
        private double taxaSaque = 0.05; 
    
        public ContaPoupanca(String Numconta, String Agencia, double saldo, Cliente cliente, Notificacao notificacao) {
            super(Numconta, Agencia, saldo, cliente, notificacao);
        

        }
        @Override
    public void depositar(double valor) {
        if (valor > 0) {
            double rendimento = valor + (valor * 0.1);
            super.saldo += rendimento;
            getNotificacao().enviaNotificacao("Deposito", valor);
            getTransacoes().add(new Transacao("Deposito", valor));
            
        }
        System.out.println("Nao foi possivel realizar o deposito !!");
    }

    
        @Override
        public void sacar(double valor) {
            if (valor <= saldo && valor > 0) {
                double taxaSaqueValor = valor * taxaSaque;
                saldo -= valor + taxaSaqueValor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso. Taxa de R$" + taxaSaqueValor + " aplicada.");
            } else {
                System.out.println("Erro: Saldo insuficiente ou valor inválido para saque.");
            }
        }
    
        @Override
        public void transferir(Conta contaDestino, double valor) {
            double taxaTransferenciaValor = valor * taxaTransferencia;
            if (valor <= saldo && valor > 0) {
                saldo -= valor + taxaTransferenciaValor;
                contaDestino.depositar(valor);
                System.out.println("Transferência de R$" + valor + " realizada para a conta " + contaDestino.getNumconta() +
                        ". Taxa de R$" + taxaTransferenciaValor + " aplicada.");

            } else {
                System.out.println("Erro: Saldo insuficiente ou valor inválido para transferência.");
            }
        }

        }
