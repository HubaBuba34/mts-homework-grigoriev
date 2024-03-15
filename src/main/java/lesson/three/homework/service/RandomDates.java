package lesson.three.homework.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

public class RandomDates {
    public static int createRandomIntBetween(int start, int end){
        return start + (int)Math.round(Math.random() * (end - start));
    }
    public static LocalDate createRandomDate(int startYear, int endYear){
        GregorianCalendar calendar = new GregorianCalendar();
        int year = createRandomIntBetween(2008,2024);
        calendar.set(calendar.YEAR, year);
        int dayOfYear = createRandomIntBetween(1, calendar.getActualMaximum(calendar.DAY_OF_YEAR));
        calendar.set(calendar.DAY_OF_YEAR, dayOfYear);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate convertToLocalDate = LocalDate.parse(calendar.get(calendar.YEAR) + "-" + (calendar.get(calendar.MONTH) + 1) + "-"
                + calendar.get(calendar.DAY_OF_MONTH), formatter);
        return convertToLocalDate;
    }
}
