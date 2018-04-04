package sistemadegerenciamentoeducacional;

public class Professor extends Pessoa implements Autenticavel {
    
    private int senha;
    
    public void setSenha(int senha){
        this.senha = senha;
    }
    
    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
    
}
