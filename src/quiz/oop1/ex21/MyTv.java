package quiz.oop1.ex21;

public class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    private static final int MAX_VOLUME = 100;
    private static final int MIN_VOLUME = 0;
    private static final int MAX_CHANNEL = 100;
    private static final int MIN_CHANNEL = 1;

    public MyTv() {
    }

    public MyTv(boolean isPowerOn, int channel, int volume) {
        this.isPowerOn = isPowerOn;
        this.channel = channel;
        this.volume = volume;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void turnOnOff() {
        // isPowerOn 값이 true면 false로, false면 true로 바꾼다.
        if (this.isPowerOn = true) {
            isPowerOn = false;
        } else {
            isPowerOn = true;
        }
    }

    public void volumeUp() {
        // volume의 값이 MAX_VOLULME보다 작을 떄만 값을 1 증가시킨다.
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    public void volumeDown() {
        // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }

    public void channelUp() {
        // (4) channel의 값을 1 증가시킨다.
        // 만일 channel이 MAX_CHANNEL이면 , channel의 MIN_CHANNEL 값을 로 바꾼다.
        if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        } else {
            ++channel;
        }
    }

    public void channelDown() {
        // (5) channel의 값을 1 감소시킨다 .
        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL 로 바꾼다.

        if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        } else {
            --channel;
        }
    }
}