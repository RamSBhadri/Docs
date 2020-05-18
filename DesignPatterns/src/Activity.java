import java.util.List;

public abstract class Activity {
	private String name;
	private int percentageTime;
	private String type;
	private boolean isOnHold;
	protected String status;
	protected String canProirityBeBumped;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPercentageTime() {
		return percentageTime;
	}

	public void setPercentageTime(int percentageTime) {
		this.percentageTime = percentageTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isOnHold() {
		return isOnHold;
	}

	public void setOnHold(boolean isOnHold) {
		this.isOnHold = isOnHold;
	}

	public boolean isCancelled() {
		return isCancelled;
	}

	public void setCancelled(boolean isCancelled) {
		this.isCancelled = isCancelled;
	}

	protected boolean isCancelled;
	
	public Activity(String name, int percentage, String type) {
			this.name = name;
			this.percentageTime = percentage;
			this.type = type;
	}
	
	public void execute() {
		this.status = "Started";
		Thread.sleep(9000);
		if(!this.isCancelled) {
			this.status = "Completed";		
		}
	}
}
