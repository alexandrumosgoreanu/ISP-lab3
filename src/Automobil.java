import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
	public void salvare(String numeFisier) 
	{
			File logFile = new File(numeFisier);
			PrintWriter filePrint;
			try {
			logFile.createNewFile();
			} catch (IOException e1) { 
			e1.printStackTrace();
			}
			FileWriter testWriter;
			try { testWriter = new FileWriter(logFile);
			filePrint = new PrintWriter(testWriter,true);
			filePrint.println("Viteza maxima: " + this.vitezaMaxima + ", model: " + this.model + ", Combustibil: " + combustibil + ", transmisie: " + cutieViteze);
	
			} catch (IOException e) { 
			e.printStackTrace();
			}
			
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
