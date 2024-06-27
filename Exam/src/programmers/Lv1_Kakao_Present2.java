package lv1;

import java.util.Arrays;

public class Lv1_Kakao_Present2 {
	
	public static void main(String[] args) {
		
			String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
			String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
			String[] giftsSplit = new String[(gifts.length)*2];
			
			int[] point = new int[friends.length];
	    	for(int i = 0; i < friends.length; i++) {
	    		point[i] = 0;
	    	}
			
			for(int i =0; i<gifts.length; i++) {
			String[] giftsplit = gifts[i].split(" ");
			giftsSplit[2*i] = giftsplit[0];
			giftsSplit[(2*i)+1] = giftsplit[1];
			}
			
			
			for(int j = 0; j<friends.length; j++) {
				String friend = friends[j];
				for(int i = 0; i<gifts.length; i++) {
					if(giftsSplit[2*i].equals(friend)) {
						point[j]++;}
					else if(giftsSplit[(2*i)+1].equals(friend)) {
						point[j]--;
					}
				}
			}
			
			for(int i =0; i<gifts.length; i++) {
				if((giftsSplit[2*i] + " " + giftsSplit[(2*i)+1]).equals(gifts[i]) || (giftsSplit[(2*i)+1] + " " + giftsSplit[2*i]).equals(gifts[i])) {
					
				}
			}

			
			for(String friend : giftsSplit) {
				System.out.println(friend);
			}
			for(int points : point) {
				System.out.println(points);
			}
			
	}
}
