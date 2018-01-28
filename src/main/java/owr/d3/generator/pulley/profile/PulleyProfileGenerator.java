package owr.d3.generator.pulley.profile;

import java.util.ArrayList;
import java.util.List;

import owr.d3.generator.pulley.tooth.profile.IToothProfile;
import owr.d3.generator.pulley.tooth.profile.ToothProfileFactory;
import owr.d3.generator.pulley.utils.VertexUtil;

public class PulleyProfileGenerator {

	/**
	 * Returns vertexes set of pulley profile
	 * 
	 */
	public double[][] createPulleyProfile(PulleyProfileParams params) {
		IToothProfile profile = ToothProfileFactory.create(params.getType());

		double toothDistFromCentre = Math.sqrt(Math.pow(profile.calcOutsideDiameter(params.getTeethCount()) / 2, 2)
				- Math.pow((profile.getToothWidth() + params.getAdditionalToothWidth()) / 2, 2));
		double toothWidthScale = (profile.getToothWidth() + params.getAdditionalToothWidth()) / profile.getToothWidth();
		double toothDepthScale = ((profile.getToothDepth() + params.getAdditionalToothDepth())
				/ profile.getToothDepth());

		double[][] toothVertexes = profile.getProfileVertexes();

		/**
		 * <pre>
		 * 1) scale
		 * 2) translate
		 * 3) Cut
		 * </pre>
		 */

		VertexUtil.scale(toothWidthScale, toothDepthScale, toothVertexes);
		VertexUtil.translate(0, -toothDistFromCentre, toothVertexes);
		toothVertexes = cutOutsideCirclePoints(toothVertexes, toothDistFromCentre);

		/**
		 * <pre>
		 * 4) duplicating
		 * 5) rotate each
		 * </pre>
		 */
		double[][] readyForMultiplication = null;
		List<double[][]> listOfTooth = new ArrayList<>();
		for (int tNr = 0; tNr < params.getTeethCount(); tNr++) {

			readyForMultiplication = returnCopyOf(toothVertexes);
			listOfTooth.add(readyForMultiplication);
			VertexUtil.rotate((Math.PI * 2 / params.getTeethCount()) * tNr, readyForMultiplication);
		}

		/**
		 * <pre>
		 * 6) Closing polygon to solid
		 * </pre>
		 */

		return mergeToIntegral(listOfTooth);

	}

	private double[][] returnCopyOf(double[][] toothVertexes) {
		double[][] result = new double[toothVertexes.length][2];

		for (int i = 0; i < result.length; i++) {
			result[i][0] = toothVertexes[i][0];
			result[i][1] = toothVertexes[i][1];
		}

		return result;
	}

	private double[][] cutOutsideCirclePoints(double[][] toothVertexes, double tooth_distance_from_centre) {
		double[][] result = new double[toothVertexes.length - 2][2];
		for (int i = 0; i < result.length; i++) {
			result[i][0] = toothVertexes[i + 1][0];
			result[i][1] = toothVertexes[i + 1][1];
		}
		return result;
	}

	private double[][] mergeToIntegral(List<double[][]> listOfTooth) {

		// calc the size
		int size = 0;
		for (double[][] vertexesOfTooth : listOfTooth) {
			size += vertexesOfTooth.length;
		}

		double[][] result = new double[size][2];

		// copy all polygons one by one into new array
		size = 0;
		for (double[][] vertexesOfTooth : listOfTooth) {

			for (int i = 0; i < vertexesOfTooth.length; i++) {
				result[size][0] = vertexesOfTooth[i][0];
				result[size][1] = vertexesOfTooth[i][1];
				size++;
			}
		}

		return result;
	}
}
