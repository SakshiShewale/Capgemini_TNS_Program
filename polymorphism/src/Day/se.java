package Day;

public class se {

	
	public void s1(int a, String b)
	{
		System.out.println("overloading method");
	}
	
	public void s1(String a,int b)
	{
		System.out.println("method overloading");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	se h = new se();
	h.s1(12,"swa");
	h.s1("swa",12);

	}

}
