package owr.d3.generator.pulley.tooth.profile;

public interface IToothProfile {

	double getToothDepth();

	double getToothWidth();

	double calcOutsideDiameter(int teethCount);

	double[][] getProfileVertexes();

}
