public class Autor {
    // Atributos
    public String nome;
    public int anoNascimento;
    public String profissao;

    // Métodos
    public void mostrarInfos(){
        System.out.println("Nome do autor: " + this.nome);
        System.out.println("Ano de nascimento do autor: " + this.anoNascimento);
        System.out.println("Profissão do autor: " + this.profissao);
    }
}
