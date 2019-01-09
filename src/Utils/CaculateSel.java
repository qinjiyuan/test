package Utils;

public class CaculateSel {
		private String[] a;
		private int nElems;
		/**
		 * ��ʼ��
		 */
		public CaculateSel(int max) {
			a= new String[max];
			nElems = -1;
		}
		/**
		 * ��������
		 */
		public void push(String value) {
			a[++nElems] =  value;
		}
		
		/**
		 * ��ȡ����
		 */
		public String  pop() {
			if(nElems<0) {
				return "SelIsEmpty";
			}
			return a[nElems--];
		}
		/**
		 * �ߴ�
		 * @return
		 */
		public int size() {
			return nElems+1;
		}
		
		public boolean isEmpty() {
			return (nElems == -1);
		}
		/**
		 * ��ʾ��ǰ״̬�µ��������
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

