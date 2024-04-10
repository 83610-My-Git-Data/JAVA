package assign6;

public class ExceptionLineTooLong extends Exception {
	
	private String message;
	
	public ExceptionLineTooLong() {
		this.message="";
	}

	public ExceptionLineTooLong(String message) {

		this.message = message;
	}
	
	@Override
	public void printStackTrace() {
		
		System.err.println("Exception : ");
		System.err.println("The strings is too long: ");
	
	}
	
	
	

}
