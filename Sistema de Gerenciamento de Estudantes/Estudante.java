public class Estudante {

      // Atributos da classe Estudante
      private String nome;        // Nome do estudante
      private String matricula;   // Matrícula do estudante (identificador único)
      private String curso;       // Curso em que o estudante está matriculado
      private int anoIngresso;    // Ano em que o estudante ingressou na escola
  
      // Construtor da classe Estudante
      public Estudante(String nome, String matricula, String curso, int anoIngresso) {
          this.nome = nome;                // Inicializa o nome do estudante
          this.matricula = matricula;      // Inicializa a matrícula do estudante
          this.curso = curso;              // Inicializa o curso do estudante
          this.anoIngresso = anoIngresso;  // Inicializa o ano de ingresso do estudante
      }
  
      // Método getter para obter o nome do estudante
      public String getNome() {
          return nome;
      }
  
      // Método setter para definir o nome do estudante
      public void setNome(String nome) {
          this.nome = nome;
      }
  
      // Método getter para obter a matrícula do estudante
      public String getMatricula() {
          return matricula;
      }
  
      // Método setter para definir a matrícula do estudante
      public void setMatricula(String matricula) {
          this.matricula = matricula;
      }
  
      // Método getter para obter o curso do estudante
      public String getCurso() {
          return curso;
      }
  
      // Método setter para definir o curso do estudante
      public void setCurso(String curso) {
          this.curso = curso;
      }
  
      // Método getter para obter o ano de ingresso do estudante
      public int getAnoIngresso() {
          return anoIngresso;
      }
  
      // Método setter para definir o ano de ingresso do estudante
      public void setAnoIngresso(int anoIngresso) {
          this.anoIngresso = anoIngresso;
      }
  
      // Método para exibir as informações do estudante
      public void exibirInformacoes() {
          System.out.println("Aluno: " + nome);                // Exibe o nome do estudante
          System.out.println("Matrícula: " + matricula);       // Exibe a matrícula do estudante
          System.out.println("Curso: " + curso);                // Exibe o curso do estudante
          System.out.println("Ano de ingresso: " + anoIngresso); // Exibe o ano de ingresso do estudante
      }
  }