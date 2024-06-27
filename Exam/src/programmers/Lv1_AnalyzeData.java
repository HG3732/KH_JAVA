package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv1_AnalyzeData {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
		int x = 0;
		int a = 0;
		
		switch (ext) {
			case "code":
				x=0;
				break;
			case "date":
				x=1;
				break;
			case "maximum":
				x=2;
				break;
			case "remain":
				x=3;
				break;
		}
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < data.length; i++) {
			if(data[i][x] < val_ext) {
				for(int j = 0; j < data[i].length; j++) {
				list.add(data[i][j]);
				}
				a++;
			}
		}
		
		int[][] answer = new int[a][data[0].length];
		
		for(int i = 0; i<answer.length; i++) {
			for(int j = 0; j<answer[0].length; j++) {
				answer[i][j] = list.get(4*i + j);
			}
		}
		
		switch (sort_by) {
			case "code":
				Arrays.sort(answer, (o1, o2) ->  o1[0]-o2[0]);
				break;
			case "date":
				Arrays.sort(answer, (o1, o2) ->  o1[1]-o2[1]);
				break;
			case "maximum":
				Arrays.sort(answer, (o1, o2) ->  o1[2]-o2[2]);
				break;
			case "remain":
				Arrays.sort(answer, (o1, o2) ->  o1[3]-o2[3]);
				break;
		}
        return answer;
        
    }
	
}
