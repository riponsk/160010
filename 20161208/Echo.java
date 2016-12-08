public class Echo{
	public static void main(String[] args) {
		 
		 while(true)
		 	System.out.println("人力してください>")
		 String data=new java.util.scanner(System.in).nextLine();
		 System.out.println(data);
		 if(data.equals("")){
		 	break;
		 }
	}
}