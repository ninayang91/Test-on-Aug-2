
public class Server {
	
	private static Random1 randomeMeanServiceRate = new Random1(1.00, 0.20);
	private static char nextId = 'A';
	private Random1 randomServiceRate;
	private char id;
	private double meanServiceRate, serviceRate;
	private Client client;
	private int timeServiceEnds;
	
	public Server() {
		// TODO Auto-generated constructor stub
		id = (char) nextId++;
		meanServiceRate = randomeMeanServiceRate.nextGaussian();
		randomServiceRate = new Random1(meanServiceRate, 0.10);
	}
	
	public Client getClient(){
		return client;
	}
	
	public void beginServing(Client client, int time){
		this.client = client;
		serviceRate = randomServiceRate.nextGaussian();
		client.beginService(this, time);
		int serviceTime = (int) Math.ceil(client.getJobSize()/serviceRate);
		timeServiceEnds = time + serviceTime;
	}
	
	public void endServing(int time){
		client.endService(time);
		this.client = null;
	}
	
	public int getTimeServiceEnds(){
		return timeServiceEnds;
	}
	
	public boolean isFree(){
		return client == null;
	}
	
	public String toString(){
		int percentMeanServiceRate = (int) Math.round(100*meanServiceRate);
		int percentServiceRate = (int) Math.round(100*serviceRate);
		return id+"("+percentMeanServiceRate + "%," + percentServiceRate + "%)";
	}

}
