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
public class Dicente extends unpvirtual.Turma/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
{

    /**
     *
     * @param nome
     * @param Nascimento
     * @param cpf
     * @param rg
     * @param endereço
     * @param matricula
     * @param tipo
     */
    public Dicente(String nome, String Nascimento, String cpf, String rg, String endereço, String matricula, String tipo) {
        super(nome, Nascimento, cpf, rg, endereço, matricula, tipo);
    }

    public void enviarmensagem() 
        {
            System.out.println("mensagem enviada para o forum ");
        }
    
    
}
