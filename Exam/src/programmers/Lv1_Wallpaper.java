package lv1;

import java.util.ArrayList;
import java.util.List;

public class Lv1_Wallpaper {
	
	public static void main(String[] args) {
		
		String[] wallpaper = {"..", "#."};
		
		int minx=wallpaper[0].length();
		int miny=wallpaper.length;
		int maxx=0;
		int maxy=0;
		int[] minPoint = {minx, miny};
		int[] maxPoint = {maxx, maxy};
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		
		for(int i = 0; i < wallpaper.length; i++) {			//y축
			for(int j = 0; j<wallpaper[i].length(); j++) {	//x축
				if(Character.toString((wallpaper[i].charAt(j))).equals("#")) {
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
		
		System.out.println(miny + ", " + minx + ", " + (maxy+1) + ", " + (maxx+1) );
		
	}

}
