package staticPackage;

public class StaticExampleClass {
	/*
	 * when we set a variable as static it becomes a common property
	 * and not unique for every instance.
	 * otherwise every instance will get a new version of the variable (when not static).
	 */
//	private static int wheelsCount = 4;
	private String make;
	private static int instanceNum = 0;
	
	public StaticExampleClass(String make) {
		this.make = make;
		instanceNum++;
	}
	
	public String getMake() {
		return make;
	}
	
	public static int getInstanceNum() {
		return instanceNum;
	}
	
}