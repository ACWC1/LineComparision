package com.linecomparion;

public class LineComparisionUCTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//Line One
				int x1 = 10;
				int x2 = 20;
				int y1 = 30;
				int y2 = 40;
				
				double result = 0;
				result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); 
				System.out.println(result);
			
				//Line Two
				int p1 = 10;
				int p2 = 20;
				int q1 = 60;
				int q2 = 40;
				
				double result2 = 0;
				result2 = Math.sqrt(Math.pow((p2 - p1), 2) + Math.pow((q2 - q1), 2)); 
				System.out.println(result2);
				
				if (result == result2)
				{
					System.out.println("The Lines are the Same !!! ");
				}
				else
				{
					System.out.println("The Lines are the Not Same !!! ");
				}
			

	}

}
