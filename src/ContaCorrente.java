import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {
    private double chequeEspecial;
    private int transferenciaSemTaxa = 2;
   

    public ContaCorrente(String Numconta, String Agencia, double saldo, double chequeEspecial, Cliente cliente, Notificacao notificacao, int transferenciaSemTaxa) {
        super(Numconta, Agencia, saldo + chequeEspecial, cliente, notificacao);
        this.chequeEspecial = 1000;
        this.transferenciaSemTaxa = 2;
        
   
    }

    public double getChequeEspecial() {
        return chequeEspecial;
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
        if (valor > 0 && valor <= saldo + chequeEspecial){
            this.setSaldo(this.getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.println("Você transferiu: R$" + valor + " da sua conta corrente para a sua conta poupança.");
            transferenciaSemTaxa--;
            
            if (transferenciaSemTaxa <= 0){
                double taxa = valor * 0.1;
                this.setSaldo(this.getSaldo() - taxa);
            }

            System.out.println("Seu saldo atual é: R$" + this.getSaldo());

            System.out.println("\n");
            notificacao.enviaNotificacao("transferencia", valor);
        } else {
            System.out.println("Limite insuficiente ou valor de tranferencia inválido");
        }
    }


    }





