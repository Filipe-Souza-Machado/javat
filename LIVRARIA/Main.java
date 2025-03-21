import java.util.ArrayList;
import java.util.Scanner;

public class Main {

      public void exibirmenu(){
            System.err.println("---Menu livraria---");
            System.out.println("1- Adicionar um novo livro ao sistema.");
            System.out.println("2- Listar todos os livros cadastrados.");
            System.out.println("3- Alterar as informações de um livro existente (por título).");
            System.out.println("4- Remover um livro do sistema (por título).");
            System.out.println("5- Encerrar o programa.");
      }

      public static void main(String[] args) {
            Main mainInstance = new Main();
            Scanner sc = new Scanner(System.in);
            ArrayList<Livro> livros = new ArrayList<>();
            
            int opcao = 0;

            while (opcao!= 5) {
                  mainInstance.exibirmenu();
                  System.out.println("Escolha uma opção: ");
                  opcao = sc.nextInt();
                  sc.nextLine();

                  boolean livroEncontrado = false; 
                  switch (opcao) {
                        case 1:
                              System.out.println("Digite o titulo do livro: ");
                              String titulo =sc.nextLine();

                              System.out.println("Digite o nome do autor: ");
                              String autor =sc.nextLine();

                              System.out.println("Digite o ano de publicação: ");
                              int anoPublicacao =sc.nextInt();
                              sc.nextLine();
                              
                              System.out.println("Digite o preço: ");
                              double preco =sc.nextDouble();

                              livros.add(new Livro(titulo, autor, anoPublicacao, preco));
                              System.out.println("Livro cadastrado");
                              break;

                        case 2:
                              if (livros.isEmpty()) {
                                    System.out.println("Nenhum livro cadastrado.");

                              }else{
                                    System.out.println("---------Livros cadastrados-----------");
                                    for (Livro l : livros) {
                                          l.exibirInformacoes();
                                    }
                              }
                              break;

                        case 3:
                              if (livros.isEmpty()) {
                                    System.out.println("Nenhum livro cadastrado.");

                              }else{
                                    System.out.println("Digite o titulo do livro: ");
                                    String tituloalterado = sc.nextLine();

                                    livroEncontrado = false;
                                    for (Livro l : livros) {
      
                                          if (l.getTitulo().equalsIgnoreCase(tituloalterado)) {
                                                System.out.println("Novo titulo: ");
                                                l.setTitulo(sc.nextLine());

                                                System.out.println("Novo autor: ");
                                                l.setAutor(sc.nextLine());

                                                System.out.println("Novo ano de publicação: ");
                                                l.setAnoPublicacao(sc.nextInt());

                                                System.out.println("Novo preço: ");
                                                l.setPreco(sc.nextDouble());    

                                                System.out.println("Livro alterado com sucesso!!!");
                                                livroEncontrado = true;
                                                break;
                                          }                                  
                                    }     
                                    if (livroEncontrado != true) {
                                          System.out.println("Livro não encotrado");
                                    }                               
                              }
                              break;

                        case 4:
                              if (livros.isEmpty()) {
                                    System.out.println("Nenhum livro cadastrado.");

                              }else{
                                    System.out.println("Digite o titulo do livro: ");
                                    String tituloRemover = sc.nextLine();

                                    livroEncontrado = false;
                                    
                                    for (int i = 0; i < livros.size(); i++) {
                                          if (livros.get(i).getTitulo().equalsIgnoreCase(tituloRemover)) {
                                                livros.remove(i);
                                                livroEncontrado = true;
                                                System.out.println("Livro removido com sucesso!");
                                                break;
                                          }                  
                                    }                                  
                              }

                              if(livroEncontrado != true){
                                    System.out.println("Livro não encontrado!");
                              }    
                              break;  

                        case 5:
                              System.out.println("Saindo da livraria.");
                              break;
                  
                        default:
                              System.out.println("Opção inválida. Tente novamente.");
                              break;
                  }
            }
            sc.close();
      }
}