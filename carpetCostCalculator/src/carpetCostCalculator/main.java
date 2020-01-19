package carpetCostCalculator;

public class main {
	public static void main(String[] args)
	{
	
	Carpet crpt=new Carpet(2);
	floor flr=new floor(30,40);
	Calculator clc=new Calculator(flr, crpt);
	
    System.out.println(clc.getTotalCost());

}}
