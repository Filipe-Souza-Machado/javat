import java.util.ArrayList; // Importa a classe ArrayList para usar listas dinâmicas
import java.util.Scanner;// Importa a classe Scanner para leitura de entrada do usuário

public class Escola {

      // Scanner para ler a entrada do usuário
      Scanner sc = new Scanner(System.in);

      // Lista que armazena os estudantes cadastrados
      ArrayList<Estudante> estudantes = new ArrayList<>();
      
      // Variável para verificar se um aluno foi encontrado durante a busca
      Boolean alunoEncontrado = false;

      // Construtor da classe Escola
      public Escola() {
            // Inicializa a lista de estudantes (já é feita na declaração)
            estudantes = new ArrayList<>();
      }

      // Método para adicionar um estudante à lista
      public void adicionarEstudante(Estudante estudante) {
            estudantes.add(estudante);// Adiciona o estudante à lista
            System.out.println("Estudante adicionado com sucesso!");// Mensagem de confirmação
            System.out.println("------------------------------------------------------");
            System.out.println();
      }

      // Método para listar todos os estudantes cadastrados
      public void listarEstudantes() {

            // Verifica se a lista de estudantes está vazia
            if (estudantes.isEmpty()) {
                  System.out.println("Nenhum estudante cadastrado!");// Mensagem se não houver estudantes
            } else {
                  for (Estudante e : estudantes) {
                        System.out.println("----Estudantes cadastrados---");// Cabeçalho da listagem
                        e.exibirInformacoes();// Chama o método para exibir informações do estudante
                  }
            }
            System.out.println("------------------------------------------------------");
            System.out.println();
      }

      // Método para alterar as informações de um estudante com base na matrícula
      public void alterarInformacoes(String matricula) {

            alunoEncontrado = false;// Reseta a variável para verificar se o aluno foi encontrado

            // Verifica se a lista de estudantes está vazia
            if (estudantes.isEmpty()) {
                  System.out.println("Nenhum aluno foi cadastrado!");// Mensagem se não houver estudantes
            } else {
                  // Itera sobre a lista de estudantes
                  for (Estudante estudante : estudantes) {
                        if (estudante.getMatricula().equals(matricula)) {

                              System.out.print("Novo nome: ");
                              estudante.setNome(sc.nextLine());

                              System.out.print("Novo curso: ");
                              estudante.setCurso(sc.nextLine());

                              System.out.print("Novo ano de ingresso: ");
                              estudante.setAnoIngresso(sc.nextInt());

                              System.out.println("Informações alteradas com sucesso!");
                              return;
                        }
                  }
            }
            if (alunoEncontrado != true) {
                  System.out.println("Estudante com matrícula " + matricula + " não encontrado.");
            }
            System.out.println("------------------------------------------------------");
            System.out.println();
      }

      public void removerAluno() {
            if (estudantes.isEmpty()) {
                  System.out.println("Nenhum aluno foi cadastrado!");
            } else {
                  System.out.print("Digite a matrícula do aluno que deseja remover: ");
                  String matricula = sc.nextLine();
                  boolean alunoRemovido = false;

                  for (int i = 0; i < estudantes.size(); i++) {
                        if (estudantes.get(i).getMatricula().equals(matricula)) {
                              estudantes.remove(i);
                              alunoRemovido = true;
                              System.out.println("Estudante removido com sucesso!");
                              break;
                        }
                  }

                  if (alunoRemovido != true) {
                        System.out.println("Estudante com matrícula " + matricula + " não encontrado.");
                  }
            }
            System.out.println("------------------------------------------------------");
            System.out.println();
      }
}