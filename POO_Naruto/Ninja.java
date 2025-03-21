//um ninja é uma pessoa, então ela herdar as caracteristicas de pessoa;
public abstract class Ninja extends Pessoa{

      private String nomeCla;
      private String nomeVila;
      private int nivel;

      //Construtor------------------------------------------------
      public Ninja(String nome, String altura, Double peso, String funcao, String nomeCla, String nomeVila, int nivel) {
            super(nome, altura, peso, funcao); // Chama o construtor da classe Pessoa
            this.nomeCla = nomeCla;
            this.nomeVila = nomeVila;
            this.nivel = nivel;
        }

      //Getts e------------------------------------------------
      public String getNomeCla() {
            return nomeCla;
      }

      public void setNomeCla(String nomeCla) {
            this.nomeCla = nomeCla;
      }

      public String getNomeVila() {
            return nomeVila;
      }

      public void setNomeVila(String nomeVila) {
            this.nomeVila = nomeVila;
      }

      public int getNivel() {
            return nivel;
      }

      public void setNivel(int nivel) {
            this.nivel = nivel;
      }
}

/*
 * public class Ninja extends Pessoa {
    private String nomeCla; // Nome do clã
    private String nomeVila; // Nome da vila
    private int nivel; // Nível do ninja

    // Construtor
    public Ninja(String nome, String altura, Double peso, String funcao, String nomeCla, String nomeVila, int nivel) {
        super(nome, altura, peso, funcao); // Chama o construtor da classe Pessoa
        this.nomeCla = nomeCla;
        this.nomeVila = nomeVila;
        this.nivel = nivel;
    }

    // Getters e Setters
    public String getNomeCla() {
        return nomeCla;
    }

    public void setNomeCla(String nomeCla) {
        this.nomeCla = nomeCla;
    }

    public String getNomeVila() {
        return nomeVila;
    }

    public void setNomeVila(String nomeVila) {
        this.nomeVila = nomeVila;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
 */