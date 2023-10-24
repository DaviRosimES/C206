package entidades.personagens;

import interfaces.Infectar;
import interfaces.Lutar;

public class Zumbi extends Personagem implements Lutar, Infectar {
    // Atributos
    private int diasInfeccao;
    private boolean cego;

    // Getters e Setters
    public void setDiasInfeccao(int diasInfeccao) {
        this.diasInfeccao = diasInfeccao;
    }
    public boolean isCego() {
        return cego;
    }

    // Métodos
    public void transformacao(){
        if((this.diasInfeccao >= 2 && this.diasInfeccao <= 14) || (this.diasInfeccao > 14 && this.diasInfeccao <= 365)){
            this.cego = false;
        } else if(this.diasInfeccao > 365){
            this.cego = true;
        }
    }
    @Override
    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Dias infectado: " + this.diasInfeccao);
        if(this.isCego()){
            System.out.println("É cego!");
        } else {
            System.out.println("Não é cego!");
        }
    }

    @Override
    public void infectou() {
        System.out.println("O zumbi mordeu e infectou um Humano");
    }

    @Override
    public void atacar() {
        System.out.println("Estou atacandoooo... Aaaaagh");
    }

    @Override
    public void defender() {
        System.out.println("*Bloqueia*... Saia daqui humano nojento!");
    }
}
