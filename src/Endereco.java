
    public class Endereco {

        private String numero;
        private String rua;
        private String bairro;
        private String cidade;
        private String estado;
        
    
        public Endereco(String numero, String rua, String bairro,  String cidade, String estado) {
            this.numero = numero;
            this.rua = rua;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
        }

        public String getNumero() {
            return numero;
        }

        public String getRua() {
            return rua;
        }
         public String getBairro(){
            return bairro;
        } 
        public String getCidade() {
            return cidade;
        }

    
        public String getEstado() {
            return estado;
        }
    
  
    
    }