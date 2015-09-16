package medium;
/**
 * ²Î¿¼×ÊÁÏ
 * http://blog.csdn.net/lanyu317/article/details/22693685
 */
public class P011_ContainerWithMostWater {

	public int maxArea(int[] height) {
		
		int i = 0;
		int j = height.length - 1;
		int maxArea = 0;
		
		while (i < j) {
			int area = (j-i) * Math.min(height[i], height[j]);
			if (area > maxArea) {
				maxArea = area;
			}
			if (height[i] < height[j]) {
				i++;
			} else {
				j--;
			}
		}
		return maxArea;
    }
}
