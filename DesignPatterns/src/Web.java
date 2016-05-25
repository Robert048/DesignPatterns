public class Web extends Server {
	WebruimteKeuzes Webruimte;
	WebSubdomeinenKeuzes Subdomeinen;
	
	public Web(WebruimteKeuzes Webruimte, WebSubdomeinenKeuzes Subdomeinen){
		this.Webruimte = Webruimte;
		this.Subdomeinen = Subdomeinen;
	}
}