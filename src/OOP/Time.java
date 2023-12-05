package OOP;

public class Time {
    private String time;
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours) {
        this.hours = hours;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getHours() {
        return this.hours;
    }
    public int getMinutes() {
        return this.minutes;
    }
    public int getSeconds() {
        return this.seconds;
    }

    public void setHours(int hours) {
        if (hours <= 0 || hours > 23) {
            hours = 0;
            System.out.println("Incorrect hours input");
            return;
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes <= 0 || minutes > 59) {
            minutes = 0;
            System.out.println("Incorrect minutes input");
            return;
        }
            this.minutes = minutes;
    }

        public void setSeconds(int seconds){
            if (seconds <= 0 || seconds > 59) {
                seconds = 0;
                System.out.println("Incorrect seconds input");
                return;
            }
            this.seconds = seconds;
        }

        public String timeToString () {
            return String.format("%02d:%02d:%02d", hours, minutes, seconds);

        }
    }




