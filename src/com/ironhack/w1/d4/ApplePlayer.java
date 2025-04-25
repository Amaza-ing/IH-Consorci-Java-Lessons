package com.ironhack.w1.d4;

public class ApplePlayer extends Player implements IPlayable{
    public ApplePlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Closing Apple Player");
    }

    @Override
    public void play() {
        System.out.println("Playing Apple player");
    }

    @Override
    public void pause() {
        System.out.println("Pausing Apple player");
    }

    @Override
    public void mute() {
        setVolume(0);
    }

    @Override
    public void increaseVolume() {
        setVolume(getVolume() + 0.1);
    }
}
