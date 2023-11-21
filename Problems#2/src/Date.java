import java.util.Calendar;

public class Date {
    public int year;
    public int month;
    public int day;
    public Time time = new Time();
    public Date(){
        Calendar calendar = Calendar.getInstance() ;
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.time.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.time.minute = calendar.get(Calendar.MINUTE);
        this.time.seconds = calendar.get(Calendar.SECOND);

    };
    public Date(int year, int month, int day){
        this();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date (int year, int month, int day, Time time){
        this(year, month, day);
        this.time = time;
    }

    public void displaysDate(){
        System.out.println(year + "." + month + "." + day);
    }

    public void moveByDays(int days){

       Calendar calendar = Calendar.getInstance();
       calendar.set(year,month,day,time.hour,time.minute,time.seconds);
       calendar.add(Calendar.DAY_OF_MONTH, days);

       this.year = calendar.get(Calendar.YEAR);
       this.month = calendar.get(Calendar.MONTH);
       this.day = calendar.get(Calendar.DAY_OF_MONTH);
       this.time.hour = calendar.get(Calendar.HOUR_OF_DAY);
       this.time.minute = calendar.get(Calendar.MINUTE);
       this.time.seconds = calendar.get(Calendar.SECOND);


    }

}
