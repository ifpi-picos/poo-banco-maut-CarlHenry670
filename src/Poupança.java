public class Poupança {
    private double rendimento;

    public Poupança(double rendimento){
        this.rendimento = rendimento;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor; 
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            return true; 
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
            return false;
        }
    }
}
