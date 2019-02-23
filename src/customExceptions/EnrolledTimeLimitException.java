package customExceptions;

@SuppressWarnings("serial")
public class EnrolledTimeLimitException extends Exception{
	private int week = 1;
	
	public EnrolledTimeLimitException (int pWeek) {
		super("The enorllment time limit has been reached. Student cannot be enroll. Current week is " + pWeek + ".");
		week = pWeek;
	}
	public int getWeek() {
		return week;
	}
	
}
