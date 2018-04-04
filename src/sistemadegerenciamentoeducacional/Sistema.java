package sistemadegerenciamentoeducacional;

public class Sistema {
    
    public Sistema(int matricula){
        
    }

    private int faltas;
    private double nota;    
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    public double getNota(){
        return this.nota;
    }
    
    public void setFaltas(int faltas){
        this.faltas = faltas;
    }
    
    public int getFaltas(){
        return faltas;
    }
    
    public void login(Autenticavel autenticar){
        
        int senha = 222;
        boolean ok = autenticar.autentica(senha);
        
        if(ok == true){
            System.out.println("Nota: " + getNota());
            System.out.println("Faltas: " + getFaltas());
        }
    }
    
}
