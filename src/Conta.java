import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class Conta {
        protected final String Numconta;
        protected final String Agencia;
        protected Cliente cliente;
        protected double saldo;
        private Notificacao notificacao;
        private Transacao transacao;
        
    
        public Conta(String Numconta, String Agencia, double saldo, Cliente cliente, Notificacao notificacao) {
            this.Numconta = Numconta;
            this.Agencia = Agencia;
            this.saldo = saldo;
            this.cliente = cliente;
            this.notificacao = notificacao;

        }
        public abstract void depositar(double valor);

        public abstract void sacar(double valor);
    
        public abstract void transferir(Conta contaDestino, double valor);

    

        public String getConta() {
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


   public void exibeExtrato(){
    System.out.println("Saldo atual: " + this.saldo);
    System.out.println("################");
}

                @Override
    public String toString() {
        return "Conta{" +
                "numeroConta='" + Numconta + '\'' +
                ", agencia='" + Agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
                public void setNotificacao(NotificacaoEmail notificacaoEmail) {
                }

    }
    
