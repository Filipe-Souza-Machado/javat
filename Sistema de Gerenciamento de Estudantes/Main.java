import java.util.Scanner;

public class Main {

    public void menuEscolar() {
        System.out.println("---Sistema escolar---");
        System.out.println("1-Cadastrar aluno");
        System.out.println("2-Mostrar alunos cadastrados");
        System.out.println("3-Atualizar informações do aluno");
        System.out.println("4- Remover aluno");
        System.out.println("5- Sair");
        System.out.println("------------------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        Escola escola = new Escola();

        while (true) {
            mainInstance.menuEscolar();
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    try {

                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    System.out.println("Digite o nome do aluno:");
                    String nome = sc.nextLine();

                    System.out.println("Digite a matricula:");
                    String matricula = sc.nextLine();

                    System.out.println("Digite o curso:");
                    String curso = sc.nextLine();

                    System.out.println("Digite o ano da matricula:");
                    int anoIngresso = sc.nextInt();
                    sc.nextLine();

                    Estudante estudante = new Estudante(nome, matricula, curso, anoIngresso);
                    escola.adicionarEstudante(estudante);

                    break;

                case 2:
                    escola.listarEstudantes();
                    break;

                case 3:
                    System.out.println("Digite a matricula do aluno:");
                    String atualizarAluno = sc.nextLine();
                    escola.alterarInformacoes(atualizarAluno);
                    break;

                case 4:
                    escola.removerAluno();
                    break;

                case 5:
                    System.out.println("Saindo....");
                    sc.close();
                    break;

                default:
                    break;
            }
        }
    }
}