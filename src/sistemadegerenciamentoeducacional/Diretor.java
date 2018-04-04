package sistemadegerenciamentoeducacional;

public class Diretor extends Pessoa {
    
    private int senha;
    
    public void setSenha(int senha){
        this.senha = senha;
    }
    
    public int getSenha(){
        return this.senha;
    }
    
}
