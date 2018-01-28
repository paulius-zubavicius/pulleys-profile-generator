package owr.d3.generator.pulley.tooth.profile;

import owr.d3.generator.pulley.utils.DiameterCalc;

public class ProfileXL implements IToothProfile {

	@Override
	public double getToothDepth() {
		return 1.27;
	}

	@Override
	public double getToothWidth() {
		return 3.051;
	}

	@Override
	public double calcOutsideDiameter(int teeth) {
		return DiameterCalc.getPulleyOutsideDiameter(teeth, 5.08, 0.254);
	}

	@Override
	public double[][] getProfileVertexes() {
		return new double[][] { { -1.525411, -1 }, { -1.525411, 0 }, { -1.41777, 0.015495 }, { -1.320712, 0.059664 },
				{ -1.239661, 0.129034 }, { -1.180042, 0.220133 }, { -0.793044, 1.050219 }, { -0.733574, 1.141021 },
				{ -0.652507, 1.210425 }, { -0.555366, 1.254759 }, { -0.447675, 1.270353 }, { 0.447675, 1.270353 },
				{ 0.555366, 1.254759 }, { 0.652507, 1.210425 }, { 0.733574, 1.141021 }, { 0.793044, 1.050219 },
				{ 1.180042, 0.220133 }, { 1.239711, 0.129034 }, { 1.320844, 0.059664 }, { 1.417919, 0.015495 },
				{ 1.525411, 0 }, { 1.525411, -1 } };
	}

}
