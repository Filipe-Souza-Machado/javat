import java.util.ArrayList;
import java.util.Scanner;

public class LojaCamisa {
      public void menu(){
            System.out.println("\n::::Menu::::");
            System.out.println("1-Cadastrar");
            System.out.println("2-Listar");
            System.out.println("3-Remover");
            System.out.println("4-Sair");
            System.out.println("Escolha uma opção: "); 
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Camisa> camisas = new ArrayList<>();

            LojaCamisa loja = new LojaCamisa(); // Criar uma instância da classe LojaCamisa
            int op = 0;
            
            while (op != 4) {
                  loja.menu();
                  op = sc.nextInt();
                  sc.nextLine();

                  switch (op) {
                        case 1:
                              System.out.println("Digite a cor da camisa: ");
                              String cor = sc.nextLine();

                              System.out.println("Digite a tamanho da camisa: ");
                              String tamanho = sc.nextLine();

                              System.out.println("Digite a tipo da camisa: ");
                              String tipo = sc.nextLine();

                              camisas.add(new Camisa(cor, tamanho, tipo));
                              System.out.println("Camisas cadastradas com sucesso!!!");

                              break;

                        case 2:
                              int contagem = 0; // Inicializa a contagem fora do loop

                              for (Camisa c : camisas) {
                                    contagem++; // Incrementa a contagem
                                    System.out.println("---------------------------");
                                    System.out.println(contagem + "° Camisa:");
                                    System.out.println("Cor: " + c.getCor());
                                    System.out.println("Tamanho: " + c.getTamanho());
                                    System.out.println("Tipo: " + c.getTipo());
                                    System.out.println("---------------------------");
                              }
                              
                              break;
                  
                        case 3:
                              if (camisas.isEmpty()) {
                                    System.out.println("Nenhuma camisa foi cadastrada.");

                              }else{
                                    System.out.println("Digite o indice que quer remover: ");
                                    int remorerCamisa = sc.nextInt();

                                    if (remorerCamisa>=0 && remorerCamisa<=camisas.size()) {
                                          camisas.remove(remorerCamisa);
                                          System.out.println("Camisas removidas com sucesso!!!");
                                    }
                              }
                              break;
                  
                        case 4:
                              System.out.println("Saindo.......");
                              break;
                  
                        default:
                              break;
                  }
            }
            sc.close();
      }
}

/*O seu código está quase completo e funcional, mas há alguns pontos que podem ser melhorados ou corrigidos. Vou destacar algumas correções e melhorias que você pode considerar:

Correção na Remoção de Camisas:

O índice que você está verificando para remoção deve ser menor que camisas.size(), mas não deve incluir o tamanho da lista, pois os índices começam em 0. Portanto, a condição correta deve ser removerCamisa >= 0 && removerCamisa < camisas.size().
Melhorar a Mensagem de Remoção:

Após a remoção, você pode querer informar ao usuário quantas camisas restam ou confirmar a remoção de forma mais clara.
Tratamento de Exceções:

É uma boa prática tratar exceções, especialmente ao lidar com entradas do usuário. Você pode usar um bloco try-catch para capturar entradas inválidas.
Classe Camisa:

Certifique-se de que a classe Camisa está definida corretamente com os métodos getCor(), getTamanho(), e getTipo().
Aqui está o código atualizado com as correções e melhorias mencionadas:

java
 */