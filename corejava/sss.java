package corejava;

 class donga {
public  void sanjay(){
	System.out.println("a+b");
	
}

}
class sudhir extends donga{
	void babloo (){
		
		super.sanjay();
		System.out.println("a*b");
		
	}
	
}
public class sss{
	public static void main(String args[]){
		sudhir prashi=new sudhir();
		prashi.babloo();
	}
}