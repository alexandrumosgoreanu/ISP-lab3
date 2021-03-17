
public class Automobil extends Vehicul 
{

	private Combustibil combustibil;
	private Transmisie cutieViteze;

	
	public Automobil()
	{
		super();
		combustibil = null;
		cutieViteze = null;
	}
	
	public Automobil(int vitezaMaxima, String model, String combustibil, String cutieViteze)
	{
		super(vitezaMaxima, model);
		this.combustibil = Combustibil.valueOf(combustibil);
		this.cutieViteze = Transmisie.valueOf(cutieViteze);
	}

	public void afisare() 
	{
		super.afisare();
		System.out.println(combustibil + " " + cutieViteze);
	}

	/**
	 * 
	 * @param numeFieser 
	 */
	public void salvare(String numeFieser) 
	{
		
	}

	public Combustibil getCombustibil() {
		return combustibil;
	}

	public void setCombustibil(Combustibil combustibil) {
		this.combustibil = combustibil;
	}

	public Transmisie getCutieViteze() {
		return cutieViteze;
	}

	public void setCutieViteze(Transmisie cutieViteze) {
		this.cutieViteze = cutieViteze;
	}
};
