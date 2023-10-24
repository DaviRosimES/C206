public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();
        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome = "Coxinha";
        salgado2.nome = "Pastel";
        salgado3.nome = "Hamburger";

        cantina.nome = "Cantina da Lurdinha";
        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);
        cantina.mostraInfo();
    }
}
