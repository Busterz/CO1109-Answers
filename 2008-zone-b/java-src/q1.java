import java.util.Random;

public class q1 {
	public static void main(String[] args) {
		
		// Question 1 (b)(i)
		for (int i = 0; i < 959595; i ++) {
			System.out.println("cheers");
		}
		
		// Question 1 (c)
		Random r = new Random();
		int value = r.nextInt(2);
		if (value == 0) {
			System.out.println("heads");
		} else {
			System.out.println("tails");
		}
	}
}
