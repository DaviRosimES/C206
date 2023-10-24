public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        piloto1.nome = "Mario";
        piloto1.vilao = false;

        piloto2.nome = "Luigi";
        piloto2.vilao = false;

        kart1.nome = "Rapidão";
        kart1.piloto = piloto1;
        kart1.motor.cilindradas = "150";
        kart1.motor.velocidadeMaxima = 150;

        System.out.println(kart1.nome);
        System.out.println(kart1.piloto.nome);
        System.out.println(kart1.piloto.vilao);
        kart1.pular();
        kart1.soltarTurbo();
        kart1.fazerDrift();
        kart1.motor.mostraInfo();

        System.out.println("--------------------");
        kart2.nome = "Foguete";
        kart2.piloto = piloto2;
        kart2.motor.cilindradas = "100";
        kart2.motor.velocidadeMaxima = 100;

        System.out.println(kart2.nome);
        System.out.println(kart2.piloto.nome);
        System.out.println(kart2.piloto.vilao);
        kart2.pular();
        kart2.soltarTurbo();
        kart2.fazerDrift();
        kart2.motor.mostraInfo();
    }
}
