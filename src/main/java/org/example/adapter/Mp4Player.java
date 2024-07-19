package org.example.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playMp3(String file) {

    }

    @Override
    public void playMp4(String file) {
        System.out.println(file + " is playing with mp4 player");
    }

    @Override
    public void playVlc(String file) {

    }
}
