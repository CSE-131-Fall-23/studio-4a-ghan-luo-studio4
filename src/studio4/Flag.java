package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void italy() {
		StdDraw.clear();
		StdDraw.setPenColor(0,180,0);
		StdDraw.filledRectangle(3, 4, 4, 4);
		StdDraw.setPenColor(200,0,0);
		StdDraw.filledRectangle(18, 4, 4, 4);
	}
	public static void main(String[] args) {
		StdDraw.setXscale(0,22);
		StdDraw.setYscale(0,8);
		italy();
	}
}