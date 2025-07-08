public class SmartPhone implements VideoPlayer,MusicPlayer{

    @Override
    public void playVideo() {
        System.out.println("O SmartPhone esta rodando o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Video Pausado pelo SmarthPhone");
    }

    @Override
    public void stopVideo() {
        System.out.println("Video Encerrado");
    }

    @Override
    public void playMusic() {
        System.out.println("O SmartPhone esta tocando a musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Musica Pausada pelo SmarthPhone");
    }

    @Override
    public void stopMusic() {
        System.out.println("Musica Encerrada");
    }
}
