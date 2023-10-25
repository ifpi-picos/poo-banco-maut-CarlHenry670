import java.util.ArrayList;
import java.util.List;


abstract class Conta {
        protected final String Numconta;
        protected final String Agencia;
        protected Cliente cliente;
        protected double saldo;
        private Notificacao notificacao;
        private List<Transacao> transacoes;

        public Conta(String Numconta, String Agencia, double saldo, Cliente cliente, Notificacao notificacao) {
            this.Numconta = Numconta;
            this.Agencia = Agencia;
            this.saldo = saldo;
            this.cliente = cliente;
            this.notificacao = notificacao;
            this.transacoes = new ArrayList<Transacao>();
        }

        public abstract void depositar(double valor);

        public abstract void sacar(double valor);
    
        public abstract void transferir(Conta contaDestino, double valor);

    

        public String getNumconta() {
            return Numconta;
        }

        public String getAgencia(){
            return Agencia;
        }
    
        public double getSaldo() {
            return saldo;
        }
        public Cliente getCliente(){
            return cliente;
        }

        public void setCliente(Cliente cliente){
            this.cliente = cliente;
        }
        public void setSaldo(double saldo){
    this.saldo = saldo;
 }
public void setNotificacao(Notificacao notificacao){
    this.notificacao = notificacao;
}

public Notificacao getNotificacao() {
    return notificacao;
}
public List<Transacao> getTransacoes() {
    return transacoes;
}

public void exibirTransacoes() {
    System.out.println("\n***** Extrato de Transacoes da conta " + getNumconta() + " *****");
    for (Transacao conta : transacoes) {
        System.out.println(
                "Tipo ->" + conta.getDescricao() +
                        "\nValor -> R$" + conta.getValor() +
                        "\nData ->" + conta.getData());
        System.out.println("\n************");
    }
}


                @Override
    public String toString() {
        return "Conta{" +
                "numeroConta='" + Numconta + '\'' +
                ", agencia='" + Agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    }
    
