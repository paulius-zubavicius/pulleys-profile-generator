package owr.d3.generator.pulley.tooth.profile;

import owr.d3.generator.pulley.utils.DiameterCalc;

public class ProfileHTD3 implements IToothProfile {

	@Override
	public double getToothDepth() {
		return 1.289;
	}

	@Override
	public double getToothWidth() {
		return 2.27;
	}

	@Override
	public double calcOutsideDiameter(int teeth) {
		return DiameterCalc.getPulleyOutsideDiameter(teeth, 3, 0.381);
	}

	@Override
	public double[][] getProfileVertexes() {
		return new double[][] { { -1.135062, -0.5 }, { -1.135062, 0 }, { -1.048323, 0.015484 }, { -0.974284, 0.058517 },
				{ -0.919162, 0.123974 }, { -0.889176, 0.206728 }, { -0.81721, 0.579614 }, { -0.800806, 0.653232 },
				{ -0.778384, 0.72416 }, { -0.750244, 0.792137 }, { -0.716685, 0.856903 }, { -0.678005, 0.918199 },
				{ -0.634505, 0.975764 }, { -0.586483, 1.029338 }, { -0.534238, 1.078662 }, { -0.47807, 1.123476 },
				{ -0.418278, 1.16352 }, { -0.355162, 1.198533 }, { -0.289019, 1.228257 }, { -0.22015, 1.25243 },
				{ -0.148854, 1.270793 }, { -0.07543, 1.283087 }, { -0.000176, 1.28905 }, { 0.075081, 1.283145 },
				{ 0.148515, 1.270895 }, { 0.219827, 1.252561 }, { 0.288716, 1.228406 }, { 0.354879, 1.19869 },
				{ 0.418018, 1.163675 }, { 0.477831, 1.123623 }, { 0.534017, 1.078795 }, { 0.586276, 1.029452 },
				{ 0.634307, 0.975857 }, { 0.677809, 0.91827 }, { 0.716481, 0.856953 }, { 0.750022, 0.792167 },
				{ 0.778133, 0.724174 }, { 0.800511, 0.653236 }, { 0.816857, 0.579614 }, { 0.888471, 0.206728 },
				{ 0.919014, 0.123974 }, { 0.974328, 0.058517 }, { 1.048362, 0.015484 }, { 1.135062, 0 },
				{ 1.135062, -0.5 } };
	}

}