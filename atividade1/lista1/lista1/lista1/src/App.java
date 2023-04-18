
//import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import pack.Campeonato;
import pack.Clube;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
      

        Clube Time1= new Clube ("Ases da Chuteira FC");
        Clube Time2= new Clube ("Foguetes do Gramado FC");
        Clube Time3= new Clube ("Dragões da Bola FC");
        Clube Time4= new Clube ("Chute ao Alvo FC");
        Clube Time5= new Clube ("Os Moscas FC");
        Clube Time6= new Clube ("Hooligans FC");
        Clube Time7= new Clube ("Os Defensores FC");
        Clube Time8= new Clube ("Capivaras FC");
        //Clube Time9= new Clube ("Farofas FC");

        List<Clube> tabela= new Vector<>();
        tabela.add((Time1));
        tabela.add((Time2));
        tabela.add((Time3));
        tabela.add((Time4));
        tabela.add((Time5));
        tabela.add((Time6));
        tabela.add((Time7));
        tabela.add((Time8));
        for(int i=0;i< 8; i++){
            for (int j=0;j<8 ;j++){
                if (i!=j){
                    if ((Campeonato.partida(tabela.get(i),tabela.get(j))==1)){
                        Clube.ganhou(tabela.get(i));
                    }
                    if ((Campeonato.partida(tabela.get(i),tabela.get(j))==2)){
                        Clube.ganhou(tabela.get(j));
                    }
                    else{
                       Clube.empatou(tabela.get(i));
                       Clube.empatou(tabela.get(j));
                    }
                }

            }
        }

        System.out.println((tabela.get(1)).nome);



    
    }
}
