package Aula;

import java.time.LocalDate;
import java.util.Scanner;

public class Empresa
{
    public static void main(String[] args)
    {
        String nomeEmpresa = "Escola Maringá";
        String cnpjEmpresa = "013.141.04.0001/34";

        Scanner e = new Scanner(System.in);
        Departamento de = new Departamento();
        Funcionario f = new Funcionario();

        int opcao;
        do
        {
            System.out.println("***********************************");
            System.out.println("%s ",+ nomeEmpresa);
            System.out.println("%s ", + cnpjEmpresa);
            System.out.println("1 - Cadastrar funcionario novo");
            System.out.println("2 - cadastrar departamento");
            System.out.println("3 - listar funcionarios e departamento lotado ");
            System.out.println("4 - listar departamentos ");
            System.out.println("5 - Sair");
            System.out.println("***********************************");
            System.out.println("Escolha uma opção no menu:");
            opcao = e.nextInt();

            switch(opcao)
            {
                case 1:
                    e.nextLine();
                    System.out.println("Informe o Nome do Funcionario: ");
                    f.nome = e.nextLine();
                    System.out.println("Informe o Telefone: ");
                    String telefone = e.nextLine();
                    System.out.println("Informe o CPF: ");
                    String cpf = e.nextLine();

                   // LocalDate de.dataAdmissão =
                           // LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                    boolean retorno = de.cadastrarFuncionario(f.setNome)

                    if (retorno)
                        System.out.println("Registro efetuado com sucesso");
                    else
                        System.out.println("Erro ao registrar o cliente!!!");
                    break;
                case 2: System.out.println("Alterar cliente");
                    break;
                case 3:
                    System.out.println("Listar cliente");
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("Telefone: " + cliente.getTelefone());
                    System.out.println("E-mail: " + cliente.getEmail());
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("Data Nascimento: " + cliente.getDataNascimento());
                    break;
                case 4: System.out.println("Saindo do Sistema");
                    break;
                default: System.out.println("Valor não condiz com o esperado!!!");
            }
        }
        while(opcao != 4);
        scan.close();
    }
}
