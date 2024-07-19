package org.example.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {


    @Override
    public void playMp3(String file) {

    }

    @Override
    public void playMp4(String file) {

    }

    @Override
    public void playVlc(String file) {
        System.out.println(file + " is playing with vlc player");
    }
}
