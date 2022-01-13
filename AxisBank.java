package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("deposit in AxisBank");
	}
	
	public static void main(String[] args) {
		AxisBank axisbank = new AxisBank();
		axisbank.deposit();
		axisbank.saving();
		axisbank.fixed();
	}

	
}
