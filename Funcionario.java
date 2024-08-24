package Aula;

import java.time.LocalDate;
import java.util.Date;

public class Funcionario
{
    private String nome;
    private double salario;
    private Date dataAdmissao;

    public boolean cadastrarFuncionario(String nome, String salario, LocalDate dataAdmissao)
    {

        this.setNome(nome);
        this.setSalario(salario);
        this.setDataAdmissao(dataAdmissao);
        return true;
    }

    void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setSalario(double salario)
    {
        Salario = salario;
    }

    public double getSalario()
    {
        return Salario;
    }

    public Date getDataAdmissao()
    {
        return dataAdmissao;
    }

    public Date void setDataAdmissao(Date dataAdmissao)
    {
        this.dataAdmissao = dataAdmissao;
    }
}
