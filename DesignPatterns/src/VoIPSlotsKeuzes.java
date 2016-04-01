
public enum VoIPSlotsKeuzes {
	BUDGET(32),
	BASIC(64),
	PREMIUM(256);
	
	private final int value;
	
	VoIPSlotsKeuzes(final int newValue) {
		value = newValue;
	}
	
	public int getValue() { return value; }
}
