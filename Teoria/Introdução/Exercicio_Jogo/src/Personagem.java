public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    void usarArma(){
        if(arma.resistencia >= 50){
            System.out.println("TRATATATATATA");
        } else if (arma.resistencia >= 20 && arma.resistencia < 50) {
            System.out.println("Papapa");
        } else {
            System.out.println("Piu");
        }
        arma.resistencia -= 1;
    }

    void tomarDano(){
        if(this.nome == "Rambo"){
            System.out.println("O RAMBO NÃO TOMA DANO");
        } else {
            System.out.println("Aiaiai...Morri");
            this.pontos = 0;
        }
    }
}
