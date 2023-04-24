
import Repositorio.*;

import pack.*;


public class gerenciamento {
    public static void main(String[] args) throws Exception {
        Aluno.cadastraralunos();
        Aluno.cadastraralunos();
        RepositorioAluno.exibiralunos();
        RepositorioAluno.excluirAluno(RepositorioAluno.procurarAluno());
        RepositorioAluno.exibiralunos();
        //RepositorioAluno.retirarlivro(RepositorioAluno.procurarAluno());
        
        
    
        

    
    }
}
