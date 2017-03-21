package corejava;

public class pro {
	public static void main(String args[]){
		ccc eee=new ccc();
		eee.ddd();
	}

}
class aaa {
	void bbb (){
		int a=10,b=25;
		System.out.println(a-b);
	}
}
class ccc extends aaa{
	void ddd(){
		super.bbb();
		System.out.println("hello");
	}
}
