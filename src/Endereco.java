
    public class Endereco {

        private int numero;
        private String rua;
        private String bairro;
        private String cidade;
        private String estado;
        
    
        public Endereco(String rua, String cidade, String estado, int numero, String bairro) {
            this.rua = rua;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
            this.numero = numero;
        }
        public String getRua() {
            return rua;
        }
    
        public String getCidade() {
            return cidade;
        }

    
        public String getEstado() {
            return estado;
        }
    
    
        public int getnumero() {
            return numero;
        }
    
    }