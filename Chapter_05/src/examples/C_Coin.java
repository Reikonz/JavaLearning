package examples;

public class C_Coin
{
	private final int	HEADS	= 0;
	@SuppressWarnings("unused")
	private final int	TAILS	= 1;
	private int			face;

	// Sets up the coin by flipping it initially.
	public C_Coin()
	{
		flip();
	}

	// Flips the coin by randomly choosing a face value.
	public void flip()
	{
		face = (int) (Math.random() * 2);  // [0, 2)
	}

	// Returns true if the current face of the coin is heads.
	public boolean isHeads()
	{
		return (face == HEADS);
	}

	// Returns the current face of the coin as a string.
	public String toString()
	{
		String faceName;

		if (face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";

		return faceName;
	}

	/**
	 * @return the face
	 */
	public int getFace()
	{
		return face;
	}

	/**
	 * @param face the face to set
	 */
	public void setFace(int face)
	{
		this.face = face;
	}
}
