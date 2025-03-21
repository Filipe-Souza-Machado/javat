import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Dispositivo televisao = new Televisao();
            Dispositivo lampada = new Lampada();

            System.out.println("Dejesa ligar a televisão? (S/N)");
            String respostaTelevisao = sc.nextLine();
            if (respostaTelevisao.equalsIgnoreCase("s")) {
                  televisao.ligar();
            } 

            System.out.println("Dejesa ligar a Lampada? (S/N)");
            String respostaLampada = sc.nextLine();
            if (respostaLampada.equalsIgnoreCase("s")) {
                  lampada.ligar();
            } 

            System.out.println("Estado da televisão: "+ (televisao.estaligada() ? "Ligada" : "Desligada" ));
            System.out.println("Estado da televisão: "+ (lampada.estaligada() ? "Ligada" : "Desligada" ));

            sc.close();
      }
}
