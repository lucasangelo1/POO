package Repositorio;
import pack.*;
import java.util.ArrayList;
import java.util.Scanner;


public class RepositorioAluno {
    static ArrayList<Aluno> aluno=new ArrayList<Aluno>();
    static Scanner scanner =new Scanner(System.in);
    public static int k;
    public RepositorioAluno(){
        aluno=new ArrayList<Aluno>(); 
    }
    public static void adiciona(Aluno A){
        aluno.add(A);
    }
    public static void exibiralunos(){
        for (int i=0; i < (aluno.size()); i++){
            System.out.println(aluno.get(i).getNome());
            System.out.println(aluno.get(i).getDocumento());
        }
    }
    public static int procurarAluno(){
        String cpf;
        int j=-1;
        System.out.println("digite o CPF do aluno ");
        cpf=scanner.next();
        while ( j==-1){
            for(int i=0;i<(aluno.size());i++){
                if (cpf.equals(aluno.get(i).getDocumento())){
                    j=i;
                    return j;

                }
        
            }
    
            System.out.println("CPF invalido digite outro CPF: ");  
            cpf=scanner.next();

        }
        return j;
            
    }
    
    public static void emprestarlivro(int i){
        String nome,escritor,data;
        int j;
        System.out.println("Digite o nome do Livro a ser emprestado :");
        nome= scanner.next();
        System.out.println("Digite o nome do Autor do Livro a ser emprestado :");
        escritor =scanner.next();
        data= "1";
        j=aluno.get(i).contadorLivro;
        Livro livro1 =new Livro(nome, escritor, data);
        aluno.get(i).book.add(livro1);
        aluno.get(i).contadorLivro++;
    }

    public static void excluirAluno(int i){
        aluno.remove(i);


    }


    public static void retirarlivro(int i){
        String nomeLivro;
        
        System.out.println("digite o nome do livro que deseja retirar");
        nomeLivro=scanner.next();
        for (int j=0;j<((aluno.get(i).book.size()));j++){
            if ((aluno.get(i).book.get(j).nome).equals(nomeLivro)){
                    aluno.get(i).book.remove(j);
            }
        }
        

    


    }
    public static void exibirlivros(int i){
        for (int j=0; j<((aluno.get(i).contadorLivro));j++ ){
            System.out.println(aluno.get(i).book.get(j).nome);

        }

    }

    
}

















