package practicles;

public class binaryOrNot {
	String num;
	public void setNum(String s)
	{
		num=s;
	}
	public boolean check()
	{	
		int len=num.length();
		for(int i=0;i<len;i++)
		{
			if(num.charAt(i)!='1' && num.charAt(i)!='0')
				return false;
		}
		return true;
	}
}
