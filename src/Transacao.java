import java.util.ArrayList;
import java.util.List;

public class Transacao {
    private String tipo;
    private double valor;
    private String data;

    public Transacao(String tipo, double valor, String data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }
    
    private List<Transacao> transacoes; 

    public Transacao() {
        this.transacoes = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }


    public void adicionarTransacao(String tipo, double valor, String data) {
        Transacao transacao = new Transacao(tipo, valor, data);
        transacoes.add(transacao);
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
