

public class Conta {
        private String Numconta;
        private String Agencia;
        private double saldo;
    
        public Conta(String Numconta, String Agencia, double saldo) {
            this.Numconta = Numconta;
            this.Agencia = Agencia;
            this.saldo = saldo;

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

                @Override
    public String toString() {
        return "Conta{" +
                "numeroConta='" + Numconta + '\'' +
                ", agencia='" + Agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
    
    }
    
