public class Cliente {
    String nome;
    long cpf;
    float valorCarrinho = 0;

    public Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    float calculaTotalCompra(){
        return this.valorCarrinho;
    }

    void addCarrinho(Computador pcComprado){
        valorCarrinho += pcComprado.preco;
    }
}
