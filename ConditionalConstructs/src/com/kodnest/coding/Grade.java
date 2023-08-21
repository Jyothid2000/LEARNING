package com.kodnest.coding;

public class Grade {
	public void giveGrade(int score)
	{
		if(score>=90)
		{
			System.out.println("A+ Grade");
		}
		else if(score>=80 && score<90)
		{
			System.out.println("A Grade");
		}
		else if(score>=70 && score<80)
		{
			System.out.println("B Grade");
		}
		else if(score>=60 && score<70)
		{
			System.out.println("C Grade");
		}
		else if(score>=50 && score<600)
		{
			System.out.println("D Grade");
		}
		else
		{
			System.out.println("Fail....Get Lost....");
		}
	}

}
