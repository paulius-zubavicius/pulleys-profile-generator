package owr.d3.generator.pulley.tooth.profile;

import owr.d3.generator.pulley.utils.DiameterCalc;

public class ProfileMXL implements IToothProfile {

	@Override
	public double getToothDepth() {
		return 0.508;
	}

	@Override
	public double getToothWidth() {
		return 1.321;
	}

	@Override
	public double calcOutsideDiameter(int teeth) {
		return DiameterCalc.getPulleyOutsideDiameter(teeth, 2.032, 0.254);
	}

	@Override
	public double[][] getProfileVertexes() {
		return new double[][] { { -0.660421, -0.5 }, { -0.660421, 0 }, { -0.621898, 0.006033 }, { -0.587714, 0.023037 },
				{ -0.560056, 0.049424 }, { -0.541182, 0.083609 }, { -0.417357, 0.424392 }, { -0.398413, 0.458752 },
				{ -0.370649, 0.48514 }, { -0.336324, 0.502074 }, { -0.297744, 0.508035 }, { 0.297744, 0.508035 },
				{ 0.336268, 0.502074 }, { 0.370452, 0.48514 }, { 0.39811, 0.458752 }, { 0.416983, 0.424392 },
				{ 0.540808, 0.083609 }, { 0.559752, 0.049424 }, { 0.587516, 0.023037 }, { 0.621841, 0.006033 },
				{ 0.660421, 0 }, { 0.660421, -0.5 } };
	}

}
