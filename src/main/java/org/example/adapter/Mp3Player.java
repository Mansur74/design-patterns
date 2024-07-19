package org.example.adapter;

public class Mp3Player implements AdvancedMediaPlayer{
    @Override
    public void playMp3(String file) {
        System.out.println(file + " is playing with mp3 player");
    }

    @Override
    public void playMp4(String file) {

    }

    @Override
    public void playVlc(String file) {

    }
}
