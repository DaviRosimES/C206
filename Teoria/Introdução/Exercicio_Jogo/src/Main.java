public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Arma arma = new Arma();

        arma.nome        = "M60";
        arma.resistencia = 1000000;
        arma.poder       = 1000000;
        arma.descricao   = "Famosa metralhadora do Rambo. Muito boa, mata todo mundo.";

        personagem.nome = "Rambo";
        personagem.pontos = 1000000000;
        personagem.arma = arma;

        System.out.println("Nome do personagem: " + personagem.nome);
        System.out.println("Pontos do personagem: " + personagem.pontos);
        System.out.println("Arma do " + personagem.nome + ": " + personagem.arma.nome);
        System.out.println("Descrição da " + personagem.arma.nome + ": " + personagem.arma.descricao);
        System.out.println("Poder da " + personagem.arma.nome + ": " + personagem.arma.poder);
        System.out.println("Resistência da " + personagem.arma.nome + ": " + personagem.arma.resistencia);
        personagem.usarArma();
        personagem.tomarDano();
    }
}
