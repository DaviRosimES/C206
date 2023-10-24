package funcionario;

public class Funcionario {
    /**
     * Essa variável guarda o nome do funcionário.
     */
    public String nome;
    /**
     * Essa variável guarda a idade do funcionário.
     */
    public int idade;
    /**
     * Essa variável guarda o cpf do funcionário.
     */
    public String cpf;

    /**
     * Essa variável armazena os meses trabalhados do funcionário.
     */
    public int diasTrabalhados;

    int valorDoDiaTrabalhado = 100;

    // Construtores
    public Funcionario() {
        System.out.println("Funcionário(a) novo(a)!");
    }
    public Funcionario(String data){
        System.out.println("Novo funcionario(a) cadastrado na data: " + data + "!");
    }

    // Métodos
    public void calculaSalario(){
        System.out.println("Salario = R$" + this.diasTrabalhados* this.valorDoDiaTrabalhado);
    }

    public void calculaSalario(int bonus){
        System.out.println("Salario com bonus = R$" + ((this.diasTrabalhados * this.valorDoDiaTrabalhado) + bonus));
    }
}
