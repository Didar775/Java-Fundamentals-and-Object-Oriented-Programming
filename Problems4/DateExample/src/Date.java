public class Date implements Comparable{

    private int year;
    private int month;
    private int day;

    public Date(){}
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return String.format("%04d-%02d-%02d", year, month, day);
    }


    @Override
    public int compareTo(Object o) {
        Date date = (Date) o;
       if (year != date.year)
           return Integer.compare(year, date.year);
       else if (month != date.month)
           return Integer.compare(month, date.month);
       else
        return Integer.compare(day, date.day);
    }
}
