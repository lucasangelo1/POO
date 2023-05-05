package pack;

public class usuario {
   private String nome;
   private String documento;
   public usuario (String name,String matricula){

    this.nome=name;
    this.documento=matricula;
    
   }

// Getter e settings zone
public String getDocumento() {
    return documento;
}
public void setDocumento(String documento) {
    this.documento = documento;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}



}
