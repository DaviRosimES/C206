import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Cliente", 123456789);
        Scanner sc = new Scanner(System.in);

        Computador p1 = new Computador();
        p1.marca = "Positivo";
        p1.preco = 2300.00f;
        p1.hardware.nome = "Pentium Core i3";
        p1.hardware.capacidade = 2200;
        p1.os.nome = "Linux Ubuntu";
        p1.os.tipo = 32;
        Computador p2 = new Computador();
        p2.marca = "Acer";
        p2.preco = 5800.00f;
        p2.hardware.nome = "Pentium Core i5";
        p2.hardware.capacidade = 3370;
        p2.os.nome = "Windows 8";
        p2.os.tipo = 64;
        Computador p3 = new Computador();
        p3.marca = "Vaio";
        p3.preco = 1800.00f;
        p3.hardware.nome = "Pentium Core i7";
        p3.hardware.capacidade = 4500;
        p3.os.nome = "Windows 10";
        p3.os.tipo = 64;

        boolean run = true;
        int option = -1;
        while(run){
            System.out.println("0- Sair");
            System.out.println("1- Ver modelos em promoção!");
            option = sc.nextInt();

            if(option == 0){
                run = false;
            } else {
                System.out.println("Promoção 1:");
                p1.mostraPCConfigs();
                System.out.println("----------------------");
                System.out.println("Promoção 2:");
                p2.mostraPCConfigs();
                System.out.println("----------------------");
                System.out.println("Promoção 3:");
                p3.mostraPCConfigs();
                System.out.println("----------------------");
                boolean stillBuiyng = true;
                while(stillBuiyng){
                    System.out.println("Para selecionar qual deseja comprar, digite o código da promoção(1,2 e/ou 3)");
                    System.out.println("Se deseja finalizar sua compra ou sair, digite 0!");
                    int optionToBuy = sc.nextInt();
                    float basket = 0;
                    if(optionToBuy == 0){
                        basket = cliente.calculaTotalCompra();
                        if(basket == 0){
                            System.out.println("Muito obrigado pela visita!");
                            System.out.println("Na próxima teremos o produto do eu interesse!");
                        } else {
                            System.out.println("Sua compra deu o total de: " + basket);
                        }
                        System.out.println("Oi");
                        stillBuiyng = false;
                        run = false;
                    } else if (optionToBuy == 1) {
                        System.out.println("Quer adicionar uma memória extra no seu computador novo?!(0- Sim; 1- Não)");
                        int optionMemory = sc.nextInt();
                        if(optionMemory == 0){
                            MemoriaUSB musb = new MemoriaUSB("Pen-Drive", 16);
                            p1.addMemoriaUSB(musb);
                        }
                        cliente.addCarrinho(p1);
                    } else if (optionToBuy == 2){
                        System.out.println("Quer adicionar uma memória extra no seu computador novo?!(0- Sim; 1- Não)");
                        int optionMemory = sc.nextInt();
                        if(optionMemory == 0){
                            MemoriaUSB musb = new MemoriaUSB("Pen-Drive", 16);
                            p2.addMemoriaUSB(musb);
                        }
                        cliente.addCarrinho(p2);
                    } else if(optionToBuy == 3){
                        System.out.println("Quer adicionar uma memória extra no seu computador novo?!(0- Sim; 1- Não)");
                        int optionMemory = sc.nextInt();
                        if(optionMemory == 0){
                            MemoriaUSB musb = new MemoriaUSB("Pen-Drive", 16);
                            p3.addMemoriaUSB(musb);
                        }
                        cliente.addCarrinho(p3);
                    } else {
                        System.out.println("Código inválido, tente novamente!(Dica: só é válido números entre 0 e 3)");
                    }
                }
            }

        }
    }
}