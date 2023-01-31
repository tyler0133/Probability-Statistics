import java.util.ArrayList;

public class TestStatsLibrary {
	public static void main(String[] args) {
		StatsLibrary test = new StatsLibrary();
		ArrayList <Integer> someNumbers = new ArrayList<>();
		someNumbers.add(1);
		someNumbers.add(2);
		someNumbers.add(3);
		someNumbers.add(4);
		someNumbers.add(4);
		someNumbers.add(4);
		double result = test.findMean(someNumbers);
		double median = test.findMedian(someNumbers);
		Integer mode = test.findMode(someNumbers);
		double stDev = test.findStandardDeviation(someNumbers);
		System.out.println("The average is: " + result);
		System.out.println("The median is: " + median);
		if (mode == null) {
			System.out.println("The mode is: null");
			} else {
				System.out.println("The mode is: " + mode);

			}
		System.out.println("The standard deviation is: " + stDev);

	}

}