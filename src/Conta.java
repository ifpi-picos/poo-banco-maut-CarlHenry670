public class Conta {
        private String Numconta;
        private String Agencia;
        private double saldo;
    
        public Conta(String Numconta, String Agencia, double saldo) {
            this.Numconta = Numconta;
            this.Agencia = Agencia;
            this.saldo = saldo;

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
    }
    
