package Repositorio;
import pack.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RepositorioAluno {
    static ArrayList<Aluno> aluno=new ArrayList<Aluno>();
    public static int i=0;
    static Scanner scanner = new Scanner(System.in);
    public RepositorioAluno(){
        aluno=new ArrayList<Aluno>(); 
    }
    public static void adiciona(Aluno A){
        aluno.add(A);
    }
    public static void exibiralunos(){
        for (int i=0; i < (aluno.size()); i++){
            System.out.println(aluno.get(i).getNome());
        }
    }
    public static void emprestimoLivro(){
        String cpf;
        Aluno aluno;
        int j=-1;
        System.out.println("digite o cpf do aluno");
        cpf=scanner.next();
        for(int i=0;i<(aluno.size());i++){
            if (((aluno.get(i).getDocumento())==cpf){
                j=i;
            }
        }
        if (j!=-1){

        }
        System.out.println("Digite o nome do Livro a ser emprestado :");
        String nome= scanner.next();
        System.out.println("Digite o nome do Autor do Livro a ser emprestado :");
        String escritor =scanner.next();
        String data= "1";
        books[i]= new Livro(nome, escritor,data);
        i++;
    }


}
