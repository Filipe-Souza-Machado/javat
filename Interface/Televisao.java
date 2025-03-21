public class Televisao implements Dispositivo{
      private boolean ligada;

      public Televisao(){
            this.ligada = false;
      }

      @Override
      public void ligar(){
            ligada = true;
            System.out.println("A Televisão está ligada");
      }

      @Override
      public void desligar(){
            ligada = false;
            System.out.println("A Televisão está desligada");
      }

      @Override
      public boolean estaligada(){
            return ligada;
      };
}