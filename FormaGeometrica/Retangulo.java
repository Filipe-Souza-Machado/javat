public class Retangulo extends FormaGeometrica{
      private double comprimento;
      private double largura;

      // Construtor
      public Retangulo(double comprimento, double largura) {
            this.comprimento = comprimento;
            this.largura = largura;
      }
      
      // Implementação do método calcularArea
      @Override
      public double calcularArea(){
            return comprimento * largura;
      }
}