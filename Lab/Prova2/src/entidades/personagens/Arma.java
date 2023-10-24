package entidades.personagens;

public class Arma {
    // Atributos
    private int forca;
    private String tipoArma;

    // Getters e Setters
    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    // Métodos
    public void mostrarInfos(){
        System.out.println("Força: " + this.forca);
        System.out.println("Tipo da Arma: " + this.tipoArma);
    }

    public void addForca(int forca) {
        this.forca += forca;
    }


}
