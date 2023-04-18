package pack;

import java.util.Random;




public class Campeonato{

public static void participantes(Clube[] tabela){
    Clube Time1= new Clube ("Ases da Chuteira FC");
    Clube Time2= new Clube ("Foguetes do Gramado FC");
    Clube Time3= new Clube ("Dragões da Bola FC");
    Clube Time4= new Clube ("Chute ao Alvo FC");
    Clube Time5= new Clube ("Os Moscas FC");
    Clube Time6= new Clube ("Hooligans FC");
    Clube Time7= new Clube ("Os Defensores FC");
    Clube Time8= new Clube ("Capivaras FC");

    tabela[0]=Time1;
    tabela[1]=Time2;
    tabela[2]=Time3;
    tabela[3]=Time4;
    tabela[4]=Time5;
    tabela[5]=Time6;
    tabela[6]=Time7;
    tabela[7]=Time8;


}

public static void start(Clube[] tabela) {
    for(int i=0;i< 8; i++){
        for (int j=0;j<8 ;j++){
            if (i!=j){
                if ((Campeonato.partida(tabela[i],tabela[j])==1)){
                    Clube.ganhou(tabela[i]);
                }
                if ((Campeonato.partida(tabela[i],tabela[j])==2)){
                    Clube.ganhou(tabela[j]);
                }
                else{
                   Clube.empatou(tabela[i]);
                   Clube.empatou(tabela[j]);
                }
            }

        }
    }
    
}

public static int partida(Clube time1,Clube time2){
    Random random = new Random();
    int golstime1 =random.nextInt(5);
    int golstime2 =random.nextInt(5);
    int golsaldo;
    

    if (golstime1>golstime2){
        golsaldo=golstime1-golstime2;
        Clube.saldo(time1, golsaldo);
        return 1;
    }
    if(golstime1>golstime2){
        golsaldo=golstime2-golstime1;
        Clube.saldo(time2, golsaldo);      
        return 2;

    }
    else{
        return 0;
    }

}

public static void ordena(Clube[] tabela){
    
    int i;
    int j;
    Clube key =  new Clube("teste");
    for (i =0 ; i < 8; i++){
      for (j=0 ; j<7; j++){
        if ((tabela[j].pontos)<(tabela[j+1].pontos)){
            key=tabela[j];
            tabela[j]=tabela[j+1];
            tabela[j+1]=key;
        }
        if ((tabela[j].pontos)==(tabela[j+1].pontos)){
            if ((tabela[j].saldoGols)<(tabela[j+1].saldoGols)){
                key=tabela[j];
                tabela[j]=tabela[j+1];
                tabela[j+1]=key;
            }

        }
        
    }        

}

}
public static void imprimir(Clube[] tabela){
    int l;
    for (l=0; l < 8; l++){
        System.out.println((l+1)+"º Colocado é: "+ tabela[l].nome+" seus pontos são: "+tabela[l].pontos+" o saldo de gols é :"+tabela[l].saldoGols);

    }


}




    
}

