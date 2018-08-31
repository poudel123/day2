package com.capgemini.day2;

public class AverageMarks {

	
		public static int[][] subAverageAndTotal(int[][] marks) 
		{
			// TODO Auto-generated method stub
			int subTotal[][] = new int[3][2];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					subTotal[j][1] += marks[i][j];
				}
			}
			for(int i=0;i<3;i++)
			{
				subTotal[i][0] = subTotal[i][1]/3;
			}
			return subTotal;
		}
		
}
