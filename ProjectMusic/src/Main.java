public class Main {
    public static void main(String[] args) {
        SmartPhone celular = new SmartPhone();
        Computer computador = new Computer();
        MusicBox caixaDeSom = new MusicBox();
        runMusic(celular);
        runMusic(computador);
        runVideo(celular);
        runVideo(computador);
        runMusic(caixaDeSom);
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

}
