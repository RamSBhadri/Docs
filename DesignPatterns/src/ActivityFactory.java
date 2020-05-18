
public class ActivityFactory extends AbstractActivityFactory{
	
	private static ActivityFactory instance = new ActivityFactory();
	
	public static ActivityFactory getInstance() {
		return instance;
	}
	
	public Activity createActivity(String x, int per) {
		return new Activity(x, per, "fore");
	}
	
}
