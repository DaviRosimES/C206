import Entidades.Carro.Carro;

import Entidades.Motor.Motor;
public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.cor = "Prata";
        c1.marca = "GM - Chevrolet";
        c1.velocidadeAtual = 0.0;
        c1.velocidadeMax = 191.4;
        c1.motor.tipo = "VHC";
        c1.motor.potencia = 77;
        c1.ligar();
        c1.acelerar();
        c1.mostrarInfos();
        c1.motor.mostrarInfos();

        c2.cor = "Azul Perolado";
        c2.marca = "Honda";
        c2.velocidadeAtual = 0.0;
        c2.velocidadeMax = 210.5;
        c2.motor.tipo = "VTEC";
        c2.motor.potencia = 280;
        c2.ligar();
        c2.acelerar();
        c2.mostrarInfos();
        c2.motor.mostrarInfos();
    }
}
