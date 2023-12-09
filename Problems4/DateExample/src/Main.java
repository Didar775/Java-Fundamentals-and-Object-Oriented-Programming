import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main{
    public static  void main(String[] args){

        Date date1 = new Date(2002,9,1);
        Date date2 = new Date(2004,10,9);
        Date date3 = new Date(2020, 5,17);

        List<Date> listDate = new ArrayList<>();

        listDate.add(date1);
        listDate.add(date2);
        listDate.add(date3);

        Collections.sort(listDate);

        for (Date date : listDate){

            System.out.println(date);
        }

    }

}