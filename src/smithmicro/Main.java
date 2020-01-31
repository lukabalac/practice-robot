package smithmicro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		long startTime = new Date().getTime();
		var initialPosition = new Point(8, 21);
		var luka = new Figure(initialPosition, Direction.NORTH);
		List<String> k = new ArrayList<>();
		//Generating arrays randomly
		var kRand = getRandomNumberInRange(0, 8);
		for (var i = 0; i < kRand; i++) {
			//Inserting random operations
			var nRand = getRandomNumberInRange(0, 100000);
			k.add(getSaltString(nRand));
		}
		//Going through operations
		for (String s : k) {
			//Moving the figure
			for (var i = 0; i < s.length(); i++) {
				luka.operate(Operation.valueOf(String.valueOf(s.charAt(i))));
				
			}
			
			
		}
		//Reseting figure
		System.out.println("output: " + luka.getSamePositionCount());
		luka.reset();
		long endTime = new Date().getTime();
		long totalTime = endTime - startTime;
		System.out.println("Execution time in milliseconds: " + totalTime);

	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	private static String getSaltString(int length) {
		String SALTCHARS = "PLD";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < length) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}
}
