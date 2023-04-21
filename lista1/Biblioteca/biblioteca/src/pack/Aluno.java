package pack;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends usuario {

    
    public int i;
    Scanner scanner = new Scanner(System.in);

    public Aluno(String name, String cpf) {
        super(name, cpf);

    }
    /*public Aluno(String name, String emails, String phone, String atributo, String log, String code, String cpf) {
        super(name, emails, phone, atributo, log, code, cpf);

    }*/

    public void exibirLivros(books[]){
        for (int j; j<books.length; j++ ){
            System.out.println("nome do livro: "+books[i].nome+"nome do autor: "+books[i].autor+" data de delucao"+ books[i].dataDevolucao);
        }
    }
    public void renovarLivro(){


    }



    
}