import java.util.ArrayList;

public class Aldeia {
      private String nome;
      private ArrayList <Pessoa> pessoas;
      private ArrayList <Ninja> ninjas;

      public Aldeia(String nome) {
            this.nome = nome;
            this.pessoas = new ArrayList<>();
            this.ninjas = new ArrayList<>();
      }

      public String getNome() {
            return nome;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }

      public void adicionarPessoas(Pessoa p){
            pessoas.add(p);
      }

      public void adicionarNinjas(Ninja ninja){
            ninjas.add(ninja);
      }  
}