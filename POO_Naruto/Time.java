import java.util.ArrayList;

public class Time {
      private String nomeDoTime;
      private ArrayList<Ninja> time = new ArrayList<>();

      public Time(String nomeDoTime){
            this.nomeDoTime = nomeDoTime;
            this.time = new ArrayList<>();
      }

      public void adicionarMembros(Ninja ninja){
            time.add(ninja);
      }

      public void setNomeDoTime(String nomeDoTime){
            this.nomeDoTime = nomeDoTime;
      }

      public String getNomeDoTime(){
            return nomeDoTime;
      }
}
