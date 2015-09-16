package easy;

public class P066_PlusOne {

	public int[] plusOne(int[] digits) {

		int length = digits.length;
		
		int carry = 1;
		for (int i = length - 1; i >= 0; i--) {
			digits[i] = digits[i] + carry;
			if (digits[i] == 10) {
				digits[i] = 0;
				carry = 1;
			} else {
				return digits;
			}
		}
		int[] newDigits = new int[length+1];
		newDigits[0] = 1;
		return newDigits;
	}
}
