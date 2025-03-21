public class Lampada implements Dispositivo{
      private boolean ligada;

      public Lampada(){
            this.ligada = false;
      }

      @Override
      public void ligar(){
            ligada = true;
            System.out.println("A Lampada está ligada");
      }

      @Override
      public void desligar(){
            ligada = false;
            System.out.println("A Lampada está desligada");
      }

      @Override
      public boolean estaligada(){
            return ligada;
      };
}
