package owr.d3.generator.pulley.export;

import owr.d3.generator.pulley.export.dfx.DXFContentCreatorFactory;
import owr.d3.generator.pulley.export.dfx.IDXFContentCreator;
import owr.d3.generator.pulley.utils.FileUtil;

public class PulleyProfileExporter {

	public void exportAsPolyline(double[][] vertexes, String fileName) {

		IDXFContentCreator cc = DXFContentCreatorFactory.getInstance();
		StringBuilder sb = new StringBuilder();

		// Create content
		cc.createDXFContent(vertexes, sb);

		// Write to file in working directory
		FileUtil.writeToFile(sb, fileName);

	}

}
