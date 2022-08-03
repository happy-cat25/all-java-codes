package p1;

public class PlatinumAccount extends GoldAccount {
	@Override
	public void ChequeBooks() {
		System.out.println(" Unlimited");//overriding no of cheque books
	}
	@Override
	public void RateOfInterest() {
		System.out.println(" 6%/year");//overriding rate of interest
	}
	
	public static void main(String[] args) {
		GoldAccount g = new GoldAccount();
		g.OnlineBanking();
		g.ChequeBooks();
		g.RateOfInterest();
		
		PlatinumAccount p = new PlatinumAccount();
		p.OnlineBanking();
		p.ChequeBooks();
		p.RateOfInterest();
	}

}
