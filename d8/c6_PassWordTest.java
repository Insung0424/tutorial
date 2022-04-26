package ch10;

public class PassWordTest {

	private String password;
	
	public String getPassWord() {
		return password;
	}
	
	public void setPassword(String password) throws PassWordException{
		if(password == null) {
			throw new PassWordException("null");
		}
		else if(password.length() < 5) {
			throw new PassWordException("grater than 5");
		}
		else if (password.matches("[a-zA-Z]+")) {
			throw new PassWordException("include special character");
		}
		this.password = password;
	}
	
	public static void main(String[] args) {

			PassWordTest test = new PassWordTest();
			
			String password = null;
			
			try {
				test.setPassword(password);
				System.out.println("no bug1");
			} catch (PassWordException e) {
				System.out.println(e.getMessage());
			}
			
			password = "abc";
			try {
				test.setPassword(password);
				System.out.println("no bug2");
			} catch (PassWordException e) {
				System.out.println(e.getMessage());
			}
			
			password = "abcdef";
			try {
				test.setPassword(password);
				System.out.println("no bug3");
			} catch (PassWordException e) {
				System.out.println(e.getMessage());
			}
			
			password = "abcd1@%";
			try {
				test.setPassword(password);
				System.out.println("no bug4");
			} catch (PassWordException e) {
				System.out.println(e.getMessage());
			}
	}

}
