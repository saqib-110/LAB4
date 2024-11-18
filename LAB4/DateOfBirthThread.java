package LAB4;
class DateOfBirthThread extends Thread {
	 private String[] datesOfBirth;

	 public DateOfBirthThread(String[] datesOfBirth) {
	     this.datesOfBirth = datesOfBirth;
	 }

	 @Override
	 public void run() {
	     for (String dob : datesOfBirth) {
	         System.out.println("Date of Birth: " + dob);
	         try {
	             Thread.sleep(500); 
	         } catch (InterruptedException e) {
	             System.out.println("Thread interrupted: " + e.getMessage());
	         }
	     }
	 }
	}
