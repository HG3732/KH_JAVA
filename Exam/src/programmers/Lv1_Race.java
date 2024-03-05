package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lv1_Race {
	
	public String[] solution(String[] players, String[] callings) {
	        String[] answer = {};
	        
	        List<String> list = Arrays.asList(players);
	        
	        for(int i = 0; i<callings.length; i++) {
	        	for(int j = 1; j<list.size(); j++)
	        	if(callings[i].equals(list.get(j))) {
	        		Collections.swap(list, j, j-1);
	        	}
	        }
	        answer = new String[list.size()];
	        int size = 0;
	        for(String temp : list) {
	        	answer[size++]=temp;
	        }
	        return answer;
	    }

}
