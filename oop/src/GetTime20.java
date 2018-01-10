import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class GetTime20 extends Thread {

    public void run(){
        Date rightNow;
        Locale currentLocale;
        DateFormat timerFormater;
        DateFormat dateFormater;

        String timeOutput;
        String dateOutput;

        for (int i = 0; i < 20 ; i++) {
            rightNow = new Date();
            currentLocale = new Locale("he");

            timerFormater = DateFormat.getTimeInstance(DateFormat.SHORT,currentLocale);
            dateFormater = DateFormat.getDateInstance(DateFormat.LONG,currentLocale);

            timeOutput = timerFormater.format(rightNow);
            dateOutput = dateFormater.format(rightNow);

            System.out.println(timeOutput);
            System.out.println(dateOutput);
            System.out.println();

            try{
                sleep(1000);// do nothing for 1 second
            }catch (InterruptedException e){}

        }
    }


}
