package easy;

public class P036_ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		int[] vec = new int[10];

		// 判断每一行
		for (int i = 0; i < 9; i++) {
			memset(vec, 0);
			for (int j = 0; j < 9; j++) {
				if(!Character.isDigit(board[i][j]))
					continue;
				if (vec[board[i][j] - '0'] == 1) {
					return false;
				} else {
					vec[board[i][j] - '0'] = 1;
				}
			}
		}

		//判断每一列
		for (int i = 0; i < 9; i++) {
			memset(vec, 0);
			for (int j = 0; j < 9; j++) {
				if(!Character.isDigit(board[j][i]))
					continue;
				if (vec[board[j][i] - '0'] == 1) {
					return false;
				} else {
					vec[board[j][i] - '0'] = 1;
				}
			}
		}
		// 判断每一个正方形
		for (int i = 0; i <= 6; i+=3) {
			for(int j = 0; j <= 6; j+=3) {
				memset(vec, 0);
				for(int row = i;row<i+3;row++) {
					for(int column = j; column < j+3;column++) {
						if(!Character.isDigit(board[row][column]))
							continue;
						if(vec[board[row][column] - '0'] == 1) {
							return false;
						} else {
							vec[board[row][column] - '0'] = 1;
						}
					}
				}				
			}
		}
		return true;
	}

	public static void memset(int[] vec, int value) {
		int length = vec.length;
		for (int i = 0; i < length; i++) {
			vec[i] = value;
		}
	}
}
