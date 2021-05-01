

public class TestCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin nickel = new Coin(); 
		nickel.flipCoin(); 
		if (nickel.showFace() == 0) { 
		System.out.println("Heads up!"); 
		} else { 
		System.out.println("Tails up!"); 
		} 


	}

}
class Coin {
	int flipcoin;
	public int  flipCoin() {
		flipcoin = (int)Math.round(Math.random());
		return flipcoin;
	}
	
	public int showFace() {
		if (flipcoin == 0) {
			return 0;
		}
		else {
			return 1;
		}
	}
}


