package com.androidplayground.dsolutions.mypersonalworkbook;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class HomeScreenPresenter {

    HomeScreenView view;
    private Calendar calendar = Calendar.getInstance();
    private String currentTime;

    HomeScreenPresenter(HomeScreenView view) {
        this.view = view;
    }

    void showTime(){
        currentTime = currentTime();
        view.showCurrentTime(currentTime);
    }


    String currentTime() {
        DateFormat timeFormat = new SimpleDateFormat("h:mm a", Locale.UK);
        currentTime = timeFormat.format(calendar.getTime());
        return currentTime;
    }

    void showGreetings() {
        int hourOfDday = calendar.get(Calendar.HOUR_OF_DAY);
        String greeting;
        if ((hourOfDday >= 1) && (hourOfDday <= 12)) {
             greeting = "Good Morning Dee";
             view.showGreetingsMessage(greeting);
        } else if ((hourOfDday >= 12) && (hourOfDday <= 18)) {
            greeting = "Good Day Dee";
            view.showGreetingsMessage(greeting);
        } else if ((hourOfDday >= 18) && (hourOfDday <= 24)) {
            greeting = "Good Evening Dee";
            view.showGreetingsMessage(greeting);

        }
    }


}
