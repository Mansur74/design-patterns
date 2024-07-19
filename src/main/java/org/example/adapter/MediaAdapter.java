package org.example.adapter;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedCharger;

    public MediaAdapter(String type)
    {
        if(type.equalsIgnoreCase("mp3"))
            this.advancedCharger = new Mp3Player();

        else if(type.equalsIgnoreCase("mp4"))
            this.advancedCharger = new Mp4Player();

        else if(type.equalsIgnoreCase("vlc"))
            this.advancedCharger = new VlcPlayer();

    }
    @Override
    public void charge(String type, String phone) {
        if(type.equalsIgnoreCase("mp3"))
            this.advancedCharger.playMp3(phone);

        else if(type.equalsIgnoreCase("mp4"))
            this.advancedCharger.playMp4(phone);

        else if(type.equalsIgnoreCase("vlc"))
            this.advancedCharger.playVlc(phone);
    }
}
