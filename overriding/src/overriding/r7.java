package overriding;

public  class r7 {
	
	
	public void sr()
	{
		System.out.println("nashik");
	}
}
	
	public class pt extends r7
	{
		public void j()
				{
			System.out.println("aurangabad");
				}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  pt sd= new pt(); 
  sd.j();
  sd.sr();
		
	}
	}

