package Repositorio;
import pack.*;
import java.util.ArrayList;

public class RepositorioAluno {
    private ArrayList<Aluno> aluno;
    public RepositorioAluno(){
        this.aluno=new ArrayList<Aluno>(); 
    }
    public void adiciona(Aluno A){
        this.aluno.add(A);
    }

}
