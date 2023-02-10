package overriding;

public class tr1 {
	public void hu(int s, String q)
	{
		System.out.println("just");
		
	}
	
	public void hu(String w,int d)
	{
		System.out.println("kidding");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tr1 dty=new tr1();
		dty.hu(23,"ere");
		dty.hu("ffsfs",45);
	}
}
