package day5;

public class nett {
	private int  rollno;
	public void setrollno(int sahj)
	{
		this.rollno=sahj;
	}
	
	public int getrollno()
	{
		return rollno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nett f=new nett();
		f.setrollno(22);
		f.setrollno(67);
		f.setrollno(92);
		f.setrollno(523);
		f.setrollno(49);
		f.setrollno(25);
		
		
		System.out.println(f.getrollno());
	}

}
