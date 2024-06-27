package lv1;

public class Lv2_Carpet {
	 public int[] solution(int brown, int yellow) {
	        int[] answer = {0, 0};
	        for(int l = 1; l <= (Math.sqrt(yellow)); l++) {
				if((brown/2)*l - l*(l+2) == yellow) {
					answer[0] = (yellow/l) +2;
					answer[1] = l+2;
					break;
				}
	        }
	        return answer;
	    }
}
