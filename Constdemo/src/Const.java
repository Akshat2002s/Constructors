
public class Const {
	int i;
	static int j;
	String s;
	
	public Const() {
		i=20;
		j=18;
		s= "Akshat";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Const obj= new Const();
		obj.i=22;
		Const.j=23;
		obj.add(obj.i, Const.j);
		System.out.println(obj.i);
		System.out.println(Const.j);
		System.out.println(obj.s);
		Const obj2= new Const();
		obj2.i=28;
		Const.j=25;
		System.out.println(Const.j);
		System.out.println(Const.j);
		

	}
public void add(int i, int j) {
	System.out.println(i+j);
}
}
