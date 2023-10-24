import funcionario.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("28/08/2023");

        f1.nome = "Davi";
        f1.cpf = "111.222.333-44";
        f1.idade = 20;
        f1.diasTrabalhados = 21;

        System.out.println("Nome do funcionário : " + f1.nome);
        System.out.println("Cpf do funcionário  : " + f1.cpf);
        System.out.println("Idade do funcionário: " + f1.idade);
        f1.calculaSalario();
        f1.calculaSalario(2000);
    }
}
