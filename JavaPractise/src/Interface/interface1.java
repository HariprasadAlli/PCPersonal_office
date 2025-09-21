package Interface;



	interface Mahindra {
		void accelerate();
		void brakes();
	}

	class Architect implements Mahindra {
		public void accelerate() {
			System.out.println("nonaccelerate");
		}
		
		public void brakes(){
			System.out.println("Brakes");
		}
		
	}

	public class interface1
	{
		public static void main(String args[])
		{
		
		Architect s1 = new Architect();
		s1.accelerate();
		s1.brakes();
	}
	}

