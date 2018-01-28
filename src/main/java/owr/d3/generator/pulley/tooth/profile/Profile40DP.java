package owr.d3.generator.pulley.tooth.profile;

import owr.d3.generator.pulley.utils.DiameterCalc;

public class Profile40DP implements IToothProfile {

	@Override
	public double getToothDepth() {
		return 0.457;
	}

	@Override
	public double getToothWidth() {
		return 1.226;
	}

	@Override
	public double calcOutsideDiameter(int teeth) {
		return DiameterCalc.getPulleyOutsideDiameter(teeth, 2.07264, 0.1778);
	}

	@Override
	public double[][] getProfileVertexes() {
		return new double[][] { { -0.612775, -0.5 }, { -0.612775, 0 }, { -0.574719, 0.010187 }, { -0.546453, 0.0381 },
				{ -0.355953, 0.3683 }, { -0.327604, 0.405408 }, { -0.291086, 0.433388 }, { -0.248548, 0.451049 },
				{ -0.202142, 0.4572 }, { 0.202494, 0.4572 }, { 0.248653, 0.451049 }, { 0.291042, 0.433388 },
				{ 0.327609, 0.405408 }, { 0.356306, 0.3683 }, { 0.546806, 0.0381 }, { 0.574499, 0.010187 },
				{ 0.612775, 0 }, { 0.612775, -0.5 } };
	}

}
