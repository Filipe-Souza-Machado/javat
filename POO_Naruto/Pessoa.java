public class Pessoa {

      private String nome;
      private String altura;
      private Double peso;
      private String funcao;

      public Pessoa(String nome, String altura, Double peso, String funcao) {
            this.nome = nome;
            this.altura = altura;
            this.peso = peso;
            this.funcao = funcao;
      }
      
      public String getNome() {
            return nome;
      }
      public void setNome(String nome) {
            this.nome = nome;
      }
      public String getAltura() {
            return altura;
      }
      public void setAltura(String altura) {
            this.altura = altura;
      }
      public Double getPeso() {
            return peso;
      }
      public void setPeso(Double peso) {
            this.peso = peso;
      }
      public String getFuncao() {
            return funcao;
      }
      public void setFuncao(String funcao) {
            this.funcao = funcao;
      }

      
}