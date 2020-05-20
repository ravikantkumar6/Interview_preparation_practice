package com.amazon;

public class GoldMine {
	
	private int[][] goldmine = null;
	
	public GoldMine(int[][] goldmine) {
		this.goldmine = goldmine;
	}
	
	public int getMaxGold() {
		
		if(goldmine == null || goldmine.length == 0) return 0;
		
		int rowLength = goldmine.length;
		int colLength = goldmine.length;
		
		int [][] goldMineTable = new int[rowLength][colLength];
		for(int i =0;i<rowLength;i++) {
			for(int j =0;j<colLength;j++) {
				goldMineTable[i][j] = 0;
			}
		}
		
		for(int col = colLength-1;col>=0;col--) {
			for(int row = 0;row<rowLength;row++) {
				int right = (col == colLength-1?0:goldMineTable[row][col+1]);
				int rightup = (row == 0 || col == colLength-1 ?0:goldMineTable[row-1][col+1]);
				int rightDown = (row == rowLength -1 || col == colLength-1 ? 0:goldMineTable[row+1][col+1]);
				goldMineTable[row][col] = goldMineTable[row][col]+Math.max(rightup,Math.max(right, rightDown));
				
			}
		}
		int max = 0;
		for (int i = 0; i < rowLength; i++) {
			max = max < goldMineTable[i][0] ? goldMineTable[i][0] : max;
		}
		return max;
	}

}
