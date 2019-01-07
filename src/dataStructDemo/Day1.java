package dataStructDemo;

public class Day1 {
	public  void testInnerClass() throws CloneNotSupportedException {
		
		Demo  demo =  new Demo();
		demo.setA("1111");
		Demo  demo1 = (Demo)demo.clone();
		demo1.setA("222222");
		demo1.getClass();
		System.out.println(demo1.getClass());
		System.out.println(demo.getA());
		System.out.println(demo1.getA());
		System.out.println(demo.hashCode());
		System.out.println(demo1.hashCode());
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Day1 day1= new Day1();
		day1.testInnerClass();
	}
	
}
