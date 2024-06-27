package lv1;

public class Lv2_ChangeNumber {
	
	class Solution {
		
		public int zeroCal(String a) {
			String zeroNum = a.replaceAll("1", "");
			return zeroNum.length();
		}
		
	    public int[] solution(String s) {
	    	
	        int[] answer = {0, 0};
	        
	        while(true) {
	        	answer[1] += zeroCal(s);
		        if(!(s.equals("1"))) {
			        s = s.replaceAll("0", "");
			        s = Long.toBinaryString(s.length());
			        answer[0]++;
		        	} 
		        else {break;}
	        }
	        return answer;
	    }
	}
}
