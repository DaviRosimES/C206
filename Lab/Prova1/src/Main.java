import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estante estante = new Estante();

        estante.idEstante = 1;
        estante.letra = 'A';

        int option = 0;
        boolean run = true;
        while(run){
            System.out.println("Atenção digite somente o número da opção desejada!");
            System.out.println("1- Adicione livros à sua estante!");
            System.out.println("2- Mostrar as informações sobre a sua estante!");
            System.out.println("3- Mostrar a porcentagem de distribuição de gêneros da sua estante!");
            System.out.println("4- Mostrar quais livros tem o maior número de folhas e o livro com o menor número de folhas!");
            System.out.println("5- Sair");
            System.out.println("Digite a opção desejada: ");
            option = sc.nextInt();
            sc.nextLine();

            if(option == 1){
                Livro livro = new Livro();
                estante.addLivros(livro);
            } else if (option == 2) {
                estante.mostrarInfos();
            } else if (option == 3) {
                estante.procentagemGen();
            } else if (option == 4) {
                estante.livroMaisEMenosPag();
            } else {
                System.out.println("Até a próxima!");
                run = false;
            }
        }
    }
}
