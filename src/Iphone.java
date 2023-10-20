
import tela.AparelhoTelefonico;
import tela.NavegadorInternet;
import tela.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        
        NavegadorInternet navegador = new NavegadorInternet();
        if (navegador != null) {
            navegador.setUrl("https://www.example.com");
            navegador.exibirPagina();
            navegador.adicionarNovaAba();
            navegador.atualizarPagina();
        }
       
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical("Evidencias", "Chitãozinho e Xororó", "As demlhores de") {
            @Override
            public void tocarMusica() {
                System.out.println("Tocando música: " + nomeMusica);
            }
            
            @Override
            public void pausarMusica() {
                System.out.println("Pausando música: " + nomeMusica);
            }
            
            @Override
            public void selecionarMusica() {
                System.out.println("Selecionando música: " + nomeMusica);
            }
        };

        if (reprodutorMusical != null) {
            reprodutorMusical.tocarMusica();
            reprodutorMusical.pausarMusica();
            reprodutorMusical.selecionarMusica();
            System.out.println("Música inicializada!");
        } else 
        System.out.println("Música não está reproduzindo"); 

        AparelhoTelefonico telefone = new AparelhoTelefonico("Meu iPhone", 123450987);
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
    }
}