package selenium;
import java.util.Random;

	public class RandomNumberGenerator {
		
		public void waitforpageload() throws Exception {
			Thread.sleep(5000);
		}
		
		
	    public static void main(String[] args) {
	        // Generate a random number within a specific range
	        int minNumber = 1; // Replace with your desired minimum value
	        int maxNumber = 10000000; // Replace with your desired maximum value

	        int randomNum = getRandomNumberInRange(minNumber, maxNumber);
	        int a = randomNum;
	        System.out.println("Random Number: " + randomNum);
	        System.out.println("value of a = " + a);
	    }

	    // Method to generate a random number within a range
	    public static int getRandomNumberInRange(int min, int max) {
	        Random random = new Random();
	        return random.nextInt(max - min + 1) + min;
	    }
	}



