package com.nighthawk.spring_portfolio.mvc.calendar;

import java.io.InputStream;

/** Simple POJO 
 * Used to Interface with APCalendar
 * The toString method(s) prepares object for JSON serialization
 * Note... this is NOT an entity, just an abstraction
 */
class Year {
   private int year;
   private int month;
   private int day;
   private boolean isLeapYear;
   private int firstDayOfYear;
   private int dayOfYear;

   // zero argument constructor
   public Year() {} 

   /* year getter/setters */
   public int getYear() {
      return year;
   }
   public void setYear(int year) {
      this.year = year;
      this.setIsLeapYear(year);
      this.setfirstDayOfYear(year);
   }

   /* isLeapYear getter/setters */
   public boolean getIsLeapYear(int year) {
      return APCalendar.isLeapYear(year);
   }
   private void setIsLeapYear(int year) {  // this is private to avoid tampering
      this.isLeapYear = APCalendar.isLeapYear(year);
   }

   /* isLeapYearToString formatted to be mapped to JSON */
   public String isLeapYearToString(){
      return ( "{ \"year\": "  +this.year+  ", " + "\"isLeapYear\": "  +this.isLeapYear+ " }" );
   }	

   // GetFirstYear
   public int getfirstDayOfYear(int year) {
      return APCalendar.firstDayOfYear(year);
   }
   private void setfirstDayOfYear(int year) {  // this is private to avoid tampering
      this.firstDayOfYear = APCalendar.firstDayOfYear(year);
   }

   /* isLeapYearToString formatted to be mapped to JSON */
   public String firstDayOfYearToString(){
      return ( "{ \"year\": "  +this.year+  ", " + "\"firstDayOfYear\": "  +this.firstDayOfYear+ " }" );
   }	


   //Day of year
   public int getdayOfYear(int month, int day, int year) {
      return APCalendar.dayOfYear(month, day, year);
   }
   private void setdayOfYear(int year) {  // this is private to avoid tampering
      this.dayOfYear = APCalendar.dayOfYear(year);
   }

   /* isLeapYearToString formatted to be mapped to JSON */
   public String dayOfYearToString(){
      return ( "{ \"year\": "  +this.year+  ", " \"year\": "  +this.year+  ", " + "\"dayOfYear\": "  +this.dayOfYear+ " }" );
   }	


   /* standard toString placeholder until class is extended */
   public String toString() { 
      return isLeapYearToString(); 
   }

   public static void main(String[] args) {
      Year year = new Year();
      year.setYear(2022);
      System.out.println(year);
   }

// public InputStream firstDayOfYearToString() {
//     return null;
// }
}