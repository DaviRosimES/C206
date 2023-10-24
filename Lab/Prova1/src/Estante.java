import java.util.Scanner;

public class Estante {
    // Atributos
    public int idEstante;
    public char letra;
    Livro[] livros = new Livro[130];

    //Métodos
    public void addLivros(Livro livro){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o título do livro:");
        livro.titulo = sc.nextLine();
        System.out.println("Digite o gênero literário:");
        livro.genLiterario = sc.nextLine().toLowerCase();
        System.out.println("Digite o número de folhas:");
        livro.qtdFolhas = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a editora:");
        livro.editora = sc.nextLine();
        System.out.println("Digite o nome do autor:");
        livro.autor.nome = sc.nextLine();
        System.out.println("Digite o ano de nascimento do autor:");
        livro.autor.anoNascimento = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a profissão do autor:");
        livro.autor.profissao = sc.nextLine();

        for (int i = 0; i < livros.length; i++) {
            if(livros[i] == null){
                livros[i] = livro;
                break;
            }
        }

        System.out.println("Livro adicionado com sucesso!");
        System.out.println("-----------------------------");
    }

    public void procentagemGen(){
        int contDrama = 0;
        int contSuspense = 0;
        int contOutros = 0;
        int posValidas = 0;

        for (int i = 0; i < livros.length; i++) {
            if(livros[i] != null){
                if(livros[i].genLiterario.equals("drama")){
                    contDrama++;
                } else if(livros[i].genLiterario.equals("suspense")){
                    contSuspense++;
                } else {
                    contOutros++;
                }
                posValidas++;
            } else {
                break;
            }
        }

        if(posValidas != 0){
            double porcentagemDrama = (contDrama / (double) posValidas) * 100.0;
            double porcentagemSuspense = (contSuspense / (double) posValidas) * 100.0;
            double porcentagemOutros = (contOutros / (double) posValidas) * 100.0;

            System.out.println("A porcentagem de Drama é: " + porcentagemDrama + "%");
            System.out.println("A porcentagem de Suspense é: " + porcentagemSuspense + "%");
            System.out.println("A porcentagem de Outros generos literários é: " + porcentagemOutros + "%");
            System.out.println("-----------------------------");
        } else {
            System.out.println("Nenhum livro adicionado!");
        }
    }


    public void livroMaisEMenosPag(){
        int max = 0;
        int min = 99999999;
        int auxMax = -1, auxMin = -1;

        for (int i = 0; i < livros.length; i++) {
            if(livros[i] != null){
                if(livros[i].qtdFolhas > max){
                    max = livros[i].qtdFolhas;
                    auxMax = i;
                }

                if(livros[i].qtdFolhas < min){
                    min = livros[i].qtdFolhas;
                    auxMin = i;
                }
            } else {
                break;
            }
        }

        if(auxMax != -1 && auxMin != -1)
        {
            System.out.println("O livro com menor número de páginas é o: " + livros[auxMin].titulo + " com " + livros[auxMin].qtdFolhas + " folhas!");
            System.out.println("O livro com maior número de páginas é o: " + livros[auxMax].titulo + " com " + livros[auxMax].qtdFolhas + " folhas!");
            System.out.println("-----------------------------");
        } else {
            System.out.println("Nenhum livro foi adicionado!");
        }

    }

    public void mostrarInfos(){
        System.out.println("O id da estante é: " + this.idEstante);
        System.out.println("A letra da estante é: " + this.letra);
        System.out.println("Infromações sobre os livros: ");
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] != null){
                livros[i].mostrarInfos();
                livros[i].autor.mostrarInfos();
            } else {
                break;
            }
        }
        System.out.println("-----------------------------");
    }
}
