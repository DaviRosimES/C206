package entidades.locais;

import entidades.personagens.Humano;
import entidades.personagens.Personagem;

public class Cidade {
    // Atributos
    private String nome;
    Personagem[] personagens = new Personagem[10];

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos
    public void adicionarPersonagens(Personagem p){
        for (int i = 0; i < personagens.length; i++) {
            if(personagens[i] == null){
                personagens[i] = p;
                break;
            }
        }
    }

    public void listarPersonagens() {
        for(int i = 0; i < personagens.length; i++) {
           if(personagens[i] != null){
               int aux = personagens[i].getIdPersonagem();
               System.out.println("Id do personagem: " + aux);
               personagens[i].mostrarInfos();
               System.out.println();
           } else {
               break;
           }
        }
    }
}
