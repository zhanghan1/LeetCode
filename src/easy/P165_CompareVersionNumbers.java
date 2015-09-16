package easy;
/*
 *Java��split������ע������
 *1������á�.����Ϊ�ָ��Ļ�������������д����String.split("\\."),
 *   ����������ȷ�ķָ�����������String.split(".");
 *2������á�|����Ϊ�ָ��Ļ�������������д����String.split("\\|"),
 *   ����������ȷ�ķָ�����������String.split("|");
 *��.���͡�|������ת���ַ�������ü�"\\";
 *3�������һ���ַ������ж���ָ����������á�|����Ϊ���ַ���
 *���磺��a=1 and b =2 or c=3��,���������ָ�������������String.split("and|or"); 
 * 
 */
public class P165_CompareVersionNumbers {
	public static int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int lengthV1 = v1.length;
		int lengthV2 = v2.length;
		int i = 0;
		int j = 0;
		while (i<lengthV1 && j<lengthV2) {
			int v1Num = Integer.parseInt(v1[i]);
			int v2Num = Integer.parseInt(v2[j]);
			if (v1Num > v2Num) {
				return 1;
			} else if(v1Num < v2Num) {
				return -1;
			}
			i++;
			j++;
		}
		if (i<lengthV1 && Integer.parseInt(v1[i])!=0) {
			return 1;
		}
		if (j<lengthV2 && Integer.parseInt(v2[j])!=0) {
			return -1;
		}
		return 0;
	}
	
	public static void main(String args[]) {
		String version1 = "1";
		String version2 = "0";
		System.out.println(compareVersion(version1, version2));
	}
}
