package practical;
class triangle{
	int height,width;
	triangle(){
		height=0;
		width=0;	
	}
	triangle(int h,int w){
		height=h;
		width=w;	
	}
	int findArea()
	{
		return (height*width/2);
	}
}
public class p2q1AreaTri {
public static void main(String[] args) {
	triangle t=new triangle();
	System.out.println(t.findArea());
	t=new triangle(10,15);
	System.out.println(t.findArea());
	}
}
