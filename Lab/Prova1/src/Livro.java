public class Livro {
    // Atributos
    public String titulo;
    public String  genLiterario;
    public int qtdFolhas;
    public String editora;
    public Autor autor;

    // Construtor
    public Livro(){
        autor = new Autor();
    }

    // Métodos
    public void mostrarInfos(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Genero literário: " + this.genLiterario);
        System.out.println("Quantidade de folhas: " + this.qtdFolhas);
        System.out.println("Editora: " + this.editora);
    }
}
