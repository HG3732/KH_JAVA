package programmers;

public class Lv2_Fibonacci {
	
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        int num1 = 1;
			 int num2 = 1;
			
			 while(true) {
				
				 answer = num1 + num2;
				 if(answer > 1234567) {
					 answer -= 1234567;
				 }
				 
				 num1 = num2;
				 num2 = answer;
				 n--;
				 if(n-2 == 0) break;
		     }
	     
	        
	        return answer;
	    }
	}
}
