package Utils;

public class Sort {
	public static void main(String[] args) {
		 int[] arr = {77 , 66 , 88 , 11 , 44 , 33 , 22 , 99 , 55 , 0  };
	        for(int i =0;i<arr.length-1;i++) { 
	            for(int j=0;j<arr.length-i-1;j++) {//-1ÎªÁË·ÀÖ¹Òç³ö
	                if(arr[j]>arr[j+1]) {
	                    int temp = arr[j];
	                     
	                    arr[j]=arr[j+1];
	                     
	                    arr[j+1]=temp;
	            }
	            }    
	        }
	        for(int j : arr) {
	        	System.out.print(j + "  ");
	        }
	       
	}
}
