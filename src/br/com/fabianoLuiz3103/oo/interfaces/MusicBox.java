package br.com.fabianoLuiz3103.oo.interfaces;

public record MusicBox(String musix, boolean isPaused) implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("A caixa de música está tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de música está pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de música está parando a música");
    }

}
