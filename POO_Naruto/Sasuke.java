public class Sasuke extends Ninja implements Tecnica{

      public Sasuke(String nome, String altura, Double peso, String funcao, String nomeCla, String nomeVila, int nivel){
            super(nome, altura, peso, funcao, nomeCla, nomeVila, nivel);
      }

      @Override
      public void tecnica(){
            System.out.println("Chidori");
      }

      public void tecnica(String nome){
            System.out.println(nome);
      }
}
