import java.util.Calendar;

public class Time {
    public int hour;
    public int minute;
    public int seconds;

    public Time(){
        Calendar calendar = Calendar.getInstance();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.hour = calendar.get(Calendar.MINUTE);
        this.seconds = calendar.get(Calendar.SECOND);
    };
    public Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public Time(int hour,int minute, int seconds){
        this(hour,minute);
        this.seconds = seconds;
    }

    public void displayTime(){
        System.out.println(hour + ":" + minute + ":" + seconds );
    }
}
