public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "1";
        zumbi1.vida = 100;
        zumbi1.humanosMortos = 23;

        zumbi2.nome = "2";
        zumbi2.vida = 20;
        zumbi2.humanosMortos = 0;

        System.out.println("Vida do " + zumbi1.nome + ": " + zumbi1.mostraVida());
        System.out.println("Vida do " + zumbi2.nome + ": " + zumbi2.mostraVida());

        System.out.println("Zumbi " + zumbi1.nome + " tranferindo vida para o zumbi " + zumbi2.nome);
        zumbi1.transfereVida(zumbi2, 40);

        System.out.println("Vidas atualizadas.");
        System.out.println("Vida do " + zumbi1.nome + ": " + zumbi1.mostraVida());
        System.out.println("Vida do " + zumbi2.nome + ": " + zumbi2.mostraVida());

        zumbi1.grunhido();
    }
}
