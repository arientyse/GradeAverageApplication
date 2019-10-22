package edu.gsu.csc1301.gradeaverageapplication;

/**
 * This creates a grade average for students by calculating their average overall percentage
 * and letter grade, from previous test scores.
 * 
 * 
 * @author Ariana Tyson
 * @version 10/21/2019
 *
 */

import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) 
	{
		
		final double TEST_WEIGHT = 0.40;
		final double MIDTERM_WEIGHT = 0.25;
		final double FINAL_WEIGHT = 0.35;
		
		Scanner in = new Scanner(System.in);
		
		//Input
		
		System.out.print("What was your score for Test One? "); //Asks for first test score
		double testOne = in.nextDouble();
		
		System.out.print("What was your score for Test Two? "); //Asks for second test score
		double testTwo = in.nextDouble();
		
		System.out.print("What was your score for Test Three? "); //Asks for third test score
		double testThree = in.nextDouble();
		
		System.out.print("What was your Midterm Exam score? "); //Asks for midterm exam score
		double midtermExam = in.nextDouble();
		
		System.out.print("What was your Final Exam Score? "); //Asks for final exam score
		double finalExam = in.nextDouble();
		
		in.close();

		
		//Computation
		
		double testAverage = (testOne + testTwo + testThree) / 3; //Calculates the average of the three provided test scores
		
		double testWeighting = testAverage * TEST_WEIGHT; //Calculates the weighted average for the user's test scores
		double midtermWeighting = midtermExam * MIDTERM_WEIGHT; //Calculates the weighted average for the user's midterm exam score
		double finalWeighting = finalExam * FINAL_WEIGHT; //Calculates the weighted average for the user's final exam score
		
		double weightedAverage = testWeighting + midtermWeighting + finalWeighting; //Calculates the user's overall weighted average for the course
		
		char letterGrade;
		if (weightedAverage >= 90 && weightedAverage <= 100) //Identifies a letter grade, A, as an average between 90 and 100
		{
			letterGrade = 'A';
		}
		else if (weightedAverage >= 80 && weightedAverage <= 89) //Identifies a letter grade, B, as an average between 80 and 89
		{
			letterGrade = 'B';
		}
		else if (weightedAverage >= 70 && weightedAverage <= 79) //Identifies a letter grade, C, as an average between 70 and 79
		{
			letterGrade = 'C';
		}
		else if (weightedAverage >=60 && weightedAverage <= 69) //Identifies a letter grade, D, as an average between 60 and 69
		{
			letterGrade = 'D';
		}
		else //Identifies averages lower than the above as an F
		{
			letterGrade = 'F';
		}
		
		//Output
		
		System.out.println();
		System.out.printf("Grade Average:  %.2f \n", weightedAverage); //Outputs the weighted average from the user's test, midterm exam, and final exam grades
		System.out.println("Letter Grade:   " + letterGrade); //Outputs the calculated letter grade, based off of the user's weighted average
		
		if (letterGrade == 'A' || letterGrade == 'B' || letterGrade == 'C' ) //Outputs passing or failing statement based off of the letter grade calculated for the user
		{
			System.out.print("Good Job! You met the the prerequisite for the next course.");	
		}
		else
		{
			System.out.print("I'm sorry! You will need to repeat the course to advance.");
		}

	}

}
