import java.util.List;

public class Employee {
	private String fname;
	private String lname;
	private int age;
	private List<Activity> list;

	public void addActivity(String activity, int percentage) {
		Activity a1 = AbstractActivityFactory.getInstance("fore").createActivity("coding",12);
		Activity a2 = AbstractActivityFactory.getInstance("back").createActivity("swiping",12);
		Activity a3 = AbstractActivityFactory.getInstance("parallel").createActivity("planning",12);
		list.add(a1);
		a1.execute();
		list.add(a2);
		a2.execute();
		((ActivityBackground)a2).cancel();		
		list.add(a3);
		a3.execute();
		Activity a4 = AbstractActivityFactory.getInstance("mandatory").createActivity("Training",12);
		a4.execute();
		((ActivityMandatory)a4).cancel();
		
	}
}
