import java.util.ArrayList;

public class Empresa {
      //Tem varios departamentos.
      ArrayList<Departameto> departametos;
      Departameto dep;

      public Empresa(){
            departametos = new ArrayList<>();
      }
      
      public void adicionarDepartamento(Departameto dep){
            departametos.add(dep);
      }
}
