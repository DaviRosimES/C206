public class Cantina {
    String nome;
    Salgado salgados[] = new Salgado[100];

    void addSalgado(Salgado novoSalgado){
        for (int i = 0; i < salgados.length; i++){
            if(salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println(this.nome);
        for (int i = 0; i < salgados.length; i++) {
            if(salgados[i] != null){
                System.out.println(this.salgados[i].nome);
            }
        }
    }
}
