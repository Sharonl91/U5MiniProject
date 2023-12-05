public class Time {
    public int hour;
    public int minute;
    public int second;
    public boolean am;
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void tick(){
        second ++;
        correctTime();
    }
    public void correctTime(){
        if (second >= 60){
            minute ++;
            second -= 60;
        }
        if (minute >= 60){
            hour ++;
            minute -= 60;
        }
        if (hour >= 24){
            hour -= 24;
        }
    }
    public void add(Time t){
        this.hour += t.hour;
        this.minute += t.minute;
        this.second += t.second;
        correctTime();
    }
    public String toString(){
        String h = String.format("%02d", hour);
        String m = String.format("%02d", minute);
        String s = String.format("%02d", second);
        String info = "";
        info = h + ":" + m + ":" + s;
        return info;
    }
}
