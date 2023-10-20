
    public class Endereco {
        private String rua;
        private String cidade;
        private String estado;
        private int numero;
    
        public Endereco(String rua, String cidade, String estado, int numero) {
            this.rua = rua;
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