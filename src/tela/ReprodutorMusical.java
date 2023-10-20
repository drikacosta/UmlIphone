package tela;

public class ReprodutorMusical {
        protected String nomeMusica;
        protected String artista;
        String album;
    
        protected ReprodutorMusical(String nomeMusica, String artista, String album) {
            this.nomeMusica = nomeMusica;
            this.artista = artista;
            this.album = album;
        }
    
        public void tocarMusica(){
            System.out.println ("Tocando musica");
        }
        public void pausarMusica(){
            System.out.println("Pause");
        }
        public void selecionarMusica(){
            System.out.println("Música selecionada");
        }
}
