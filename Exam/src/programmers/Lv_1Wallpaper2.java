package programmers;

import java.util.ArrayList;
import java.util.List;

public class Lv_1Wallpaper2 {
	
	public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        int minx=wallpaper[0].length();
		int miny=wallpaper.length;
		int maxx=0;
		int maxy=0;
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		
		for(int i = 0; i < wallpaper.length; i++) {			//y축
			for(int j = 0; j<wallpaper[i].length(); j++) {	//x축
				if(wallpaper[i].charAt(j)=='#') {
					y.add(i);
					x.add(j);
				}
			}
		}
		
		for(int i = 0; i<x.size(); i++) {
			if(x.get(i) > maxx) {
				maxx = x.get(i);
			}
			if(x.get(i) < minx) {
				minx = x.get(i);
			}
		}
		for(int i = 0; i<y.size(); i++) {
			if(y.get(i) > maxy) {
				maxy = y.get(i);
			}
			if(y.get(i) < miny) {
				miny = y.get(i);
			}
		}
		
		answer[0] = miny;
		answer[1] = minx;
		answer[2] = maxy+1;
		answer[3] = maxx+1;
		
        return answer;
    }

}
