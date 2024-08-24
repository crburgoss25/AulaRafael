package Aula;

public class Departamento
{
    String nomeDepartamento;
    int[] departamentoEmpresa = new int [10];
    String[] funcionario = new String[100];

    Funcionario f = new Funcionario();

    public void setNomeDepartamento(String nomeDepartamento)
    {
        this.nomeDepartamento = nomeDepartamento;
    }

    public String getNomeDepartamento()
    {
        return nomeDepartamento;
    }

    public void setNomeDepartamento() {
    }
}
