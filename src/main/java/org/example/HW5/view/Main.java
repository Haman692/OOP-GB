package org.example.HW5.view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        DateFormat df = new SimpleDateFormat("d.MM.YYYY", Locale.ENGLISH);
        System.out.println(df.format(calendar.getTime()));
    }

}
