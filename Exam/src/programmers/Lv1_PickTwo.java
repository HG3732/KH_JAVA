package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lv1_PickTwo {

	class Solution {
	    public int[] solution(int[] numbers) {
	        
	        Set<Integer> sumSet = new HashSet<Integer>();
	        
	        
	        int count = 0;
	        for(int i =0; i<numbers.length - 1; i++) {
	        	for(int j= i+1; j < numbers.length; j++) {
	        		sumSet.add(numbers[i] + numbers[j]); 
	        	}
	        }
	        
	        List<Integer> sumList = new ArrayList<Integer>(sumSet);
	        Collections.sort(sumList);

	        int[] answer = new int[sumList.size()];
	        
	        for(int i = 0; i < sumList.size(); i++) {
	        	answer[i] = sumList.get(i);
	        }
	        
	        return answer;
	    }
	}

}
