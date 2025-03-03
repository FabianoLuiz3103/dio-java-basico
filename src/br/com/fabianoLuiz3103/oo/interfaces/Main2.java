package br.com.fabianoLuiz3103.oo.interfaces;

public class Main2 {

    public static void main(String[] args) {
        VideoPlayer videoPlayer = new Computer();
        MusicPlayer musicPlayer = new Computer();
        runVideo(videoPlayer);
        runMusic(musicPlayer);
        /*
        ou
         */
        Computer computer = new Computer();
        runVideo(computer);
        runMusic(computer);
    }

    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }

}
