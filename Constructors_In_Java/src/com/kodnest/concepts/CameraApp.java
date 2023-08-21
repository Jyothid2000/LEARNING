package com.kodnest.concepts;

public class CameraApp {
	public static void main(String[] args) {
		Camera c1 = new Camera("Black","Sony",45000);
		c1.captureImage();
		c1.displayImage();
		System.out.println(c1.color+" coloured "+c1.brand+" camera which costs "+c1.cost+" is capturing the image.");
	}

}
