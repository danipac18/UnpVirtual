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
public abstract class Disciplina extends unpvirtual.Usuario
{

    public Disciplina(String nome, String Nascimento, String cpf, String rg, String endereço, String matricula, String tipo) {
        super(nome, Nascimento, cpf, rg, endereço, matricula, tipo);
    }

   
    
    /**
     *
     * @return
     */
    public  String nome()
    {
        return "programação";
    }
    public float CargaHT ()
    {
        return 60;
    }
    public float quantidadeCredito()
    {
        return 150;
    }
    public String Horario ()
    {
        return "Começa as 19:00 "+" Termina as 21:45 ";
    }
    public int anoLetivo ()
    {
        return 20151;
    }
    
}
