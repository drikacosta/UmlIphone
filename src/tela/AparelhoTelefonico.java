package tela;

public class AparelhoTelefonico {
    private String nome;
    private int numtelefone;

    public AparelhoTelefonico(String nome, int numtelefone) {
        this.nome = nome;
        this.numtelefone = numtelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumtelefone() {
        return numtelefone;
    }

    public void setNumtelefone(int numtelefone) {
        this.numtelefone = numtelefone;
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }
}
