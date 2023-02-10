package overriding;

public class r2 extends r1 {
	
	public void j1(int q, String r)
	{
		System.out.println("method override");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		r2 u=new r2();
		u.j1(65,"sky");
		u.j1(67,"sky");
	}

}
