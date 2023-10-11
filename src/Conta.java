import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conta {
        private final String Numconta;
        private final String Agencia;
        private Cliente cliente;
        private double saldo;
        List<Transacao> historicoTransacoes;
    
        public Conta(String Numconta, String Agencia, double saldo, Cliente cliente) {
            this.Numconta = Numconta;
            this.Agencia = Agencia;
            this.saldo = saldo;
            this.cliente = cliente;
            this.historicoTransacoes = new ArrayList<>();
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
            addHistoricoTransacao(valor, "Deposito");
        }
    
        public void sacar(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                this.addHistoricoTransacao(valor*-1, "Saque");
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
    this.historicoTransacoes.forEach(t -> System.out.println(t));
    System.out.println("Saldo atual: " + this.saldo);
    System.out.println("################");
}

   private void addHistoricoTransacao(double valor, String tipo){
    Transacao t = new Transacao(LocalDate.now(), valor, tipo);
    this.historicoTransacoes.add(t);
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
    
