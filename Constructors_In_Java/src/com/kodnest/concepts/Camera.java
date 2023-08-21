package com.kodnest.concepts;

public class Camera {
	String color;
	String brand;
	int cost;
	
	void captureImage()
	{
		System.out.println("Image captured.....");
	}
	void displayImage()
	{
		System.out.println("Camera is displaying image....");
	}
	public Camera(String x,String y,int z)
	{
		color = x;
		brand = y;
		cost = z;
	}

}
