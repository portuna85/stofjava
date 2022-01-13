package Oop2;

public class Time {
    private static int hour;
    private int min;
    private int sec;

    public Time() {
    }

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            return;
        } else {
            this.hour = hour;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min < 0 || min > 23) {
            return;
        } else {
            this.min = min;
        }
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (sec < 0 || sec > 23) {
            return;
        } else {
            this.sec = sec;
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", min=" + min +
                ", sec=" + sec +
                '}';
    }
}
