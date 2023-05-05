package pack;

public class Clube{
    public String nome;
    public int pontos;
    public int saldoGols;
    public Clube(String n){
        this.nome=n;
    }

    public static void ganhou(Clube time){
        time.pontos=time.pontos+3;
    }
    public static void empatou(Clube time){
        time.pontos++;
    }
    public static void saldo(Clube time,int a){
        time.saldoGols= time.saldoGols+a;
    }


}