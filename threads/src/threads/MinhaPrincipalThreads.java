package threads;

public class MinhaPrincipalThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinhaThread ta,tb;
		
		ta = new MinhaThread();
		tb = new MinhaThread();
		
		for(;;) {
		tb.start();
		ta.start();
		
		}
	}

}
