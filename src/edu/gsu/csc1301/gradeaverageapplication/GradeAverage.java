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
		
		System.out.print("What was your score for Test One?");
		double testOne = in.nextDouble();
		
		System.out.print("What was your score for Test Two?");
		double testTwo = in.nextDouble();
		
		System.out.print("What was your score for Test Three?");
		double testThree = in.nextDouble();
		
		System.out.print("What was your Midterm Exam score?");
		double midtermExam = in.nextDouble();
		
		System.out.print("What was your Final Exam Score?");
		double finalExam = in.nextDouble();
		
		in.close();

		
		//Computation
		
		double testAverage = (testOne + testTwo + testThree) / 3;
		
		double testWeighting = testAverage * TEST_WEIGHT;
		double midtermWeighting = midtermExam * MIDTERM_WEIGHT;
		double finalWeighting = finalExam * FINAL_WEIGHT;
		
		double weightedAverage = testWeighting + midtermWeighting + finalWeighting;
		
		char letterGrade;
		if (weightedAverage >= 90 && weightedAverage <= 100)
		{
			letterGrade = 'A';
		}
		else if (weightedAverage >= 80 && weightedAverage <= 89)
		{
			letterGrade = 'B';
		}
		else if (weightedAverage >= 70 && weightedAverage <= 79)
		{
			letterGrade = 'C';
		}
		else if (weightedAverage >=60 && weightedAverage <= 69)
		{
			letterGrade = 'D';
		}
		else
		{
			letterGrade = 'F';
		}
		
		//Output
		
		System.out.printf("Grade Average:  %.2f \n", weightedAverage);
		System.out.printf("Letter Grade:   " + letterGrade);
		
		if (letterGrade == 'A' || letterGrade == 'B' || letterGrade == 'C' )
		{
			System.out.print("Good Job! You met the the prerequisite for the next course.");	
		}
		else
		{
			System.out.print("I'm sorry! You will need to repeat the course to advance.");
		}
				

	}

}
