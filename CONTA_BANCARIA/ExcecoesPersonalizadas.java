public class ExcecaoDadoInvalido extends Exception {
      public ExcecaoDadoInvalido(String mensagem) {
          super(mensagem);
      }
  }
  
  public class ExcecaoRepositorio extends Exception {
      public ExcecaoRepositorio(String mensagem) {
          super(mensagem);