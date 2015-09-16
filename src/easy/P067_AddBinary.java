package easy;
/*
 * 
 * 以前的方法太笨了
 * 学会使用% /
 * 学会使用string 
 */
public class P067_AddBinary {

	public static String addBinary(String a, String b) {

		String res = "";
		int pa = a.length() - 1;
		int pb = b.length() - 1;
		int carry = 0;
		while (pa >= 0 && pb >= 0) {
			int tempResult = (a.charAt(pa) - '0') + (b.charAt(pb) - '0') + carry;
			res = tempResult%2 + res;
			carry = tempResult/2;
			pa--;
			pb--;
		}
		if (a.length() > b.length()) {
			while (pa >= 0) {
				int tempResult = (a.charAt(pa) - '0') + carry;
				res = tempResult%2 + res;
				carry = tempResult/2;
				pa--;
			}
		} else if (a.length() < b.length()) {
			while (pb >= 0) {
				int tempResult = (b.charAt(pb) - '0') + carry;
				res = tempResult%2 + res;
				carry = tempResult/2;
				pb--;
			}
		}

		if(carry == 1) {
			res = '1' + res;
		}
		return res;
	}
	
	public static void main(String args[]) {
		String a = "1000001";
		String b = "1";
		System.out.println(addBinary(a,b));
	}
}
