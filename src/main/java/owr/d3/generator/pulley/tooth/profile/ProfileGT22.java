package owr.d3.generator.pulley.tooth.profile;

import owr.d3.generator.pulley.utils.DiameterCalc;

public class ProfileGT22 implements IToothProfile {

	@Override
	public double getToothDepth() {
		return 0.764;
	}

	@Override
	public double getToothWidth() {
		return 1.494;
	}

	@Override
	public double calcOutsideDiameter(int teeth) {
		return DiameterCalc.getPulleyOutsideDiameter(teeth, 2, 0.254);
	}

	@Override
	public double[][] getProfileVertexes() {
		return new double[][] { { 0.747183, -0.5 }, { 0.747183, 0 }, { 0.647876, 0.037218 }, { 0.598311, 0.130528 },
				{ 0.578556, 0.238423 }, { 0.547158, 0.343077 }, { 0.504649, 0.443762 }, { 0.451556, 0.53975 },
				{ 0.358229, 0.636924 }, { 0.2484, 0.707276 }, { 0.127259, 0.750044 }, { 0, 0.76447 },
				{ -0.127259, 0.750044 }, { -0.2484, 0.707276 }, { -0.358229, 0.636924 }, { -0.451556, 0.53975 },
				{ -0.504797, 0.443762 }, { -0.547291, 0.343077 }, { -0.578605, 0.238423 }, { -0.598311, 0.130528 },
				{ -0.648009, 0.037218 }, { -0.747183, 0 }, { -0.747183, -0.5 } };
	}

}
