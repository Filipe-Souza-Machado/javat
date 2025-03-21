public class Circulo extends FormaGeometrica{
      private double raio;

      // Construtor
      public Circulo(double raio) {
            this.raio = raio;
      }

      // Implementação do método calcularArea
      @Override
      public double calcularArea(){

            // Área do círculo: π * r²
            return Math.PI * raio;
      }
}