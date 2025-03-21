import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Coletando dados do comprimento do retangulo
            System.out.println("Digite o comprimento do retangulo: ");
            double rCom = sc.nextDouble();

            // Coletando dados da largura do retangulo
            System.out.println("Digite o largura do retangulo: ");
            double rLar = sc.nextDouble();

            // Criando um retângulo com os dados obtidos
            FormaGeometrica retangulo = new Retangulo(rCom, rLar);
            System.out.println("Area retangulo: "+retangulo.calcularArea());

            // Coletando dados do raio do circulo
            System.out.println("Digite o raio do circulo: ");
            double cRaio = sc.nextDouble();

            // Criando um circulo com os dados obtidos
            FormaGeometrica circulo = new Circulo(cRaio);
            System.out.println("Area do circulo: "+circulo.calcularArea());

            sc.close();
      }
}
