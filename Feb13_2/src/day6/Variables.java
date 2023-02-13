package day6;

public class Variables {

	
	int r=23;
	static int g=25;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int f=28;
 System.out.println(f);//local variable 28
 System.out.println(g); //static variable 25
 
 Variables test=new Variables();
 System.out.println(test.r); //instant var 23
	}

}
