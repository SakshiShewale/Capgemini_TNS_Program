package day4; 

public class Base {
 
	 int varDefault=10;
	 public int varPublic=20;
	 private int varPrivate=30;
	 protected int varProtected=40;
	 
	 void methodDefault();
	 {
		 System.out.println("Default access Base class");
		 System.out.println("Default Variable: "+varDefault);
	 }
	 
	 public void methodPublic();
	 {
		 System.out.println("Default access Base class");
		 System.out.println("Default Variable: "+varPublic);
	 }
	 
	 private void methodPrivate();
	 {
		 System.out.println("Default access Base class");
		 System.out.println("Default Variable: "+varPrivate);
	 }
	 
	 protected void methodProtected();
	 {
		 System.out.println("Default access Base class");
		 System.out.println("Default Variable: "+varProtected);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
