package programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lv1_BurgerMaking {
	public int solution(int[] ingredient) {
        int answer = 0;
        int[] burger = {1, 2, 3, 1};
        
        List<Integer> ing = Arrays.stream(ingredient).boxed().collect(Collectors.toList());
		
		for(int i = 0; i<ing.size()-3; i++) {
			int[] a = {ing.get(i), ing.get(i+1), ing.get(i+2), ing.get(i+3)};
			 if(Arrays.equals(a, burger)) {
				 ing.remove(i+3);
				 ing.remove(i+2);
				 ing.remove(i+1);
				 ing.remove(i);
				 answer++;
				 if(i>3) {i-=3;}
				 else {i=-1;}
			 }
		}
        return answer;
    }
}
