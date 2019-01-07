package dataStructDemo;

public class SortDemo {
public static void main(String[] args) {
	int [] a  = {11,22,44,55,23,12,99,78,45};
	for(int i = 0; i<a.length;i++) {
		for(int j = 0; j<a.length - i-1; j++) {
			if(a[j] > a[j+1]) {
				int c = a[j];
				a[j] = a[j+1];
				a[j+1] = c;
			}
		}
	}
	for(int c : a) {
		System.out.println(c+",");
	}
}
}
