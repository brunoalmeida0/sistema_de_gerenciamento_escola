package sistemadegerenciamentoeducacional;

import java.util.Scanner;

public class AlteraSistema {
     
    public void login(Autenticavel autenticavel){
        int senha = 111;
        int op;
        boolean ok = autenticavel.autentica(senha);
        
        Scanner input = new Scanner(System.in);
        
        if(ok == true){
            
            System.out.println("Digite a matricula do aluno: ");
            Sistema sistema = new Sistema(input.nextInt());
            
            System.out.println("Alterar nota: 1 \nAlterar falta: 2");
            op = input.nextInt();
            
            if(op == 1){
                System.out.println("Digite a nota do aluno: ");
                sistema.setNota(input.nextDouble());
            } else {
                System.out.println("Digite a quantidade de faltas do aluno: ");
                sistema.setFaltas(input.nextInt());
            }
            
        } else {
            
            System.out.println("Não autenticou");
            
        }
        
    }
    
}
