public class ContaCorrente extends Conta {
    private double chequeEspecial;
    int numeroTransferencias;

    public ContaCorrente(String Numconta, String Agencia, Cliente cliente, double saldo, double chequeEspecial) {
        super(Numconta, Agencia, saldo, cliente);
        this.chequeEspecial = chequeEspecial;
        this.numeroTransferencias = 0;
    }
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + chequeEspecial && valor > 0) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido para saque.");
        }
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if (numeroTransferencias < 2 && valor > 0 && valor <= saldo + chequeEspecial) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada para a conta " + contaDestino.getConta());
            numeroTransferencias++;
        } else if (numeroTransferencias >= 2 && valor > 0 && valor <= saldo + chequeEspecial) {
            double taxa = 0.1 * valor;
            if (saldo >= valor + taxa) {
                saldo -= valor + taxa;
                contaDestino.depositar(valor);
                System.out.println("Transferência de R$" + valor + " realizada para a conta " + contaDestino.getConta() +
                        " com taxa de R$" + taxa);
            } else {
                System.out.println("Erro: Saldo insuficiente para transferência com taxa.");
            }
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido para transferência.");
        }
    }
    }

