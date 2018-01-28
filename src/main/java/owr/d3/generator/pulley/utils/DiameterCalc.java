package owr.d3.generator.pulley.utils;

public class DiameterCalc {

	public static double getPulleyOutsideDiameterCurve(int teeth, double b, double c, double d) {
		return ((c * Math.pow(teeth, d)) / (b + Math.pow(teeth, d))) * teeth;
	}

	public static double getPulleyOutsideDiameter(int teeth, double toothPitch, double pitchLineOffset) {
		return (2 * ((teeth * toothPitch) / (Math.PI * 2) - pitchLineOffset));
	}

}
