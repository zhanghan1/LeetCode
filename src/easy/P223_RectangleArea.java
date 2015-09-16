package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * 
 * �ҵ��뷨:
 * ��μ����ظ�������
 * (1)��û���ظ�������ʱ������0
 * (2)�����ظ�����ʱ��
 * ��Ϊx��y���飬���ֱ�����
 * �ظ���������area = (x3-x2)*(y3-y2)
 * ���ڶ�������͵��������
 */

public class P223_RectangleArea {

	
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		
		int commonArea = 0 ;
		if (C <= E || G <= A || D <= F || H <= B) {
			commonArea = 0;
		} else {
			List<Integer> xList = new ArrayList<Integer>();
			xList.add(A);
			xList.add(C);
			xList.add(E);
			xList.add(G);
			Collections.sort(xList);
			List<Integer> yList = new ArrayList<>();
			yList.add(B);
			yList.add(D);
			yList.add(F);
			yList.add(H);
			Collections.sort(yList);
			int x2 = xList.get(1);
			int x3 = xList.get(2);
			int y2 = yList.get(1);
			int y3 = yList.get(2);
			
			commonArea = (x3-x2) * (y3-y2);
//          x3һ����C,G�У�x2һ����A,E��
//			int x = Math.min(C, G) - Math.max(A, E);
//	        int y = Math.min(D, H) - Math.max(B, F);
//	        commonArea = x * y;
		}
		int area1 = (C-A)*(D-B);
        int area2 = (G-E)*(H-F);
		
		return area1 + area2 - commonArea;
	}
	
	public static void main(String args[]) {
		System.out.println(computeArea(-2, -2, 2, 2, 1, -3, 3, -1));
	}
	
	
}
