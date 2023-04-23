package pack;
import Repositorio.*;
import java.util.Scanner;




public class gerente extends usuario {
    public Livro books[];
    static Scanner scanner = new Scanner(System.in);
    public gerente(String name, String cpf) {
        super(name, cpf);
    }
   /*  public gerente(String name, String emails, String phone, String atributo, String log, String code, String cpf) {
        super(name, emails, phone, atributo, log, code, cpf);
    }*/
    public static void cadastrarGerente(){
        String name,emails,phone,atributo,log,code,cpf;

        atributo= "Gerente";
        System.out.println("Digite o nome do gerente :");
        name= scanner.next();
        /*System.out.println("Digite o email do gerente :");
        emails= scanner.next();
        System.out.println("Digite o telefone do gerente :");
        phone= scanner.next();    
        System.out.println("Digite um login para o gerente :");
        log= scanner.next();
        System.out.println("Digite uma senha para o gerente :");
        code= scanner.next();*/
        System.out.println("Digite o cpf do gerente :");
        cpf= scanner.next();
        //gerente gerente= new gerente(name,emails,phone,atributo,log,code,cpf);
        gerente gerente= new gerente(name,cpf);
        RepositorioGerente.adiciona(gerente);

    }
    
    

    
}
