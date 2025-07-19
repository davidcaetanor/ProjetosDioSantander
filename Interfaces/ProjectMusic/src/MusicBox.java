public class MusicBox implements MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("A Caixa de Som esta tocando a musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Musica Pausada pela Caixa de Som");
    }

    @Override
    public void stopMusic() {
        System.out.println("Musica Encerrada");
    }
}
