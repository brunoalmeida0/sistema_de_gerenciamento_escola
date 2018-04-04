package sistemadegerenciamentoeducacional;

public class teste {
    
    public static void main(String[] args) {
        
        AlteraSistema alterasistema = new AlteraSistema();
        Professor carlos = new Professor();
        Aluno joao = new Aluno(1010);
        Sistema sistema = new Sistema(joao.getMatricula());
        
        carlos.setSenha(111);
        
        alterasistema.login(carlos);
        joao.setSenha(222);
        
        sistema.login(joao);
        
        
    }
    
}
