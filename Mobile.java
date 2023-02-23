package week1.day1;

public class Mobile {
	public void makecall() {
		System.out.println("Make a call for the session");
	}
	public void sendmsg() {
		System.out.println("Send a message to the team to join the session");
	}
public static void main(String[] args) {
	Mobile obj = new Mobile();
	obj.makecall();
	obj.sendmsg();
}
}
