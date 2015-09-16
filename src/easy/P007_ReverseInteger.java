package easy;
/**
 * ע�����
 * (1)
 * int��ȡֵ��ΧΪ
 * Integer.MAX_VALUE = 2147483647(2��31�η���1)
 * Integer.MIN_VALUE = -2147483648(����2��31�η�)
 * (2)
 * ��һ��int���͵�ֵ��ת�󣬿��ܺ������ 
 * ����ж��Ƿ��������
 * ��ע��һ����Ҫת���������ж��Ƿ��������
 *  if(px > Integer.MAX_VALUE || px < Integer.MIN_VALUE) return 0;
 *  ��Ϊ�Ѿ���������ˣ�px��ָ�Ѿ��ǲ���ȷ���ˣ�
 *  ��ȷ���������ڽ�Ҫ���֮ǰ�����ж�
 *  if(px > Integer.MAX_VALUE/10 || px < Integer.MIN_VALUE/10) return 0;
 * (3)
 * ��ν�һ��������Χ�ڵ�intֵ���з�ת������������
 * public static int reverse(int x) {
		int px = 0;
		
		while(x != 0) {
			px = px * 10 + x % 10;
			x = x/10;
		}
		return px;
	}
	��������в�δ���Ƿ��ŵ���������ڸ���Ҳͬ�����á�
 */
public class P007_ReverseInteger {

	public static void main(String args[]) {
		int x = 1534236439;
		System.out.println(reverse(x)+"");
	}
	
	//���䷽��
	public static int reverse(int x) {
		int px = 0;
		
		while(x != 0) {
	    	if(px > Integer.MAX_VALUE/10 || px < Integer.MIN_VALUE/10) return 0;
			px = px * 10 + x % 10;
			x = x/10;
		}
	//  ����ʹ�����·����ж�����ķ������������ж�����ķ�����	
	//	if(px > Integer.MAX_VALUE || px < Integer.MIN_VALUE) return 0;
		return px;
	}
	
//	//�ҵĽⷨ��ת��Ϊ�ַ��������ַ������ã�������������
//	public static int reverse2(int x) {
//		String str = x+"";
//		int start = 0;
//		int end = str.length() - 1;
//		if(str.startsWith("-")) {
//			start = 1;
//		}
//		
//		char[] tempArray = str.toCharArray();
//		while(start != end && start - end != 1) {
//			char temp = tempArray[start];
//			tempArray[start] = tempArray[end];
//			tempArray[end] = temp;
//			start++;
//			end--;
//		}
//		
//		int result = 0;
//		try{
//			result = Integer.parseInt(new String(tempArray));
//		} catch(NumberFormatException e) {
//			
//		}
//		return result;
//	}
}
