public class GameServer implements Server {

	HardwareKeuzes hardwareKeuze;
	GameSlotsKeuzes slots;
	
	public GameServer(HardwareKeuzes HardwareKeuze, GameSlotsKeuzes Slots){
		this.hardwareKeuze = HardwareKeuze;
		this.slots = Slots;
	}
	
}
