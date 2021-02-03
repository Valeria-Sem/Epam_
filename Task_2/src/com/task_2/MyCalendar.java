package com.task_2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {
    int year;
    int month;

    public MyCalendar(int year, int month){
        this.year = year;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int calculateDaysInMonth(){
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, --month);

        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public boolean isLeapYear() {
        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();

        return cal.isLeapYear(year);
    }
}
