package owr.d3.generator.pulley.export;

import owr.d3.generator.pulley.utils.FileUtil;

public class ExporterToDXF {

	public String exportAsPolyline(double[][] vertexes, String fileName) {
		StringBuilder sb = new StringBuilder();

		appendBegin(sb);
		appendVertexes(sb, vertexes);
		appendEnd(sb);
		FileUtil.writeToFile(sb, fileName);

		return fileName;
	}

	private void appendVertexes(StringBuilder sb, double[][] vertexes) {

		for (int i = 0; i < vertexes.length; i++) {
			sb.append("  0\n");
			sb.append("VERTEX\n");
			sb.append("  8\n");
			sb.append("0\n");
			sb.append(" 10\n");
			sb.append(vertexes[i][0]);
			sb.append("\n");
			sb.append(" 20\n");
			sb.append(vertexes[i][1]);
			sb.append("\n");
			sb.append(" 30\n");
			sb.append("0.0\n");
		}

	}

	private void appendEnd(StringBuilder sb) {

		sb.append("  0\n");
		sb.append("SEQEND\n");
		sb.append("  8\n");
		sb.append("0\n");
		sb.append("  0\n");
		sb.append("ENDSEC\n");
		sb.append("  0\n");
		sb.append("EOF\n");
	}

	private void appendBegin(StringBuilder sb) {
		sb.append("\n");
		sb.append("0\n");
		sb.append("SECTION\n");
		sb.append("  2\n");
		sb.append("HEADER\n");
		sb.append("  9\n");
		sb.append("$ACADVER\n");
		sb.append("  1\n");
		sb.append("AC1009\n");
		sb.append("  9\n");
		sb.append("$INSBASE\n");
		sb.append(" 10\n");
		sb.append("0.0\n");
		sb.append(" 20\n");
		sb.append("0.0\n");
		sb.append(" 30\n");
		sb.append("0.0\n");
		sb.append("  9\n");
		sb.append("$EXTMIN\n");
		sb.append(" 10\n");
		sb.append("0.0\n");
		sb.append(" 20\n");
		sb.append("0.0\n");
		sb.append(" 30\n");
		sb.append("0.0\n");
		sb.append("  9\n");
		sb.append("$EXTMAX\n");
		sb.append(" 10\n");
		sb.append("0.0\n");
		sb.append(" 20\n");
		sb.append("0.0\n");
		sb.append(" 30\n");
		sb.append("0.0\n");
		sb.append("  0\n");
		sb.append("ENDSEC\n");
		sb.append("  0\n");
		sb.append("SECTION\n");
		sb.append("  2\n");
		sb.append("TABLES\n");
		sb.append("  0\n");
		sb.append("TABLE\n");
		sb.append("  2\n");
		sb.append("VPORT\n");
		sb.append(" 70\n");
		sb.append("0\n");
		sb.append("  0\n");
		sb.append("ENDTAB\n");
		sb.append("  0\n");
		sb.append("TABLE\n");
		sb.append("  2\n");
		sb.append("LTYPE\n");
		sb.append(" 70\n");
		sb.append("1\n");
		sb.append("  0\n");
		sb.append("LTYPE\n");
		sb.append("  2\n");
		sb.append("CONTINUOUS\n");
		sb.append(" 70\n");
		sb.append("0\n");
		sb.append("  3\n");
		sb.append("Solid line\n");
		sb.append(" 72\n");
		sb.append("65\n");
		sb.append(" 73\n");
		sb.append("0\n");
		sb.append(" 40\n");
		sb.append("0.0\n");
		sb.append("  0\n");
		sb.append("ENDTAB\n");
		sb.append("  0\n");
		sb.append("TABLE\n");
		sb.append("  2\n");
		sb.append("LAYER\n");
		sb.append(" 70\n");
		sb.append("1\n");
		sb.append("  0\n");
		sb.append("LAYER\n");
		sb.append("  2\n");
		sb.append("0\n");
		sb.append(" 70\n");
		sb.append("64\n");
		sb.append(" 62\n");
		sb.append("7\n");
		sb.append("  6\n");
		sb.append("continuous\n");
		sb.append("  0\n");
		sb.append("ENDTAB\n");
		sb.append("  0\n");
		sb.append("TABLE\n");
		sb.append("  2\n");
		sb.append("STYLE\n");
		sb.append(" 70\n");
		sb.append("1\n");
		sb.append("  0\n");
		sb.append("STYLE\n");
		sb.append("  2\n");
		sb.append("STANDARD\n");
		sb.append(" 70\n");
		sb.append("0\n");
		sb.append(" 40\n");
		sb.append("0\n");
		sb.append(" 41\n");
		sb.append("1.0\n");
		sb.append(" 50\n");
		sb.append("0.0\n");
		sb.append(" 71\n");
		sb.append("0\n");
		sb.append(" 42\n");
		sb.append("1\n");
		sb.append(" 3\n");
		sb.append("ARIAL.TTF\n");
		sb.append(" 4\n");
		sb.append("\n");
		sb.append("  0\n");
		sb.append("ENDTAB\n");
		sb.append("  0\n");
		sb.append("TABLE\n");
		sb.append("  2\n");
		sb.append("VIEW\n");
		sb.append(" 70\n");
		sb.append("0\n");
		sb.append("  0\n");
		sb.append("ENDTAB\n");
		sb.append("  0\n");
		sb.append("ENDSEC\n");
		sb.append("  0\n");
		sb.append("SECTION\n");
		sb.append("  2\n");
		sb.append("BLOCKS\n");
		sb.append("  0\n");
		sb.append("ENDSEC\n");
		sb.append("  0\n");
		sb.append("SECTION\n");
		sb.append("  2\n");
		sb.append("ENTITIES\n");
		sb.append("  0\n");
		sb.append("POLYLINE\n");
		sb.append("  8\n");
		sb.append("0\n");
		sb.append(" 62\n");
		sb.append("7\n");
		sb.append(" 70\n");
		sb.append("1\n");
		sb.append(" 66\n");
		sb.append("1\n");
		sb.append(" 10\n");
		sb.append("0.0\n");
		sb.append(" 20\n");
		sb.append("0.0\n");
		sb.append(" 30\n");
		sb.append("0.0\n");

	}

}
