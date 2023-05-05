package pack;
import java.util.ArrayList;
import java.util.Scanner;
import Repositorio.*;

public class Aluno extends usuario {

    
    public int i;
    static Scanner scanner = new Scanner(System.in);
    public  ArrayList<Livro> book= new ArrayList<Livro>();
    public int contadorLivro;

    public Aluno(String name, String matricula) {
        super(name, matricula);

    }

}