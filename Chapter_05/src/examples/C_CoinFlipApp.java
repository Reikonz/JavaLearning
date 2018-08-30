package examples;

public class C_CoinFlipApp
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	      C_Coin myCoin = new C_Coin();
	      myCoin.flip();
	      System.out.println (myCoin);
	      if (myCoin.isHeads())
	         System.out.println ("You win.");
	      else
	         System.out.println ("Better luck next time.");
	}
}
