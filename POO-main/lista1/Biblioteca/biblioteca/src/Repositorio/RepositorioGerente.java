package Repositorio;
import pack.*;
import java.util.ArrayList;
import java.util.Scanner;

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
    public static void cadastrarGerente(){
        Scanner scanner= new Scanner(System.in);
        String name,documento;

        System.out.println("Digite o nome do gerente :");
        name= scanner.next();
        System.out.println("Digite o registro do gerente :");
        documento= scanner.next();
        gerente gerente= new gerente(name,documento);
        RepositorioGerente.adiciona(gerente);

    }
    
}
