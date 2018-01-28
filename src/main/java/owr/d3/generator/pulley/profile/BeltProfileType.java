package owr.d3.generator.pulley.profile;

public enum BeltProfileType {

	MXL("XML"), 
	DP40("40 D.P."), 
	XL("XL"), 
	H("H"), 
	T25("T2.5"), 
	T5("T5"), 
	T10("T10"), 
	AT5("AT5"), 
	HTD_3mm("HTD 3mm"), 
	HTD_5mm("HTD 5mm"), 
	HTD_8mm("HTD 8mm"), 
	GT2_2mm("GT2 2mm"), 
	GT2_3mm("GT2 3mm"), 
	GT2_5mm("GT2 5mm");

	private String name;

	private BeltProfileType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
