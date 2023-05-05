package pack;

import java.time.LocalDate;

public class Livro {
    public String nome;
    public String autor;
    public LocalDate dataDevolucao;
    public int codigodebarras;

    public Livro(String titulo,String escritor,LocalDate data,int codigo){
        
        nome=titulo;
        autor=escritor;
        dataDevolucao=data;
        codigodebarras=codigo;
        
    }


}
