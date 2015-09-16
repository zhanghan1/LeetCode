package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * 
 * 我的想法:
 * 如何计算重复的区域
 * (1)当没有重复的区域时，返回0
 * (2)当有重复区域时，
 * 分为x，y两组，并分别排序
 * 重复区域的面积area = (x3-x2)*(y3-y2)
 * 即第二大的数和第三大的数
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
//          x3一定在C,G中，x2一定在A,E中
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
