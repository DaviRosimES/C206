package entidades.personagens;

import interfaces.Aprimorar;
import interfaces.Lutar;

public class Humano extends Personagem implements Aprimorar, Lutar {
    // Atributos
    private String nome;
    private int idade;
    private boolean vagalume;
    private double energia;
    private double distanciaEscuta;
    private Arma arma;

    // Getters e Settes
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setVagalume(boolean vagalume) {
        this.vagalume = vagalume;
    }
    public void setEnergia(double energia) {
        this.energia = energia;
    }
    public void setDistanciaEscuta(double distanciaEscuta) {
        this.distanciaEscuta = distanciaEscuta;
    }

    // Métodos
    @Override
    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Energia: " + this.energia);
        System.out.println("Distancia escuta: " + this.distanciaEscuta);
        this.arma.mostrarInfos();
    }

    public void addArma(Arma arma){
        this.arma = arma;
    }

    @Override
    public void modificarArma() {
        System.out.println("Sua arma esta sendo modificada...");
        this.arma.addForca(5);
        this.arma.mostrarInfos();
    }

    @Override
    public void modificarHabilidade(int qtdPilulas, String tipoHabilidade) {
        if(qtdPilulas <= 0){
            System.out.println("Quantidade de pilulas inválidas, favor informar um valor maior do que 0.");
            return;
        }

        if(tipoHabilidade.equalsIgnoreCase("energia")){
            if(qtdPilulas > 0 && qtdPilulas < 10){
                this.energia += (this.energia*0.02);
            } else if(qtdPilulas >= 10 && qtdPilulas <= 15){
                this.energia += (this.energia*0.04);
            }
        } else if (tipoHabilidade.equalsIgnoreCase("escuta")){
            if(qtdPilulas > 0 && qtdPilulas < 10){
                this.distanciaEscuta += 0.2;
            } else if(qtdPilulas >= 10 && qtdPilulas <= 15){
                this.distanciaEscuta += 0.4;
            }
        }
    }

    @Override
    public void atacar() {
        System.out.println("*Atacando*...Morra zumbi!");
    }

    @Override
    public void defender() {
        System.out.println("*Defende*...Uuugh...Saia daqui zumbi!");
    }
}
