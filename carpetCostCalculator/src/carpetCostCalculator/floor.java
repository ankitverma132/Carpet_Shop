package carpetCostCalculator;

public class floor {
	
	private double width;
	private double length;
	
	public floor(double width, double length)
	{
		super();
		if(width<0) {this.width=0;}
		else this.width = width;
		if(length<0) {this.length=0;}
		else this.length = length;
	}
	public double getArea()
	{
		return this.length*this.width;
	}
	

}
