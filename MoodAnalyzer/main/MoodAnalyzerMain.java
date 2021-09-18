package Bridgelabz.MoodAnalyzer;

public class MoodAnalyzerMain{
	public static void main(String[] args) {
		
	}
	public String userMessage;
	
	//default
	public MoodAnalyzerMain() {
		userMessage = " i am feeling sad today. ";
	}
	public MoodAnalyzerMain(String message) {
		userMessage = message;
	}
	
	public String analyzeMood() {
		if(userMessage.contains("sad") || userMessage.contains("Sad") || userMessage.contains("SAD")) {
			return "SAD";
		}
		else {
			return "Happy";
		}
	}
	//try and Catch for Exception
	public String analyzeMood(String message) {
		String newMassage = message;
		try {
			if(newMassage.contains("sad") || newMassage.contains("Sad") || newMassage.contains("SAD")) {
				return "SAD";
			}
			else {
				return "Happy";
			}
		} catch(Exception exception) {
			
		}
		return "Happy";
	}
}