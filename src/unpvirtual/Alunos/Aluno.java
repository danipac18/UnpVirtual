
package unpvirtual.Alunos;

public  class Aluno extends unpvirtual.Dicente
{

    public Aluno(String nome, String Nascimento, String cpf, String rg, String endereço, String matricula, String tipo) 
    {
        super(nome, Nascimento, cpf, rg, endereço, matricula, tipo);
    }

    public digiteMatricula (String matricula)
    {
        System.out.println("Digite sua matricula:" + matricula)   
        
     }

    public escolhaTurma (String turma)
    {
        if ( 20140001 > turma >=20140010)
        {
            System.out.println( "Sua turma é:" + turma  )
        }
        
    
    }
    
  
    
}
