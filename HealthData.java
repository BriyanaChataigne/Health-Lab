import java.util.Scanner;

public class HealthData {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userAgeYears = 0;
      int userAgeDays  = 0;
		int userAgeSecs = 0;
		int userAgeMins = 0;
		int userAgeHours = 0;
		int userAgeBeats = 0;
		int userAgeDreams = 0;
      
      System.out.println("Enter your age in years: ");
      userAgeYears = scnr.nextInt();
      
      userAgeDays = userAgeYears * 365;
		userAgeHours = userAgeDays * 24;
		userAgeMins = userAgeHours * 60;
		userAgeSecs = userAgeMins * 24;
		userAgeBeats = userAgeMins * 72;
		userAgeDreams = userAgeYears * 1460;
		

      System.out.println("You are " + userAgeDays + " days old.");
		System.out.println("You are " + userAgeMins + " minutes old.");
		System.out.println("You are " + userAgeSecs + " seconds old.");
		System.out.println("You are " + userAgeBeats + " heart beats old.");
		System.out.println("You are " + userAgeDreams + " dreams old.");

      
      return;
   }
}
