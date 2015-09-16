package easy;

public class P014_LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {    	
    	if(strs == null || strs.length == 0)
    		return "";
    	int countOfStr = strs.length;
    	String str = strs[0];    	
    	int length = str.length();
    	boolean flag = false;
    	int i = 0;
    	for(i= 0;i<length;i++) {
    		for(int j = 1;j < countOfStr;j++) {
    			if(i < strs[j].length() && strs[j].charAt(i) == str.charAt(i)) {
    				continue;
    			} else {
    				flag = true;
    				break;
    			}
    		}
    		if(flag)
    			break;
    	}
    	if(i==0)
    		return "";
        return str.substring(0,i);
    }
    
    public static void main(String args[]) {
    	String[] strs = new String[]{};
    	System.out.println(longestCommonPrefix(strs));
    }
}
