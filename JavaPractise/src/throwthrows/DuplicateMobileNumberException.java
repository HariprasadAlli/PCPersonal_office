package throwthrows;

public class DuplicateMobileNumberException extends Exception {
	
	private String msg;
	public DuplicateMobileNumberException(String msg)
	{
		
		this.msg = msg;
	}
	public String toString()
	{
		return "DuplicateMobileNumberException: " +this.msg;
	}

}
