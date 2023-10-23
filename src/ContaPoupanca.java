
    public class ContaPoupanca extends Conta {
        private double taxaTransferencia = 0.1; 
        private double taxaSaque = 0.05; 
        private double rendimento; 
    
        public ContaPoupanca(String Numconta, String Agencia, Cliente cliente, double saldo, double rendimento) {
            super(Numconta, Agencia, saldo, cliente);
            this.rendimento = rendimento;
        }
        @Override
        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                saldo += saldo * rendimento; 
                System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Erro: O valor do depósito deve ser maior que zero.");
            }
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
                System.out.println("Transferência de R$" + valor + " realizada para a conta " + contaDestino.getConta() +
                        ". Taxa de R$" + taxaTransferenciaValor + " aplicada.");
            } else {
                System.out.println("Erro: Saldo insuficiente ou valor inválido para transferência.");
            }
        }
    }