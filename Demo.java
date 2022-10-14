class Super{
	int i = 20;
	System.out.println("hello");
	System.out.println("Amit Developer");

}

class sub extends Super{
	int i = 30;
	
}


public class inherit_exam_1 {
	public static void main(String args[]) {
		Super b = new sub();
		System.out.println(b.i);
		
		
		
	}
}
