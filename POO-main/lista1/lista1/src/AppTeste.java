import pack.Campeonato;
import pack.Clube;



public class AppTeste {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
      
        Clube[] tabela= new Clube[8];

        Campeonato.participantes(tabela);
        Campeonato.start(tabela);
        Campeonato.ordena(tabela);
        Campeonato.imprimir(tabela);
    }
}
