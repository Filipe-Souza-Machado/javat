public class Funcionario {
      
      //Atributos-------------------------------------------------------
      private String nome;
      private String cpf;
      private float salario;

      //Construtores-------------------------------------------------------
      public Funcionario(String nome, String cpf, float salario){
            this.nome = nome;
            this.cpf = cpf;
            this.salario = salario;
      }

      //Metodos-------------------------------------------------------
      public String getNome(){
            return nome;
      }

      public void SetNome(String nome){
            this.nome = nome;
      }

      public String getCpf() {
            return cpf;
      }

      public void setCpf(String cpf) {
            this.cpf = cpf;
      }

      public float getSalario() {
            return salario;
      }

      public void setSalario(float salario) {
            this.salario = salario;
      }

      //Metodos da logica
      public void apresentar(){
            System.out.println("Nome: "+nome);
            System.out.println("CPF: "+cpf);
            System.out.println("Salario: "+salario);
      }
}