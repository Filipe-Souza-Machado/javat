public class Main {

      public static void main(String[] args) {
            
            Desenvolvedor dev = new Desenvolvedor("paulo", "'123323", 0.0f, "java", "Spring boot");

            dev.apresentar();

            //Composição

            //Agregação 

            Empresa empresa = new Empresa();

            Departameto dep_programação = new Departameto();
            Departameto dep_Marketing = new Departameto();
            Departameto dep_vendas = new Departameto();

            empresa.adicionarDepartamento(dep_programação);
            empresa.adicionarDepartamento(dep_Marketing);
            empresa.adicionarDepartamento(dep_vendas);
      }
}