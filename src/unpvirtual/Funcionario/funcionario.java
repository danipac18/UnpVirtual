/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unpvirtual.Funcionario;

import unpvirtual.Usuario;

/**
 *
 * @author romulocabral
 */
public abstract class funcionario extends Usuario
{

    public funcionario(String nome, String Nascimento, String cpf, String rg, String endereço, String matricula, String tipo) {
        super(nome, Nascimento, cpf, rg, endereço, matricula, tipo);
    }

}
