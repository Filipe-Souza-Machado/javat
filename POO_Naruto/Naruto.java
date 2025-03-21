
public class Naruto extends Ninja implements Tecnica{
      
      public Naruto(String nome, String altura, Double peso, String funcao, String nomeCla, String nomeVila, int nivel){
            super(nome, altura, peso, funcao, nomeCla, nomeVila, nivel);
      }

      @Override
      public void tecnica(){
            System.out.println("Rasengan");
      }

      public void tecnica(String nome){
            System.out.println(nome);
      }
}
