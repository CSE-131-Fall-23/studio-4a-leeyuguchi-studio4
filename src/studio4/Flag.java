package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color lightPurple = new Color(229, 204, 255);
		Color medPurple = new Color(189, 132, 218);
		Color darkPurple = new Color(154, 92, 185);
		Color green = new Color(160, 189, 136);
		
		StdDraw.setPenColor(lightPurple);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.3);
		
		StdDraw.setPenColor(medPurple);
		StdDraw.filledRectangle(0.5, 0.55, 0.4, 0.05);
		StdDraw.filledRectangle(0.25, 0.5, 0.05, 0.3);
		StdDraw.filledRectangle(0.45, 0.5, 0.05, 0.3);
		
		StdDraw.setPenColor(darkPurple);
		StdDraw.filledSquare(0.25,0.55,0.05);
		StdDraw.filledSquare(0.45, 0.55, 0.05);
		
		StdDraw.setPenColor(green);
		StdDraw.filledEllipse(0.7, 0.5, 0.075, 0.25);
		
		StdDraw.setPenColor(darkPurple);
		StdDraw.filledCircle(0.7, 0.5, 0.05);
		
	}
}