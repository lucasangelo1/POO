package Repositorio;
import pack.*;
import java.util.ArrayList;

public class RepositorioGerente {
    static ArrayList<gerente> gerente=new ArrayList<gerente>();
    public static int i=0;

    public RepositorioGerente(){
        gerente=new ArrayList<gerente>(); 
    }
    public static void adiciona(gerente A){
        gerente.add(A);
    }
    public static void exibirgerente(){
        for (int i=0; i < (gerente.size()); i++){
            System.out.println(gerente.get(i).getNome());
            System.out.println(gerente.get(i).getDocumento());
        }
    }
    
}
