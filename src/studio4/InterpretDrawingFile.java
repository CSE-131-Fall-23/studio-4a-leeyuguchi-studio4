package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shape = in.next();

		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();

		Color color = new Color(r, g, b);

		boolean filled = in.nextBoolean();

		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();

		if (shape .equals("rectangle")) {
			StdDraw.setPenColor(color);
			if (filled == true)
			StdDraw.filledRectangle(x1, y1, x2, y2);
			else
			StdDraw.rectangle(x1, y1, x2, y2);
		}
		else if (shape .equals("ellipse")) {
			StdDraw.setPenColor(color);
			if (filled == true)
			StdDraw.filledEllipse(x1, y1, x2, y2);
			else
			StdDraw.ellipse(x1, y1, x2, y2);
		}
		else if (shape .equals("triangle")) {
			StdDraw.setPenColor(color);
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double[] x = {x1, x2, x3};
			double[] y = {y1, y2, y3};
			if (filled == true)
			StdDraw.filledPolygon(x, y);
			else
			StdDraw.polygon(x, y);
		}


	}
}
