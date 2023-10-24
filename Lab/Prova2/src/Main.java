import entidades.locais.Cidade;
import entidades.personagens.Arma;
import entidades.personagens.Humano;
import entidades.personagens.Personagem;
import entidades.personagens.Zumbi;

public class Main {
    public static void main(String[] args) {
        Cidade cidade = new Cidade();
        cidade.setNome("Santa Rita do Sapucaí");

        Arma arma = new Arma();
        arma.setForca(38);
        arma.setTipoArma("Pistola");

        Humano humano = new Humano();
        humano.setVida(100);
        humano.setNome("Davi");
        humano.setIdade(19);
        humano.setEnergia(73.5);
        humano.setDistanciaEscuta(20.3);
        humano.setVagalume(false);
        humano.addArma(arma);
        humano.atacar();
        humano.defender();
        humano.modificarArma();
        cidade.adicionarPersonagens(humano);

        Zumbi zumbi = new Zumbi();
        zumbi.setVida(47);
        zumbi.setDiasInfeccao(25);
        zumbi.transformacao();
        zumbi.atacar();
        zumbi.defender();
        zumbi.infectou();
        cidade.adicionarPersonagens(zumbi);

        cidade.listarPersonagens();
        humano.modificarHabilidade(10, "escuta");
        humano.modificarHabilidade(5, "energia");
        humano.mostrarInfos();
    }
}
