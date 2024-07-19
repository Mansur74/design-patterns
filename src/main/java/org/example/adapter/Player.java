package org.example.adapter;

public class Player implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void charge(String type, String phone) {
        this.mediaAdapter = new MediaAdapter(type);
        this.mediaAdapter.charge(type, phone);
    }
}
