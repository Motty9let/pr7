package Mypackage;

import java.util.GregorianCalendar;

class DateExample {
    public static void main(String[] args) {
        // Текущая дата
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // Месяцы нумеруются с 0
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Текущая дата: " + year + "-" + month + "-" + day);

        // Дата для заданного времени
        long milliseconds = 1234567898765L;
        GregorianCalendar calendar2 = new GregorianCalendar();
        calendar2.setTimeInMillis(milliseconds);
        year = calendar2.get(GregorianCalendar.YEAR);
        month = calendar2.get(GregorianCalendar.MONTH) + 1;
        day = calendar2.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Дата для " + milliseconds + " миллисекунд: " + year + "-" + month + "-" + day);
    }
}
