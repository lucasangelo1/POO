package pack;

import java.util.Random;




public class Campeonato{


public static int partida(Clube time1,Clube time2){
    Random random = new Random();
    int g1 =random.nextInt(5);
    int g2 =random.nextInt(5);
    Clube.saldo(time1, g1);
    Clube.saldo(time2, g2);
    if (g1>g2){
        return 1;
    }
    if(g2>g1){
        return 2;

    }
    else{
        return 0;
    }

}



    
}

