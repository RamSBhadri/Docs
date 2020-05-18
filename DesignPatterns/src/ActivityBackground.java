
public class ActivityBackground extends Activity implements Cancelable{
	private int priority; // 1-10
	private int delayedBy;

	public int getDelayedBy() {
		return delayedBy;
	}

	public void setDelayedBy(int delayedBy) {
		this.delayedBy = delayedBy;
	}

	public ActivityBackground(String x, int percentage, String type, int prio, int delayedBy) {
		super(x, percentage, type);
		this.delayedBy = 0;
		this.priority = 5;
		// TODO Auto-generated constructor stub
	}	

	public boolean cancel() {
		this.status = "Cancelled";
		isCancelled = true;
	}
}
