package sistemadegerenciamentoeducacional;

public class Aluno extends Pessoa implements Autenticavel{
    
    int matricula;    
    int senha;
    
    public Aluno(int matricula){
        Sistema sistema = new Sistema(matricula);
        this.matricula = matricula;
    }   
        
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setSenha(int senha){
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }    
    
}
