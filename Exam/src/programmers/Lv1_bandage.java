package lv1;

public class Lv1_bandage {

	public int solution(int[] bandage, int health, int[][] attacks) {
		int answer = 0;
		final int MAXHEALTH = health;	//체력 상한선
		int count = 0;	//연속 성공 카운트
		int	maxtime = attacks[attacks.length-1][0];	//몬스터의 마지막 공격까지의 시간

xx:		for (int time = 1; time <= maxtime; time++) {
			health += bandage[1];
			count++;
			
			for (int i = 0; i < attacks.length; i++) {	//시간에 따른 몬스터의 공격 체크
					if (attacks[i][0] == time) {
						health = health - attacks[i][1] - bandage[1];
						count = 0;
						if (health < 1) {
							answer = -1;
							break xx;
							}
						}
					}
			if (count == bandage[0]) {	//붕대감기 연속성공 기준횟수 도달 시 추가회복
				health += bandage[2];
				count = 0;
				}
			if (health > MAXHEALTH) {	//체력 상한 초과분 버림
				health = MAXHEALTH;
				}
				
				
			if(time == maxtime) {
				answer = health;
			}
		}
		return answer;
	}
}
