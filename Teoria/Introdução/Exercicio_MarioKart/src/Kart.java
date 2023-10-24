public class Kart{
    String nome;

    Motor motor;
    Piloto piloto;

    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println("Pulei");
    }

    void soltarTurbo(){
        System.out.println("VRUUUUUM...TURBO!");
    }

    void fazerDrift(){
        System.out.println("SKRSKRSKR...Fazendo drift!");
    }

}
