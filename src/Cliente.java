import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
 
    private String nome;
    private final String CPF;
    private final LocalDate dataNascimento;
    private Endereco endereco;
    private List<Conta> contas;

    public Cliente(String nome, String CPF, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contas = new ArrayList<>();
    }

    
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }
  
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }
}
