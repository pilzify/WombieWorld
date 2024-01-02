package net.pilzify.wombieworld.utils;

public class Timer {
    public long start;
    public long duration;

    public Timer(long durationInMillis) {
        this.start = System.currentTimeMillis();
        this.duration = durationInMillis;
    }

    public long elapsed() {return System.currentTimeMillis() - this.start;}

    public boolean expired() {return this.elapsed() >= duration;}
}
