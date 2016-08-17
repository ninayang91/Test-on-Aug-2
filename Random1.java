import java.util.Random;

public class Random1 extends Random{
	
	private double mean;
	private double standardDeviation;
	
	public Random1(double mean) {
		// TODO Auto-generated constructor stub
		this.mean = mean;
		this.standardDeviation = mean;
		
	}
	
	public Random1(double mean, double standardDeviation) {
		// TODO Auto-generated constructor stub
		this.mean = mean;
		this.standardDeviation = standardDeviation;
	}
	
	public double nextGaussian(){
		double x = super.nextGaussian(); // x = normal (0.0, 1.0);
		return x*standardDeviation + mean;
	}
	
	public double nextExponential(){
		return -mean*Math.log(1.0-nextDouble());
	}
	
	public int intNextExponential(){
		return (int) Math.ceil(nextExponential());
	}
	

}
