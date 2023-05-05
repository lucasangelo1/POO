package pack;
import Repositorio.*;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;




public class gerente extends usuario {
    public Livro books[];
    static Scanner scanner = new Scanner(System.in);
    public gerente(String name, String cpf) {
        super(name, cpf);
    }
   
    public static void cadastraralunos(){
        String name,matricula;
        System.out.println("Digite o nome do aluno :");
        name= scanner.next();
        System.out.println("Digite a matricula do aluno :");
        matricula= scanner.next();
        Aluno aluno1=new Aluno(name,matricula);
        RepositorioAluno.adiciona(aluno1);
    }
    
    public static void excluirAluno(int i){
        System.out.println("=========================================");
        if (i==-5){
            System.out.println("Não há Alunos cadastrados");
            System.out.println("=========================================");

        }
       else{

        RepositorioAluno.getAluno().remove(i);
        System.out.println("Aluno removido com sucesso");
        System.out.println("=========================================");
    
       }


    }
    public static void exibiralunos(){
        System.out.println("=========================================");
        if (RepositorioAluno.getAluno().isEmpty()){
            
            System.out.println("Não há Alunos cadastrados");
            System.out.println("=========================================");
        }
        else{
            for (int i=0; i < (RepositorioAluno.getAluno().size()); i++){
                System.out.println((i+1)+"º Aluno: "+RepositorioAluno.getAluno().get(i).getNome());
                System.out.println("Matricula:"+RepositorioAluno.getAluno().get(i).getDocumento());
                System.out.println("=========================================");
            }

        }
        
    }


    public static void emprestarlivro(int i){
        System.out.println("=========================================");
        if (i==-5){
            
            System.out.println("Não há Alunos cadastrados");
            System.out.println("=========================================");
        }
        else{
            String titulo,escritor;
            int codigo;
            LocalDate data=LocalDate.of(2023,4,26);
            System.out.println("Digite o titulo do Livro a ser emprestado :");
            titulo= scanner.next();
            System.out.println("Digite o nome do Autor do Livro a ser emprestado :");
            escritor =scanner.next();
            System.out.println("Digite o codigo do Livro a ser emprestado :");
            codigo =scanner.nextInt();
            //j=RepositorioAluno.getAluno().get(i).contadorLivro;
            Livro livro1 =new Livro(titulo, escritor, data, codigo);
            RepositorioAluno.getAluno().get(i).book.add(livro1);
            RepositorioAluno.getAluno().get(i).contadorLivro++;
            System.out.println("=========================================");
        }
       
    }
    public static void livroAtrasado(int i){



    }

    public static void removelivros(int codigo , int i){
        for(int j=0 ;j<((RepositorioAluno.getAluno().get(i).book.size()));j++){
            if ((RepositorioAluno.getAluno().get(i).book.get(j).codigodebarras)==(codigo)){
                RepositorioAluno.getAluno().get(i).book.remove(j);
                System.out.println("codigo");
            }


        }

    }
    public static void removelivros(String codigo,int i){
        for(int j=0 ;j<((RepositorioAluno.getAluno().get(i).book.size()));j++){
            if ((RepositorioAluno.getAluno().get(i).book.get(j).nome).equals(codigo)){
                RepositorioAluno.getAluno().get(i).book.remove(j);
                System.out.println("nome");
            }


        }

    }


    public static void retirarlivro(int i){
        String codigo;
        System.out.println("=========================================");
        if (i==-5){
            
            System.out.println("Não há Alunos cadastrados");
            System.out.println("=========================================");
        }
        else{
            if(RepositorioAluno.getAluno().get(i).book.isEmpty()){
                System.out.println("Não há livros cadastrados");
                System.out.println("=========================================");

                
            }
            else{
            
            System.out.println("digite o nome ou codigo do livro que deseja retirar");
            codigo=scanner.next();
            removelivros(Integer.parseInt(codigo), i);
            
            
            }
            
            /*
            for (int j=0;j<((RepositorioAluno.getAluno().get(i).book.size()));j++){
                if ((RepositorioAluno.getAluno().get(i).book.get(j).nome).equals(nomeLivro)){
                    RepositorioAluno.getAluno().get(i).book.remove(j);
                }
            }
            System.out.println("Livro retirado com sucesso");
            System.out.println("=========================================");

            }*/
            
        
        }
       
    }

    public static void exibirlivros(int i){
        System.out.println("=========================================");
        if(i==-5){
            System.out.println("Não há Alunos cadastrados");
            System.out.println("=========================================");

        }
       else{
        if(RepositorioAluno.getAluno().get(i).book.isEmpty()){
            System.out.println("Não há livros emprestado para este Aluno");
            System.out.println("=========================================");
        }
        else{

            for (int j=0; j<((RepositorioAluno.getAluno().size()));j++ ){
                System.out.println((j+1)+"º Livro: "+RepositorioAluno.getAluno().get(i).book.get(j).nome);
                System.out.println(("Código do livro:  "+RepositorioAluno.getAluno().get(i).book.get(j).codigodebarras));
                System.out.println("=========================================");
            }

        }

       }
        
       

    }
    
    

    
}
