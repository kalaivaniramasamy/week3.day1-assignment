package org.system;

public class Desktop extends Computer{
	
	public void DesktopSize()
	{
		System.out.println("Print Desktop Size");
	}
	
	public static void main(String[] args) {
		
		Desktop DT = new Desktop();
		DT.ComputerModel();
		DT.DesktopSize();
	}


}
