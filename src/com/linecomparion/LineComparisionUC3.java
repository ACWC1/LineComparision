package com.linecomparion;

public class LineComparisionUC3 {
	
	public static int compareTo(double length1, double length2){
		
		if (length1 == length2)
		{
			return 0;
		}
		else if(length1 > length2)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Line One
		int x1 = 10;
		int x2 = 20;
		int y1 = 30;
		int y2 = 400;
		
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
		
		int com = compareTo(result,result2);
		
		switch (com)
		{
		case 0:
				System.out.println("Line are Same");
				break;
		
		case 1:
				System.out.println("Line 1 is Greater than Line2");
				break;
				
		case -1:
				System.out.println("Line 1 is Less than Line2");
				break;
		
		}

	}

}
