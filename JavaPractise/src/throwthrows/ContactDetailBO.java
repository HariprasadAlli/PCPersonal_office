package throwthrows;

public class ContactDetailBO {
	
	public static void validate(String moblie, String AlternateMobile) throws DuplicateMobileNumberException{
	if (moblie.equals(AlternateMobile))
	{
		throw new DuplicateMobileNumberException("Mobile number and alternate mobile number cannot be the same.");
	}

}
}