/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unpvirtual;

public abstract class Usuario {

      protected  String nome;
      protected  String Nascimento;
      protected  String cpf;
      protected  String rg;
      protected  String endereço;
      protected  String matricula;
      protected  String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Usuario(String nome, String Nascimento, String cpf, String rg, String endereço, String matricula, String tipo) {
        this.nome = nome;
        this.Nascimento = Nascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.endereço = endereço;
        this.matricula = matricula;
        this.tipo = tipo;
    }

    
    
      
   
   
    
}
