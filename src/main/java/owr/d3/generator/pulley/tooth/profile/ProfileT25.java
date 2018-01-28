package owr.d3.generator.pulley.tooth.profile;

import owr.d3.generator.pulley.utils.DiameterCalc;

public class ProfileT25 implements IToothProfile {

	@Override
	public double getToothDepth() {
		return 0.7;
	}

	@Override
	public double getToothWidth() {
		return 1.678;
	}

	@Override
	public double calcOutsideDiameter(int teeth) {
		return DiameterCalc.getPulleyOutsideDiameterCurve(teeth, 0.7467, 0.796, 1.026);
	}

	@Override
	public double[][] getProfileVertexes() {
		return new double[][] { { -0.839258, -0.5 }, { -0.839258, 0 }, { -0.770246, 0.021652 }, { -0.726369, 0.079022 },
				{ -0.529167, 0.620889 }, { -0.485025, 0.67826 }, { -0.416278, 0.699911 }, { 0.416278, 0.699911 },
				{ 0.484849, 0.67826 }, { 0.528814, 0.620889 }, { 0.726369, 0.079022 }, { 0.770114, 0.021652 },
				{ 0.839258, 0 }, { 0.839258, -0.5 } };
	}

}
