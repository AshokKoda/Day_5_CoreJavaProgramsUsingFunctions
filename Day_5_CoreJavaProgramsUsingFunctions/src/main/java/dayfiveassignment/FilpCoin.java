package dayfiveassignment;

public class FilpCoin {

	public static void main(String[] args) {
		
		int headCount = 0;
	    int tailCount = 0;

		if (Math.random() < 0.5) {
			//System.out.println("Heads");
			headCount++;
		}else {
			//System.out.println("Tails");
			tailCount++;
		}
		
		System.out.println("\nNumber of heads: " + headCount);
        System.out.println("Number of tails: " + tailCount);
        
        float percentHeads = ((float)headCount / 2) * 100;
        System.out.println("Percent heads: " + percentHeads + '%');
        
        float percentTails = ((float)tailCount / 2) * 100;
        System.out.println("Percent tails: " + percentTails + "%\n");

	}

}
