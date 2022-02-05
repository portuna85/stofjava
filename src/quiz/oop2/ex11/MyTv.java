package quiz.oop2.ex11;

public class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevCh;

    private int MAX_VOLUME = 100;
    private int MIN_VOLUME = 0;
    private int MAX_CHANNEL = 99;
    private int MIN_CHANNEL = 1;

    public void setPowerOn(boolean powerOn) {
        this.isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {

        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) return;

        prevCh = this.channel;

        this.channel = channel;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume > this.MAX_VOLUME || volume < this.MIN_VOLUME)
            return;
        this.volume = volume;
    }

    public void gotoPrevChennel() {
        setChannel(prevCh);
    }
}