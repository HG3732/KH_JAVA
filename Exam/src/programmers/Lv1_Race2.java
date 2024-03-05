package programmers;

import java.util.HashMap;

public class Lv1_Race2 {
	
	public String[] solution(String[] players, String[] callings) {
	        
	       HashMap<String, Integer> rank = new HashMap<>();
	       for(int i = 0; i<players.length; i++) {
	    	   rank.put(players[i], i);
	       }
	       
	       for(String call : callings) {
	    	   int ranking = rank.get(call);
	    	   
	    	   String frontPlayer = players[ranking -1];
	    	   
	    	   players[ranking-1] = call;
	    	   players[ranking] = frontPlayer;
	    	   
	    	   rank.put(call, ranking - 1);
	    	   rank.put(frontPlayer, rank.get(frontPlayer) + 1);
	       }
	        
	        return players;
	    }
}


//출처 : https://1ets-just-do-it.tistory.com/3