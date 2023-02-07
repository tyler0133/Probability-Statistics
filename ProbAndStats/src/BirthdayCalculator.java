
public class BirthdayCalculator {
	public static Person generateRandomBirthday(){
		int randomDay = (int)(Math.random() * 30) + 1;
    	int randomMonth = (int) (Math.random() * 12) + 1;
    	Person person = new Person(randomDay, randomMonth);
		return person;
	}
	
	public static boolean hasSameBirthday(Person[] people) {
		for(int i=0; i<people.length-1; i++) {
			for(int j=i+1; j<people.length; j++) {
				if

		(people[i].day == people[j].day && people[i].month == people[j].month) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static double findProbability(int peopleNum, int runs) {
		int count = 0;
		for(int i=0; i<runs; i++) {
			Person[] people = new Person[peopleNum];
			for(int j=0; j<peopleNum; j++) {
				people[j] =

				generateRandomBirthday();
			}
			if(hasSameBirthday(people)){
				count++;
			}
		}
		return (double)count/runs;
	}
	
	public static void main(String[] args) {
		int classSize = 23;
		int runs = 10000;
		System.out.println("Probability of two people sharing a birthday in the class: " + findProbability(classSize, runs));
	}
}
class Person {
	public int day;
	public int month;
	public Person(int day, int month){
		this.day = day;
		this.month = month;
	}
}