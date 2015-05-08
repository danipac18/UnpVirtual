/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unpvirtual.Funcionario;

/**
 *
 * @author romulocabral
 */
public class Docentes extends funcionario 
{
    
    /**
     *
     */ 
    public void chamada() 
        {
            System.out.println("a chamada foi feita.");
        }
       
    public void Turma() 
        {
            System.out.println("Disciplina escolhida");
            System.out.println("Notas lançadas");
        }
    public void enviarmensagem() 
        {
            System.out.println("mensagem enviada para o forum ");
        }

    public Docentes(String nome, String Nascimento, String cpf, String rg, String endereço, String matricula, String tipo) {
        super(nome, Nascimento, cpf, rg, endereço, matricula, tipo);
    }
       
  

    
}
