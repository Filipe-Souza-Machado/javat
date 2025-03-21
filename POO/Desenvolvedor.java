public class Desenvolvedor extends Funcionario {

      //Atrubutos------------------------------------------------------------------------------------------------------------------------
      private String linguagem;
      private String framework;

      //Construtores-----------------------------------------------------------------------------------------------------------------------
      public Desenvolvedor(String nome, String cpf, float salario, String linguagem, String framework) {
            super(nome, cpf, salario);
            this.linguagem = linguagem;
            this.framework = framework;
      }

      //Metodos Gets Sets----------------------------------------------------------------------------------------------------------------
      public String getLinguagem() {
            return linguagem;
      }

      public void setLinguagem(String linguagem) {
            this.linguagem = linguagem;
      }

      public String getFramework() {
            return framework;
      }

      public void setFramework(String framework) {
            this.framework = framework;
      }

      //Polimorfismo - Sobreescrita------------------------------------------------------------------------------------------------------
      @Override
      public void apresentar(){
            super.apresentar();
            System.out.println("Linguagem: "+linguagem);
            System.out.println("Framework: "+framework);
      }

      //Polimorfismo - Sobrecarga (Overload)---------------------------------------------------------------------------------------------
      public void programar(){
            System.out.println("EStou programando...");
      }

      public void programar(String opcao){
            System.out.println("EStou programando...");
      }
}