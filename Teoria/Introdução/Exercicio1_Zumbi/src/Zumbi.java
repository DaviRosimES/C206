public class Zumbi {
    //Atributos
    double vida;
    String nome;
    int humanosMortos;


    //Métodos
    void matarPessoas(){
        System.out.println("Vou matar pessoas...Ugh!");
    }

    void grunhido(){
        System.out.println("Ugh...Ãaah!");
    }

    double mostraVida(){
        return vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }

}
