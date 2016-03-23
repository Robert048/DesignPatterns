
public enum WebruimteKeuzes {
	BUDGET(200),
	BASIC(500),
	PREMIUM(1000);
	
	private final int value;
	
	WebruimteKeuzes(final int newValue) {
		value = newValue;
	}
	
	public int getValue() { return value; }
}
