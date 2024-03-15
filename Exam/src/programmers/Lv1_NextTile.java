package programmers;

public class Lv1_NextTile {
	public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
		String selcol = board[h][w];
		
		if(h > 0 && board[h-1][w].equals(selcol)) {
			answer++;
		}
		if(h < board.length - 1 && board[h+1][w].equals(selcol)) {
			answer++;
		}
		if(w > 0 && board[h][w-1].equals(selcol)) {
			answer++;
		}
		if(w < board[h].length - 1 && board[h][w+1].equals(selcol)) {
			answer++;
		}  
        return answer;
    }
}
