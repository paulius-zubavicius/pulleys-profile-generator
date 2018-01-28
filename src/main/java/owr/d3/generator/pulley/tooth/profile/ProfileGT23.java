package owr.d3.generator.pulley.tooth.profile;

import owr.d3.generator.pulley.utils.DiameterCalc;

public class ProfileGT23 implements IToothProfile {

	@Override
	public double getToothDepth() {
		return 1.169;
	}

	@Override
	public double getToothWidth() {
		return 2.31;
	}

	@Override
	public double calcOutsideDiameter(int teeth) {
		return DiameterCalc.getPulleyOutsideDiameter(teeth, 3, 0.381);
	}

	@Override
	public double[][] getProfileVertexes() {
		return new double[][] { { -1.155171, -0.5 }, { -1.155171, 0 }, { -1.065317, 0.016448 }, { -0.989057, 0.062001 },
				{ -0.93297, 0.130969 }, { -0.90364, 0.217664 }, { -0.863705, 0.408181 }, { -0.800056, 0.591388 },
				{ -0.713587, 0.765004 }, { -0.60519, 0.926747 }, { -0.469751, 1.032548 }, { -0.320719, 1.108119 },
				{ -0.162625, 1.153462 }, { 0, 1.168577 }, { 0.162625, 1.153462 }, { 0.320719, 1.108119 },
				{ 0.469751, 1.032548 }, { 0.60519, 0.926747 }, { 0.713587, 0.765004 }, { 0.800056, 0.591388 },
				{ 0.863705, 0.408181 }, { 0.90364, 0.217664 }, { 0.932921, 0.130969 }, { 0.988924, 0.062001 },
				{ 1.065168, 0.016448 }, { 1.155171, 0 }, { 1.155171, -0.5 } };
	}

}
