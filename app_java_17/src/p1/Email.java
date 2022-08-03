package p1;//METHOD OVERLOADING(POLYMORPHISM)

public class Email {
	public void SendEmail() {// no arguments
		System.out.println("promotional email");

	}

	public void SendEmail(String tcid) {// string
		System.out.println("transactional email");

	}

	public static void main(String[] args) {
		Email e = new Email();
		e.SendEmail();
		e.SendEmail("afdg45363");

	}
}
