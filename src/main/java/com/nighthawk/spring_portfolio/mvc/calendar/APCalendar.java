package com.nighthawk.spring_portfolio.mvc.calendar;

// Prototype Implementation

public class APCalendar {

    /** Returns true if year is a leap year and false otherwise.
     * isLeapYear(2019) returns False
     * isLeapYear(2016) returns True
     */          
    public static boolean isLeapYear(int year) {
        // implementation not shown
        if ((year%4==0 && year%100!=0) || year%400==0) {
            return true;
        }
        else {
            return false;
        }
    }
        
    /** Returns the value representing the day of the week 
     * 0 denotes Sunday, 
     * 1 denotes Monday, ..., 
     * 6 denotes Saturday. 
     * firstDayOfYear(2019) returns 2 for Tuesday.
    */
    private static int firstDayOfYear(int year) {
        // implementation not shown

        if (isLeapYear(year)) {
            year --;
        }
        else {
            year +=0;
        }

        year = year % 7;

        return year;
        }


    /** Returns n, where month, day, and year specify the nth day of the year.
     * This method accounts for whether year is a leap year. 
     * dayOfYear(1, 1, 2019) return 1
     * dayOfYear(3, 1, 2017) returns 60, since 2017 is not a leap year
     * dayOfYear(3, 1, 2016) returns 61, since 2016 is a leap year. 
    */ 
    private static int dayOfYear(int month, int day, int year) {
        // implementation not shown

        int n=0;
        int feb;

        if (isLeapYear(year)) {
            feb=29;
        }
        else {
            feb=28;
        }
        

        if (month==2) {
            n+=31;
        }
        else if (month==3) {
            n=31+feb;
        }
        else if (month==4) {
            n=62+feb;
        }
        else if (month==5) {
            n=92+feb;
        }
        else if (month==6) {
            n=123+feb;
        }
        else if (month==7) {
            n=153+feb;
        }
        else if (month==8) {
            n=184+feb;
        }
        else if (month==9) {
            n=215+feb;
        }
        else if (month==10) {
            n=245+feb;
        }
        else if (month==11) {
            n=276+feb;
        }
        else if (month==12) {
            n=306+feb;
        }
       
        n+=day;

        return n;
        }

    /** Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
    */ 
    public static int numberOfLeapYears(int year1, int year2) {
         // to be implemented in part (a)

        return 0;
        }

    /** Returns the value representing the day of the week for the given date
     * Precondition: The date represented by month, day, year is a valid date.
    */
    public static int dayOfWeek(int month, int day, int year) { 
        // to be implemented in part (b)
        return 0;
        }

    /** Tester method */
    public static void main(String[] args) {
        // Private access modifiers
        System.out.println("firstDayOfYear 2022: " + APCalendar.firstDayOfYear(2022));
        System.out.println("firstDayOfYear 2021: " + APCalendar.firstDayOfYear(2021));
        System.out.println("firstDayOfYear 2020: " + APCalendar.firstDayOfYear(2020));
        System.out.println("dayOfYear (leap): " + APCalendar.dayOfYear(3, 1, 2020));
        System.out.println("dayOfYear (no leap): " + APCalendar.dayOfYear(3, 1, 2021));

        // Public access modifiers
        System.out.println("isLeapYear: " + APCalendar.isLeapYear(2022));
        System.out.println("numberOfLeapYears: " + APCalendar.numberOfLeapYears(2000, 2022));
        System.out.println("dayOfWeek: " + APCalendar.dayOfWeek(1, 1, 2022));
    }

}