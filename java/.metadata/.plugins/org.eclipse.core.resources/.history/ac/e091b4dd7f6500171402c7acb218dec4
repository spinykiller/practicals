package practicles;

public class daysOfYear {

	int year;
	int month;
	public void setyear(int y) throws Exception
	{
		if(y>0){
			year=y;
		}
		else{
			Exception exception = new Exception("year not proper");
			throw exception;
		}
	}
	public void setmonth(int m) throws Exception
	{
		if(m>0 && m<=12){
			month=m;
		}
		else{
			Exception exception = new Exception("Month not proper");
			throw exception;
		}
	}
	public int getDays()
	{
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		return 31;	
		case 2:
		{
			return (year%4==0 && year%100==0 && year%400!=0)?29:28;
		}
		default:
			return 30; 
		
		}
		
	}
}
