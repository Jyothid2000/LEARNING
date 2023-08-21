package com.kodnest.concepts;

public class JumpStatements {
	public static void main(String[] args) {
	  for(int i=0;i<=5;i++)
	  {
		  if(i==2)
		  {
			  break;
		  }
		  System.out.println("KODNEST");
	  }
	System.out.println("====================");
	
	for(int j=1;j<=7;j++)
	{
		if(j==3)
		{
			System.out.println("KODNEST");
			continue;
		}
		System.out.println("TECHNOLOGIES");
	}
}

}
