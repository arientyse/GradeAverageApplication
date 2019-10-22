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

		
		//Computation
		
		double testAverage = (testOne + testTwo + testThree) / 3;
		
		double testWeighing = testAverage * TEST_WEIGHT;
		double midtermWeighing = midtermExam * MIDTERM_WEIGHT;
		double finalWeighing = finalExam * FINAL_WEIGHT;
		
		
		//Output

	}

}
