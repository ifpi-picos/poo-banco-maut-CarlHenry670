import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class Conta {
        protected final String Numconta;
        protected final String Agencia;
        protected Cliente cliente;
        protected double saldo;
        private Poupança poupança;
        private Corrente corrente;
    
        public Conta(String Numconta, String Agencia, double saldo, Cliente cliente) {
            this.Numconta = Numconta;
            this.Agencia = Agencia;
            this.saldo = saldo;
            this.cliente = cliente;

        }
        public void transferir(Conta contaDestino, double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                contaDestino.depositar(valor);
                System.out.println("Transferencia de R$" + valor + " realizada para a conta " + contaDestino.getConta());
            } else {
                System.out.println("Saldo insuficiente para transferencia.");
            }
        }
    
        public void depositar(double valor) {
            saldo += valor;

        }
    
        public void sacar(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }
    
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
    
    }
    
