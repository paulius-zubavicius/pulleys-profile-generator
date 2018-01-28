package owr.d3.generator.pulley.utils;

import java.awt.geom.AffineTransform;

public class VertexUtil {

	public static void rotate(double angle, double[][] vertexes) {
		for (int vertex = 0; vertex < vertexes.length; vertex++) {
			AffineTransform.getRotateInstance(angle, 0, 0).transform(vertexes[vertex], 0, vertexes[vertex], 0, 1);
		}
	}

	public static void translate(double tx, double ty, double[][] vertexes) {
		for (int vertex = 0; vertex < vertexes.length; vertex++) {
			AffineTransform.getTranslateInstance(tx, ty).transform(vertexes[vertex], 0, vertexes[vertex], 0, 1);
		}
	}

	public static void scale(double sx, double sy, double[][] vertexes) {
		for (int vertex = 0; vertex < vertexes.length; vertex++) {
			AffineTransform.getScaleInstance(sx, sy).transform(vertexes[vertex], 0, vertexes[vertex], 0, 1);
		}
	}

}
