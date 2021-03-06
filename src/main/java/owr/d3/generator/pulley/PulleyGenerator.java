package owr.d3.generator.pulley;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import owr.d3.generator.pulley.export.PulleyProfileExporter;
import owr.d3.generator.pulley.profile.BeltProfileType;
import owr.d3.generator.pulley.profile.PulleyProfileGenerator;
import owr.d3.generator.pulley.profile.PulleyProfileParams;

public class PulleyGenerator {

	private static final String ARG_PROFILE = "p";
	private static final String ARG_TCOUNT = "t";
	private static final String ARG_ATW = "atw";
	private static final String ARG_ATD = "atd";

	private static final String FILE_EXT = "DXF";
	private static final String FILE_PREFIX = "pulley_";

	public static void main(String... args) {

		Options options = new Options();

		Option optType = new Option(ARG_PROFILE, true, "Belt profile. One of: " + beltTypes());
		optType.setRequired(true);
		options.addOption(optType);

		Option optTc = new Option(ARG_TCOUNT, true, "Teeth count. Value should be >= 3");
		optTc.setRequired(true);
		options.addOption(optTc);

		Option optATW = new Option(ARG_ATW, true, "Additional tooth width (default value = 0.2 mm)");
		optATW.setRequired(false);
		options.addOption(optATW);

		Option optATD = new Option(ARG_ATD, true, "Additional tooth depth (default value = 0.0 mm)");
		optATD.setRequired(false);
		options.addOption(optATD);

		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		CommandLine cmd;

		try {
			cmd = parser.parse(options, args);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			formatter.printHelp("pulley-profile-generator.jar", options);

			System.exit(1);
			return;
		}

		String argT = cmd.getOptionValue(ARG_PROFILE);
		BeltProfileType type = BeltProfileType.valueOf(argT);

		String argC = cmd.getOptionValue(ARG_TCOUNT);
		int teethCount = Integer.valueOf(argC);
		if (teethCount < 3) {
			teethCount = 3;
		}

		PulleyGenerator g = new PulleyGenerator();
		PulleyProfileParams params = new PulleyProfileParams(type, teethCount);

		String argATW = cmd.getOptionValue(ARG_ATW);
		if (argATW != null) {
			params.setAdditionalToothWidth(Double.valueOf(argATW));
		}

		String argATD = cmd.getOptionValue(ARG_ATD);
		if (argATD != null) {
			params.setAdditionalToothDepth(Double.valueOf(argATD));
		}

		g.generateDXF(params);
	}

	private static String beltTypes() {

		BeltProfileType[] typesPull = BeltProfileType.values();
		String out = "";
		for (BeltProfileType beltProfileType : typesPull) {
			out += "[" + beltProfileType.name() + "] ";
		}

		return out;
	}

	public void generateDXF(PulleyProfileParams params) {

		PulleyProfileGenerator gen = new PulleyProfileGenerator();
		double[][] vertexes = gen.createPulleyProfile(params);
		String fileName = createName(params.getType(), params.getTeethCount());

		PulleyProfileExporter exporter = new PulleyProfileExporter();
		String pathToFile = exporter.exportAsPolyline(vertexes, fileName);

		System.out.println("Result: ");
		System.out.println(pathToFile);
	}

	private String createName(BeltProfileType type, int teethCount) {
		return FILE_PREFIX + type.toString() + "_" + teethCount + "." + FILE_EXT;
	}

}
