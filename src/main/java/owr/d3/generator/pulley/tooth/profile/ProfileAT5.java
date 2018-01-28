package owr.d3.generator.pulley.tooth.profile;

import owr.d3.generator.pulley.utils.DiameterCalc;

public class ProfileAT5 implements IToothProfile {

	@Override
	public double getToothDepth() {
		return 1.19;
	}

	@Override
	public double getToothWidth() {
		return 4.268;
	}

	@Override
	public double calcOutsideDiameter(int teeth) {
		return DiameterCalc.getPulleyOutsideDiameterCurve(teeth, 0.6523, 1.591, 1.064);
	}

	@Override
	public double[][] getProfileVertexes() {
		return new double[][] { { -2.134129, -0.75 }, { -2.134129, 0 }, { -2.058023, 0.005488 },
				{ -1.984595, 0.021547 }, { -1.914806, 0.047569 }, { -1.849614, 0.082947 }, { -1.789978, 0.127073 },
				{ -1.736857, 0.179338 }, { -1.691211, 0.239136 }, { -1.653999, 0.305859 }, { -1.349199, 0.959203 },
				{ -1.286933, 1.054635 }, { -1.201914, 1.127346 }, { -1.099961, 1.173664 }, { -0.986896, 1.18992 },
				{ 0.986543, 1.18992 }, { 1.099614, 1.173664 }, { 1.201605, 1.127346 }, { 1.286729, 1.054635 },
				{ 1.349199, 0.959203 }, { 1.653646, 0.305859 }, { 1.690859, 0.239136 }, { 1.73651, 0.179338 },
				{ 1.789644, 0.127073 }, { 1.849305, 0.082947 }, { 1.914539, 0.047569 }, { 1.984392, 0.021547 },
				{ 2.057906, 0.005488 }, { 2.134129, 0 }, { 2.134129, -0.75 } };
	}

}
