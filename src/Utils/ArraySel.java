package Utils;
/**
 * ≈≈–Ú
 * @author BestSteven
 *
 */
public class ArraySel {
	private long[] a;
	private int nElems;
	
	public ArraySel(int max) {
		a= new long[max];
		nElems = 0;
	}
	
	public void insert(long value) {
		a[nElems] =  value;
		nElems ++ ;
	}
	
	public void display() {
		for(int j =0 ; j<nElems ; j++) {
			System.out.print(a[j] + "  ");
		}
		System.out.println();
	}
	
	public void selectionSort() {
		
		int out,in;
		 for(out =0 ; out < nElems-1 ; out++) {
				long temp = a[out];
				in = out;
				while(in > 0 && a[in-1] >= temp) {
					a[in] =a[in-1];
					--in;
				}
				a[in] = temp;
			 }
		
	}
	
	public void sortSort() {
		 int out;
		 for(out =0 ; out < nElems-1 ; out++) {
			 long temp = 0;
			 int times =  nElems-out-1;
			 int location = 0;
			 while(times >= 0) {
				 if(a[times]>temp) {
					 temp = a[times];
					 location = times;
				 }
				 --times;
			 }
			a[location] = a[nElems-out-1];
			a[nElems-out-1] = temp;
			
			
			
		 }
	}
	
	
	public static void main(String[] args) {
		int maxSize = 100;
		ArraySel arr;
		arr = new ArraySel(maxSize);
		arr.insert(88);
		arr.insert(77);
		arr.insert(66);
		arr.insert(11);
		arr.insert(44);
		arr.insert(33);
		arr.insert(22);
		arr.insert(99);
		arr.insert(55);
		arr.display();
		arr.selectionSort();
		arr.sortSort();
		arr.display();
		
	}
}

	

