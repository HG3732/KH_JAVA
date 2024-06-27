package lv1;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lv1_Report2 {
	
	public static void main(String[] args) {
		
	    String[] id_list = {"muzi", "frodo", "apeach", "neo"};
	    String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		
	    Set<String> set = new HashSet<String>(Arrays.asList(report));
	    String[] report2 = set.toArray(new String[0]);
		
	    
	        String[] split = new String[(report2.length)*2];
			for(int i =0; i<report2.length; i++) {
				String[] reportSplit = report2[i].split(" ");
				split[2*i] = reportSplit[0];
				split[(2*i)+1] = reportSplit[1];
				}
	        
	        Map<String, Integer> rpoint = new HashMap<>();	//신고를 한, 당한 횟수 계산
	        for(String friend : id_list) {
	        	int point = 0;
	        	for(int i = 0; i<report2.length; i++) {
		        	if(split[2*i+1].equals(friend)) {
		        		point++;
		        	}
		        	rpoint.put(friend, point);
		        }
	        }
	        int max = 0;
	        for(String friends : id_list) {					//최고 신고 횟수 계산
	        	if(rpoint.get(friends) > max) {
	        		max = rpoint.get(friends);
	        	}
	        }
	        
	        
	        
	        
	       
	        
	        for(Map.Entry<String, Integer> pair : rpoint.entrySet()) {
	        	if(pair.getValue() == max) {
	        	}
	        	System.out.println(pair.getKey() + " " + pair.getValue());
	        }
	        
	    }
}
