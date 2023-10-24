public class Computador {
    String marca;
    float preco;
    MemoriaUSB memoriaUSB;
    SistemaOperacional os;
    HardwareBasico hardware;

    public Computador(){
        os = new SistemaOperacional();
        hardware = new HardwareBasico();
    }

    void mostraPCConfigs(){
        System.out.println(this.marca);
        System.out.println(this.preco);
        System.out.println(hardware.nome);
        System.out.println(hardware.capacidade);
        System.out.println(os.nome);
        System.out.println(os.tipo);
        if(memoriaUSB != null){
            System.out.println(memoriaUSB.nome);
            System.out.println(memoriaUSB.capacidade);
        } else {
            System.out.println("Se quiser podemos entregar-lo com uma memória extra!");
        }
    }

    void addMemoriaUSB(MemoriaUSB musb){
        memoriaUSB = new MemoriaUSB();
        this.memoriaUSB.nome = musb.nome;
        this.memoriaUSB.capacidade = musb.capacidade;
    }
}
