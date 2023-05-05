package Repositorio;
import pack.*;
import java.util.ArrayList;
import java.util.Scanner;


public class RepositorioAluno {
    
    public static ArrayList<Aluno> aluno=new ArrayList<Aluno>();
    
    static Scanner scanner =new Scanner(System.in);
    public static int k;
    public RepositorioAluno(){
        aluno=new ArrayList<Aluno>(); 
    }
    public static void adiciona(Aluno A){
        aluno.add(A);
    }
   
    public static int procurarAluno(){
        String matricula;
        int j=-1;
        if (RepositorioAluno.getAluno().isEmpty()){
            
            System.out.println("Não há Alunos cadastrados");
            System.out.println("=========================================");
            j=-5;
            return j;
        }
        else{
            System.out.println("digite a matricula do aluno ");
            matricula=scanner.next();
            while ( j==-1){
                for(int i=0;i<(aluno.size());i++){
                    if (matricula.equals(aluno.get(i).getDocumento())){
                        j=i;
                        return j;
                    }

                }
        
            }
    
            System.out.println("Matricula invalida verifique o numero e digite novamente: ");  
            matricula=scanner.next();

        }

        
    
        return j;
        
            
    }
    //get e setter zone
    public static ArrayList<Aluno> getAluno() {
        return aluno;
    }
    public static void setAluno(ArrayList<Aluno> aluno) {
        RepositorioAluno.aluno = aluno;
    }
   

    
}

















