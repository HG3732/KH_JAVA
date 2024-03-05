package programmers;

public class Lv1_ParkWalk {

	public int[] solution(String[] park, String[] routes) {
        int[] answer = {0, 0};
        
        String[] rsplit = new String[(routes.length)*2];
		for(int i =0; i<routes.length; i++) {
			String[] routessplit = routes[i].split(" ");
			rsplit[2*i] = routessplit[0];
			rsplit[(2*i)+1] = routessplit[1];
			}
		
		int W = park[0].length();
		int H = park.length;
		
		for(int i = 0; i<park.length; i++) {
			for(int j = 0; j<park[i].length(); j++) {
				if(park[i].charAt(j) == 'S') {
					answer[0] = i;
					answer[1] = j;
				}
			}
		}
		
		
		for(int i = 0; i<routes.length; i++) {
xx:			
			switch (rsplit[2*i]) {
			case "E":
				if(answer[1]+Integer.parseInt(rsplit[2*i+1]) > W-1) {	//공원을 벗어난다면?
					continue;
					} else {
						for(int j = 0; j<=Integer.parseInt(rsplit[2*i+1]); j++) {	//한 칸씩 X체크
							if(park[answer[0]].charAt(answer[1]+j) == 'X') {
								break xx;
							} 
						}
						answer[1] += Integer.parseInt(rsplit[2*i+1]);
						break;
					}
			case "W":
				if(answer[1]-Integer.parseInt(rsplit[2*i+1]) < 0) {
					continue;
					} else {
						for(int j = 0; j<=Integer.parseInt(rsplit[2*i+1]); j++) {
							if(park[answer[0]].charAt(answer[1]-j) == 'X') {
								break xx;
							} 
						}
						answer[1] -= Integer.parseInt(rsplit[2*i+1]);
						break;
					}
			case "S":
				if(answer[0]+Integer.parseInt(rsplit[2*i+1]) > H-1) {
					continue;
					} else {
						for(int j = 0; j<=Integer.parseInt(rsplit[2*i+1]); j++) {
							if(park[answer[0]+j].charAt(answer[1]) == 'X') {
								break xx;
							} 
						}
						answer[0] += Integer.parseInt(rsplit[2*i+1]);
						break;
					}
			case "N":
				if(answer[0]-Integer.parseInt(rsplit[2*i+1]) < 0) {
					continue;
					} else {
						for(int j = 0; j<=Integer.parseInt(rsplit[2*i+1]); j++) {
							if(park[answer[0]-j].charAt(answer[1]) == 'X') {
								break xx;
							} 
						}
						answer[0] -= Integer.parseInt(rsplit[2*i+1]);
						break;
					}
			default:
				break;
			}
		}
        return answer;
    }
	
}
