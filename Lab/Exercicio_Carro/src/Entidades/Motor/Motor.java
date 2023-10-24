package Entidades.Motor;

public class Motor {
    public int potencia;
    public String tipo;

    public void mostrarInfos(){
        System.out.println("Potencia do motor  : " + this.potencia);
        System.out.println("Tipo do motor      : " + this.tipo);
    }
}
