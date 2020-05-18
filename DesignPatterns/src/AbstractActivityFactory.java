
public abstract class AbstractActivityFactory {

	public static AbstractActivityFactory getInstance(String type) {
		if(type.equals("parallel"))
			return ActivityParallelFactory.getInstance();
		else if(type.equals("back"))
			return ActivityBackgroundFactory.getInstance();
		else if(type.equals("fore"))
			return ActivityFactory.getInstance();
		else if(type.equals("mandatory"))
			return ActivityMandatoryFactory.getInstance();
 
	}
	
	public abstract Activity createActivity(String x, int per);
			
}
