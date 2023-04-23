
import Repositorio.*;

import pack.*;


public class gerenciamento {
    public static void main(String[] args) throws Exception {
        Aluno.cadastraralunos();
        Aluno.cadastraralunos();
        RepositorioAluno.emprestarlivro(RepositorioAluno.procurarAluno());
        RepositorioAluno.emprestarlivro(RepositorioAluno.procurarAluno());
        RepositorioAluno.exibirlivros(RepositorioAluno.procurarAluno());
        RepositorioAluno.exibirlivros(RepositorioAluno.procurarAluno());
        
        //RepositorioAluno.retirarlivro(RepositorioAluno.procurarAluno());
        
        
    
        

    
    }
}
