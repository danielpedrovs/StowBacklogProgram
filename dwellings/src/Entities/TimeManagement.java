package Entities;


public class TimeManagement {

    private long start;
    long elapsedTime;

    public TimeManagement() {
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public TimeManagement(long start, long elapsedTime) {
        this.start = start;
        this.elapsedTime = elapsedTime;
    }

}
