/* QuizAverager.java
Andrew Kim
3 September 2017
This program gathers user input to average quiz scores, convert age and convert temperatures
*/

import java.util.Scanner;

public class QuizAverager {
  public static void main(String[] args){

    // user prompts and variable declarations
    int studentId = promptUserForInt("Please enter your Student EMPLID (0 - 999999): ");
    double quiz1Percent = promptUserForDouble("Please enter your quiz1 percentage score(0.0 - 100.0): ");
    double quiz2Percent = promptUserForDouble("Please enter your quiz2 percentage score(0.0 - 100.0): ");
    double quiz3Percent = promptUserForDouble("Please enter your quiz3 percentage score(0.0 - 100.0): ");
    int ageInMonths = promptUserForInt("Please enter your age in months (0 - 1440): ");
    double tempC = promptUserForDouble("Please enter the current temperature in degrees Celsius: ");

    // Output results
    System.out.println("\n");
    System.out.println("*** Thank You ***");
    System.out.println("Student EMPLID: " + studentId);
    System.out.println("Quiz 1 Score: " + quiz1Percent);
    System.out.println("Quiz 2 Score: " + quiz2Percent);
    System.out.println("Quiz 3 Score: " + quiz3Percent);
    System.out.println("Average Quiz Score: " + averageQuizScore(quiz1Percent, quiz2Percent, quiz3Percent));
    System.out.println("Age in Months: " + ageInMonths);
    System.out.println("Age in years: " + convertAgeToYears(ageInMonths));
    System.out.println("Temperature in Celsius " + tempC + "\u00b0");
    System.out.println("Temperature in Fahrenheit " + convertCelcToFahr(tempC) + "\u00b0");

  }

  // returns average of 3 quiz scores
  public static double averageQuizScore(double quiz1, double quiz2, double quiz3){
    return (quiz1 + quiz2 + quiz3) / 3;
  }

  // convert Age in months to years
  public static int convertAgeToYears(int ageInMonths){
    return ageInMonths / 12;
  }

  // converts degrees celcius to fahrenheit
  public static double convertCelcToFahr(double tempC){
    double tempF = 1.8 * tempC + 32;
    return tempF;
  }

  // prompts user for Integer
  public static int promptUserForInt(String prompt){
    Scanner scannerln = new Scanner(System.in);
    System.out.print(prompt);
    return scannerln.nextInt();
  }

  // prompts user for Double
  public static double promptUserForDouble(String prompt){
    Scanner scannerln = new Scanner(System.in);
    System.out.print(prompt);
    return scannerln.nextDouble();
  }
}
