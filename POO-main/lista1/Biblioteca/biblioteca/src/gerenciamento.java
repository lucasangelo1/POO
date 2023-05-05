
import Repositorio.*;

import pack.*;
import java.util.*;

public class gerenciamento {
    public static int tela() {
        Scanner scanner =new Scanner(System.in);
        int op;
        System.out.println("=================================================================");
        System.out.println("Digite alguma das opções abaixo para executar a seguir: ");
        System.out.println("1- Para cadastrar aluno");
        System.out.println("2- Para excluir o aluno");
        System.out.println("3- Para visualizar todos os alunos");
        System.out.println("4- Para emprestar um livro ao aluno");
        System.out.println("5- Para devolver um livro");
        System.out.println("6- Para visualizar todos o livros emprestados a um aluno");
        System.out.println("7- Sair");
        op=scanner.nextInt();
        System.out.println("=================================================================");
        return(op);
    }

    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
        int op=0;
        System.out.println("=======================================================================");
        System.out.println("Seja bem vindo(a) ao sitema de biblioteca comunitaria");
        System.out.println("Por ser o primeiro acesso por gentileza crie o cadastro do gerente");
        RepositorioGerente.cadastrarGerente();
        System.out.println("=======================================================================");
        while( op!=-1){
            op=tela();
            if (op==1){
                gerente.cadastraralunos();
            }
            if(op==2){
                gerente.excluirAluno(RepositorioAluno.procurarAluno());
                System.out.println("Aluno excluido com sucesso");
            }
            if(op==3){
                gerente.exibiralunos();
            }
            if(op==4){
                gerente.emprestarlivro(RepositorioAluno.procurarAluno());
            }
            if(op==5){
                gerente.retirarlivro(RepositorioAluno.procurarAluno());
            }
            if(op==6){
                gerente.exibirlivros(RepositorioAluno.procurarAluno());
            }
            if(op==7){
                System.out.println("Obrigado por utilizar nossos serviços");
                op=-1;
            }
        }
    }
}