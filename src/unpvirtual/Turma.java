/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unpvirtual;

/**
 *
 * @author romulocabral
 */
public class Turma extends unpvirtual.Disciplina {

    public Turma(String nome, String Nascimento, String cpf, String rg, String endereço, String matricula, String tipo) {
        super(nome, Nascimento, cpf, rg, endereço, matricula, tipo);
    }
    
 
     public  String Tnome()
     {    
        return "ENC3NA";
     }
     
     public void imprimirAnoLetivo()
     {
         System.out.println(super.anoLetivo());
     }
     public void imprimirDisciplina()
     {
         System.out.println(super.nome());
     }
     
     
}
    

