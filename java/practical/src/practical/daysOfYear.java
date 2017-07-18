package practicles;

public class daysOfYear {

	int year;
	int month;
	public void setyear(int y) 	{
		if(y>0){
			year=y;
		}
		
	}
	public void setmonth(int m)
	{
		if(m>0 && m<=12){
			month=m;
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
