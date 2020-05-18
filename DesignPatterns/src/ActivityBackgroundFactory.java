
public class ActivityBackgroundFactory extends AbstractActivityFactory{

	private static ActivityBackgroundFactory instance = new ActivityBackgroundFactory();
	
	public static ActivityBackgroundFactory getInstance() {
		return instance;
	}
	
	public Activity createActivity(String x, int per) {
		return new ActivityBackground(x, per, "back", 1, 4);
	}
}
