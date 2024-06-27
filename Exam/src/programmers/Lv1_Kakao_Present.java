package lv1;

import java.util.Arrays;

public class Lv1_Kakao_Present {
	
	    public int solution(String[] friends, String[] gifts) {
	    	int[] point = new int[friends.length];
	    	for(int i = 0; i < friends.length; i++) {
	    		point[i] = 0;
	    	}
	    	
	        int answer = 0;
	        
			String[] giftsSplit = new String[(gifts.length)*2];
			for(int i =0; i<gifts.length; i++) {
				String[] giftsplit = gifts[i].split(" ");
				giftsSplit[2*i] = giftsplit[0];
				giftsSplit[(2*i)+1] = giftsplit[1];
				}
				
				
			for(int j = 0; j<friends.length; j++) {
				String friend = friends[j];
				for(int i = 0; i<gifts.length; i++) {
					if(giftsSplit[2*i].equals(friend)) {
						point[j]++;
						}
					else if(giftsSplit[(2*i)+1].equals(friend)) {
						point[j]--;
					}
				}
			}
	        
			int max = -20000;
			
			for(int i = 0; i<point.length; i++) {
				if(point[i] > max) {
					max = point[i];
				}
			}
	        
			answer = max;
	        return answer;
	    }
}
