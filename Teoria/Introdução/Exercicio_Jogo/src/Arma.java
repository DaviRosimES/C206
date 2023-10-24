public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    void mostrarInfoArma(){
        System.out.println("Nome da arma: " + this.nome);
        System.out.println("Poder da " + this.nome + " : " + this.poder);
        System.out.println("Resistência da " + this.nome + " : " + this.resistencia);
        System.out.println("Descrição da " + this.nome + " : " + this.descricao);
    }
}
