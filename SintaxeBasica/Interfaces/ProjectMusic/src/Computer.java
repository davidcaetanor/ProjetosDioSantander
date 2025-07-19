public class Computer implements VideoPlayer, MusicPlayer {

    @Override
    public void playVideo() {
        System.out.println("O Computador esta rodando o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Video Pausado pelo Computador");
    }

    @Override
    public void stopVideo() {
        System.out.println("Video Encerrado");
    }

    @Override
    public void playMusic() {
        System.out.println("O Computador esta tocando a musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Musica Pausada pelo Computador");
    }

    @Override
    public void stopMusic() {
        System.out.println("Musica Encerrada");
    }
}
