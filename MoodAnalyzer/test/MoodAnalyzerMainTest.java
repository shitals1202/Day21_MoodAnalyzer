package Bridgelabz.MoodAnalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerMainTest {
	MoodAnalyzerMain userMood = new MoodAnalyzerMain();
	
	@Test
	public void ThisShouldGiveUsbackMoodThatIsEitherHappyOrSad(){
		assertEquals("Sad" , userMood.analyzeMood());
	}
	@Test
	public void ThisShouldGiveUsBackMoodThatIsEitherHappyOrSadByParamaterCons() {
		MoodAnalyzerMain mood = new MoodAnalyzerMain("yes yes happy today ");
		assertEquals("HAPPY", mood.analyzeMood());
	}

	@Test
	public void ThisShouldGiveTheMessageFrom() {
		assertEquals("HAPPY", userMood.analyzeMood("no i am not in good mood or sad today "));
	}

	@Test
	public void ThisShouldGiveTheMessageFromGivingCorrectInput() {
		assertEquals("HAPPY", userMood.analyzeMood("yes i am in goog mood happy today "));
	}

	@Test
	public void givenNullMoodShouldReturnHappy() {

		assertEquals("HAPPY", userMood.analyzeMood(null));
	}
	@Test
	public void givenNullMoodShouldReturnSad() {

		assertEquals("Sad", userMood.analyzeMood(null));
	}
}
