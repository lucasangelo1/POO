package pack;
import java.util.ArrayList;
import java.util.Scanner;
import Repositorio.*;

public class Aluno extends usuario {

    
    public int i;
    static Scanner scanner = new Scanner(System.in);
    public  ArrayList<Livro> book= new ArrayList<Livro>();
    public int contadorLivro;

    public Aluno(String name, String cpf) {
        super(name, cpf);

    }
    /*public Aluno(String name, String emails, String phone, String atributo, String log, String code, String cpf) {
        super(name, emails, phone, atributo, log, code, cpf);

    }*/
    public static void cadastraralunos(){
        String name,emails,phone,atributo,log,code,cpf;

        atributo= "Aluno";
        System.out.println("Digite o nome do aluno :");
        name= scanner.next();
       /* System.out.println("Digite o email do aluno :");
        emails= scanner.next();
        System.out.println("Digite o telefone do aluno :");
        phone= scanner.next();    
        System.out.println("Digite um login para o aluno :");
        log= scanner.next();
        System.out.println("Digite uma senha para o aluno :");
        code= scanner.next();*/
        System.out.println("Digite o cpf do aluno :");
        cpf= scanner.next();
        //Aluno aluno1= new Aluno(name,emails,phone,atributo,log,code,cpf);
        Aluno aluno1=new Aluno(name,cpf);
        RepositorioAluno.adiciona(aluno1);
    } 



    


    
}