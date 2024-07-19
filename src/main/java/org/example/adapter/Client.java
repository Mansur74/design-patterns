package org.example.adapter;

public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        player.charge("mp3", "video.mp4");
        player.charge("mp4", "video.mp4");
        player.charge("vlc", "müzik.mp3");
    }
}
