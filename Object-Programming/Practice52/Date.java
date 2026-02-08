//컴퓨터학과 20250492 이윤진
public class Date {
	private int year;
    private int month;
    private int day;
    
    public String toString(){
        String rslt ="";
        rslt += year +"년 ";
        rslt += month + "월 ";
        rslt += day + "일";
        
        return rslt;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    
    public Date(int year, int month, int day) {
    	this.year = year;
    	this.month = month;
    	this.day = day;
    }
    public Date() {
    	this(1900, 1, 1);
    }
    
    public static int compareDate (Date x, Date y) {
    	if(x.getYear() < y.getYear()) {
    		return -1;
    	}
    	else if(x.getYear() > y.getYear()) {
    		return 1;
    	}
    	else {
    		if(x.getMonth() < y.getMonth()) {
    			return -1;
    		}
    		else if(x.getMonth() > y.getMonth()) {
    			return 1;
    		}
    		else {
    			if(x.getDay() < y.getDay()) {
    				return -1;
    			}
    			else if(x.getDay() > y.getDay()) {
    				return 1;
    			}
    			else {
    				return 0;
    			}
    		}
    	}
    }
    
}
