package owr.d3.generator.pulley.profile;

public class PulleyProfileParams {

	private BeltProfileType type;
	private int teethCount;

	/**
	 * To improve fit of belt to pulley, set the following constant. Decrease or
	 * increase by 0.1mm at a time. We are modeling the *BELT* tooth here, not the
	 * tooth on the pulley. Increasing the number will *decrease* the pulley tooth
	 * size. Increasing the tooth width will also scale proportionately the tooth
	 * depth, to maintain the shape of the tooth, and increase how far into the
	 * pulley the tooth is indented. Can be negative
	 */
	private double additionalToothWidth = 0.2;

	/**
	 * If you need more tooth depth than this provides, adjust the following
	 * constant. However, this will cause the shape of the tooth to change.
	 */
	private double additionalToothDepth = 0;

	public PulleyProfileParams(BeltProfileType type, int teethCount) {
		this.type = type;
		this.teethCount = teethCount;
	}

	public BeltProfileType getType() {
		return type;
	}

	public void setType(BeltProfileType type) {
		this.type = type;
	}

	public int getTeethCount() {
		return teethCount;
	}

	public void setTeethCount(int teethCount) {
		this.teethCount = teethCount;
	}

	public double getAdditionalToothWidth() {
		return additionalToothWidth;
	}

	public void setAdditionalToothWidth(double additionalToothWidth) {
		this.additionalToothWidth = additionalToothWidth;
	}

	public double getAdditionalToothDepth() {
		return additionalToothDepth;
	}

	public void setAdditionalToothDepth(double additionalToothDepth) {
		this.additionalToothDepth = additionalToothDepth;
	}

}
