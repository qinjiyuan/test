package dataStructDemo;

public class Demo  implements Cloneable{
	private String a;
	private String b;
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Demo)super.clone();
	}

}
