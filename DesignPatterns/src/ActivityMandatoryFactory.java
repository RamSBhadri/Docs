
public class ActivityMandatoryFactory extends AbstractActivityFactory{

	private static ActivityMandatoryFactory instance = new ActivityMandatoryFactory();
	
	public static ActivityMandatoryFactory getInstance() {
		return instance;
	}
	
	public Activity createActivity(String x, int per) {
		return new ActivityMandatory(x, per, "mandatory", 1, 4);
	}
}
