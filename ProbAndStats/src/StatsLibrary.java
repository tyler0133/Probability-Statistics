import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
 

public class StatsLibrary {

	/**
* Returns the mean of the inputted array list
*/
	
	public double findMean(ArrayList<Integer> inputNumbers) {
		double sum = 0;
		for(int singleElement : inputNumbers){
			sum = sum + singleElement;
		}
		double result = sum / inputNumbers.size();
		return result;
	}


/**
* Returns the media of the inputted array list
*/
	
	public double findMedian(ArrayList<Integer> inputNumbers) {
		Collections.sort(inputNumbers);
		double median;
		if (inputNumbers.size() % 2 == 0) {
			median = inputNumbers.get((inputNumbers.size() / 2) - 1) + inputNumbers.get((inputNumbers.size() / 2));
			median = median / 2;
			return median;
		}
		else {
			median = inputNumbers.get(inputNumbers.size()/2);
			return median;
		}
	}


/**
* Returns the mode of the inputted array list
*/
	
	public Integer findMode(ArrayList<Integer> inputNumbers) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int maxValue = 0, maxCount = 0;
		for (int i : inputNumbers) {
			if(map.containsKey(i)) {
				int count = map.get(i);
				map.put(i, count+1);
			}
			
			else {
				map.put(i, 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxValue = entry.getKey();
			}
			
			else if (entry.getValue() == maxCount) {
				return null;
			}
		}
		
		return maxValue;
	}


/**
* Returns the standard deviation of the inputted array list
*/
	
	public double findStandardDeviation(ArrayList<Integer> inputNumbers) {
		double mean = findMean(inputNumbers);
		double sum = 0;
		for(int i : inputNumbers) {
			sum += Math.pow(i - mean, 2);
		}
		return Math.sqrt(sum / inputNumbers.size());
	}


}