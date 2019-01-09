package Utils;

public class CaculateSel {
		private String[] a;
		private int nElems;
		/**
		 * 初始化
		 */
		public CaculateSel(int max) {
			a= new String[max];
			nElems = -1;
		}
		/**
		 * 插入数组
		 */
		public void push(String value) {
			a[++nElems] =  value;
		}
		
		/**
		 * 获取数组
		 */
		public String  pop() {
			if(nElems<0) {
				return "SelIsEmpty";
			}
			return a[nElems--];
		}
		/**
		 * 尺寸
		 * @return
		 */
		public int size() {
			return nElems+1;
		}
		
		public boolean isEmpty() {
			return (nElems == -1);
		}
		/**
		 * 显示当前状态下的数组情况
		 */
		public void display() {
			for(int j =0 ; j<=nElems ; j++) {
				System.out.print(a[j] + "  ");
			}
			System.out.println();
		}
		
		public static void main(String[] args) {
			CaculateSel sel = new CaculateSel(100);
			sel.push("lll");
			sel.push("222");
			sel.push("333");
			sel.push("444");
			sel.display();
			
			System.out.println(	sel.pop());
			sel.display();
			
		}
		
	}

