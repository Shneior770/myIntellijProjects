package marketproject;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;


public class Clerck {

    private LocalDateTime currentTime;
    private LocalDateTime timeInFiveMinutes;

    public void serveCustomer() {
        currentTime = LocalDateTime.now();
        timeInFiveMinutes = currentTime.plusMinutes(1);
    }

    public boolean isClerckOccupied() {
        if (timeInFiveMinutes != null) {
            currentTime = LocalDateTime.now();

            if (currentTime.isAfter(timeInFiveMinutes)) {
                return false;
            } else {
                return true;
            }
        }

        return false;
    }
}

