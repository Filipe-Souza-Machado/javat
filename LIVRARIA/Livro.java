public class Livro {

      // Atributos
      private String titulo;
      private String autor;
      private int anoPublicacao;
      private double preco;

      //construtor
      public Livro(String titulo, String autor, int anoPublicacao, double preco) {
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
            this.preco = preco;
      }


      // gets e sets
      public String getTitulo() {
            return titulo;
      }


      public void setTitulo(String titulo) {
            this.titulo = titulo;
      }


      public String getAutor() {
            return autor;
      }


      public void setAutor(String autor) {
            this.autor = autor;
      }


      public int getAnoPublicacao() {
            return anoPublicacao;
      }


      public void setAnoPublicacao(int anoPublicacao) {
            this.anoPublicacao = anoPublicacao;
      }


      public double getPreco() {
            return preco;
      }


      public void setPreco(double preco) {
            this.preco = preco;
      }
      
      public void exibirInformacoes(){
            System.out.println("Titulo: "+titulo);
            System.out.println("Autor: "+autor);
            System.out.println("Ano de publicação: "+anoPublicacao);
            System.out.println("Preço: R$"+preco);
            System.out.println();
      }
}