package LAB4;
class RollNumberThread extends Thread {
	 private String[] rollNumbers;

	 public RollNumberThread(String[] rollNumbers) {
	     this.rollNumbers = rollNumbers;
	 }

	 @Override
	 public void run() {
	     for (String roll : rollNumbers) {
	         System.out.println("Roll Number: " + roll);
	         try {
	             Thread.sleep(500); // Simulate delay
	         } catch (InterruptedException e) {
	             System.out.println("Thread interrupted: " + e.getMessage());
	         }
	     }
	 }
	}
