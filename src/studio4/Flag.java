package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //making Scanner with a File
		
		//background
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledRectangle(0.5, .5,.5,0.5);
		//head
		StdDraw.setPenColor(65,46,10);
		StdDraw.filledCircle(0.5,0.5,0.3);
		//ears
		StdDraw.setPenColor(65,46,10);
		StdDraw.filledCircle(0.7,0.75,0.1);
		StdDraw.setPenColor(65,46,10);
		StdDraw.filledCircle(0.3,0.75,0.1);
		//nose
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(0.5,0.5,0.05);
		StdDraw.setPenColor(0,0,0);
		StdDraw.circle(0.5,0.45,0.15);
		//eyes
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledCircle(0.6,0.6,0.06);
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledCircle(0.4,0.6,0.06);
		//pupils
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(0.6,0.59,0.05);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(0.4,0.59,0.05);

	}
}