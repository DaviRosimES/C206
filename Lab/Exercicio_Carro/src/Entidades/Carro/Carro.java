package Entidades.Carro;
import Entidades.Motor.Motor;
public class Carro {
    //Atributos
    public String cor;
    public String marca;
    public double velocidadeMax;
    public double velocidadeAtual;
    public Motor motor;

    //Construtor
    public Carro(){
        motor = new Motor();
    }

    //Métodos

    /**
     * Liga o carro.
     */
    public void ligar(){
        System.out.println("Vrum");
    }

    /**
     * Acelera o carro.
     */
    public void acelerar(){
        System.out.println("Vrum...Vrum...Vruuuum");
    }

    /**
     * Mostra as informações do carro.
     */
    public void mostrarInfos(){
        System.out.println("Cor do carro       : " + this.cor);
        System.out.println("Marca do carro     : " + this.marca);
        System.out.println("Velocidade máxmia  : " + this.velocidadeMax);
        System.out.println("Velocidade atual   : " + this.velocidadeAtual);
    }
}
