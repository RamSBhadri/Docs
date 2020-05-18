
public class ActivityParallelFactory extends AbstractActivityFactory{

	private static ActivityParallelFactory instance = new ActivityParallelFactory();
	
	public static ActivityParallelFactory getInstance() {
		return instance;
	}
	
	public Activity createActivity(String x, int per) {
		return new Activity(x, per, "back");
	}
}
