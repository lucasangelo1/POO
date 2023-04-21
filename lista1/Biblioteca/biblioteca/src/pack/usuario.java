package pack;

public class usuario {
   private String nome;
   private String email;
   private String telefone;
   private String cargo;
   private String login;
   private String senha;
   private String documento;
   public usuario (String name,String cpf){

    this.nome=name;
    this.documento=cpf;
    
   }
   /*public usuario (String name,String emails,String phone,String atributo,String log,String code,String cpf){

    this.nome=name;
    this.email=emails;
    this.telefone=phone;
    this.cargo=atributo;
    this.login=log;
    this.senha=code;
    this.documento=cpf;
    
   }*/





















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
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
} 
public String getTelefone() {
    return telefone;
}
public void setTelefone(String telefone) {
    this.telefone = telefone;
}  
public String getCargo() {
    return cargo;
}
public void setCargo(String cargo) {
    this.cargo = cargo;
} 
public String getLogin() {
    return login;
}
public void setLogin(String login) {
    this.login = login;
}
public String getSenha() {
    return senha;
}
public void setSenha(String senha) {
    this.senha = senha;
}

}
