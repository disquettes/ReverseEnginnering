import java.util.Vector;

public class CREDIT extends PAYMENT {

	public Integer number;

	public String type;

	private Integer expDate;

	public Vector myPaYMENT;

	public void authorized() {
	}

	@Override
	public void pay() {
		System.out.println("Pay with credit card: " + amount + " $");
	}
}