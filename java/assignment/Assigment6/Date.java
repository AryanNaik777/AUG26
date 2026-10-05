public class Date {
   private int day;
   private int month;
   private int year;
   public void setDate(int dd,int mm,int yy ){
       year= yy;
       if(mm<1 || mm>12)
           month=1;
       else
           month=mm;
       if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 )
           if(dd<1 || dd>31)
               day=1;
       else if(month==4 || month==6|| month==9 || month==11 )
               if(dd<1 || dd>30)
                   day=1;
       else if(month==2 )
               if((yy%4==0&& yy%100!=0)||yy%400==0)
                   if(dd<1 || dd>29)
                       day=1;
       else
                   if(dd<1 || dd>28)
                       day=1;

   }
   public void addDays(int days){
       day = day+days;

   }
    public void addMonths(int months) {
        month = month + months;
    }
    public void addYear(int years) {
        year = year + years;
    }

    public void display(){
        System.out.println("DATE"+day+"Month"+month +"Year"+year);
    }
public int getDay(){
       return day;
   }
    public int getMonth(){
        return month;
    }
    public int getYear() {
        return year;
    }



}
