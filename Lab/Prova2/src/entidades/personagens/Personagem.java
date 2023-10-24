package entidades.personagens;

public abstract class Personagem {
    // Atributos
    private static int numPersonagens = 0;
    private int vida;
    private int idPersonagem;

    // Construtor
    public Personagem(){
        numPersonagens++;
        idPersonagem = numPersonagens;
    }

    // Métodos
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getIdPersonagem() {
        return idPersonagem;
    }

    public void mostrarInfos(){
        System.out.println("Vida: " + this.vida);
        System.out.println("idPersonagem: " + this.idPersonagem);
    }
}
