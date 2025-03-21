import java.util.ArrayList;
import java.util.List;

public class CadastroDeContas {
      private List<Conta> contas = new ArrayList<>();

      private static final int LIMITE_MAXIMO = 100; // Exemplo de limite

      public void inserir(Conta conta) throws ExcecaoRepositorio, ExcecaoElementoJaExistente {
            if (contas.size() >= LIMITE_MAXIMO) {
                  throw new ExcecaoRepositorio("Limite maximo de contas atingido!");

            }

            for(Conta c : contas){
                  if (c.getNumero().equals(conta.getNumero())) {
                        throw new ExcecaoElementoJaExistente("Limite maximo de contas atingido!");
                  }
            }

            contas.add(conta);
      }

      public Conta buscar(String numero) throws ExcecaoElementoInexistente{
            for(Conta c : contas){
                  if (c.getNumero().equals(numero)) {
                        return c;
                  }
            }
            throw new ExcecaoElementoInexistente("Conta não encontrada.");
      }
      public void remover(String numero) throws ExcecaoElementoInexistente{
            Conta conta = buscar(numero);
            contas.remove(conta);
      }
}

/*
 * import java.util.ArrayList;
import java.util.List;

public class CadastroContas {
    private List<Conta> contas = new ArrayList<>();
    private static final int LIMITE_MAXIMO = 100; // Exemplo de limite

    public void inserir(Conta conta) throws ExcecaoRepositorio, ExcecaoElementoJaExistente {
        if (contas.size() >= LIMITE_MAXIMO) {
            throw new ExcecaoRepositorio("Limite máximo de contas atingido.");
        }
        for (Conta c : contas) {
            if (c.getNumero().equals(conta.getNumero())) {
                throw new ExcecaoElementoJaExistente("Conta já existe.");
            }
        }
        contas.add(conta);
    }

    public Conta buscar(String numero) throws ExcecaoElementoInexistente {
        for (Conta c : contas) {
            if (c.getNumero().equals(numero)) {
                return c;
            }
        }
        throw new ExcecaoElementoInexistente("Conta não encontrada.");
    }

    public void remover(String numero) throws ExcecaoElementoInexistente {
        Conta conta = buscar(numero);
        contas.remove(conta);
    }
}
 */