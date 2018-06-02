package owr.d3.generator.pulley.export.dfx;

public class DXFContentCreatorFactory {

	public static final IDXFContentCreator getInstance() {
		//
		return new DXFFileFormatR14();
	}

}
