package owr.d3.generator.pulley.tooth.profile;

import owr.d3.generator.pulley.profile.BeltProfileType;

public class ToothProfileFactory {

	public static IToothProfile create(BeltProfileType profile) {

		switch (profile) {
		case DP40:
			return new Profile40DP();
		case AT5:
			return new ProfileAT5();
		case GT2_2mm:
			return new ProfileGT22();
		case GT2_3mm:
			return new ProfileGT23();
		case GT2_5mm:
			return new ProfileGT25();
		case H:
			return new ProfileH();
		case HTD_3mm:
			return new ProfileHTD3();
		case HTD_5mm:
			return new ProfileHTD5();
		case HTD_8mm:
			return new ProfileHTD8();
		case MXL:
			return new ProfileMXL();
		case XL:
			return new ProfileXL();
		case T25:
			return new ProfileT25();
		case T5:
			return new ProfileT5();
		case T10:
			return new ProfileT10();

		}

		throw new RuntimeException("No case for: " + profile);
	}

}
