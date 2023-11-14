/*
 * Class: CMSC203 
 * Instructor: Dr. Kujit 
 * Description: Program is given a text file which then it reads and uses and GUI to highlight things red and green.
 * Due: 11/12/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Ilyas Rehman
*/

public class HolidayBonus {
	private static double HIGH = 5000;
	private static double LOW =	1000;
	private static double OTHER = 2000;
	public static double[] calculateHolidayBonus(double[][] data) {
		double bonus[] = new double[data.length];
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				double highest = TwoDimRaggedArrayUtility.getHighestInColumn(data, col);
				double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(data, col);
				if (data[row][col] > 0) {
					if (data[row][col] == highest) {
						bonus[row] += HIGH;
					} else if (data[row][col] == lowest) {
						bonus[row] += LOW;
					} else {
						bonus[row] += OTHER;
					}
				}
			}
		}
		return bonus;
	}

	public static double calculateTotalHolidayBonus(double[][] data) {
		double[] bonus = calculateHolidayBonus(data);
		double sum = 0;
		for (int i = 0; i < bonus.length; i++) {
			sum += bonus[i];
		}
		return sum;
	}
}