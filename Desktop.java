package org.System;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("The desktop size is 10 inch");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop dt = new Desktop();
		dt.computerModel();
		dt.desktopSize();

	}

}
