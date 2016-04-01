public enum WebSubdomeinenKeuzes {
	BUDGET(10),
	BASIC(25),
	PREMIUM(100);
	
	private final int value;
	
	WebSubdomeinenKeuzes(final int newValue) {
		value = newValue;
	}
	
	public int getValue() { return value; }
}
