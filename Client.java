import java.awt.print.Printable;

public class Client {
	
	public static final int MEAN_JOB_SIZE = 100;
	private static Random1 randomJobSize = new Random1(MEAN_JOB_SIZE);
	private static int nextId = 0;
	private int id, jobSize, tArrized, tBegan, tEnded;
	private Server server;
	
	public Client(int time) {
		// TODO Auto-generated constructor stub
		id = ++ nextId;
		jobSize = randomJobSize.intNextExponential();
		tArrized = time;
		print(id,time,jobSize);
	}

	public double getJobSize(){
		return jobSize;
	}
	public int getWaitTime(){
		return tBegan - tArrized;
	}
	public int getServiceTime(){
		return tEnded - tBegan;
	}
	public void beginService(Server server, int time){
		this.server = server;
		tBegan = time;
		printBegins(server, id, time);
	}
	public void endService(int time){
		tEnded = time;
		printEnds(server, id, time);
		server = null;
	}
	public String toString(){
		return "#" + id +"(" + (int) Math.round(jobSize)+")";
	}
	
	private void print(int job, int time, double size) {
		// TODO Auto-generated method stub
		System.out.println("Job#"+job+" arrives at time "+time+" with "+(int)Math.round(size) + " pages.");
	}
	private void printBegins(Server server, int job, int time) {
		// TODO Auto-generated method stub
		System.out.println("Printer " + server + " begins Job#"+job+" at time "+time+".");
		
	}
	private void printEnds(Server server, int job, int time) {
		// TODO Auto-generated method stub
		System.out.println("Printer " + server + " ends Job#"+job+" at time "+time+".");
		
	}

}
