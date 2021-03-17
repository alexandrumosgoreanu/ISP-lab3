
public class Application 
{
	public static void main(String[] args)
	{
		Automobil a = new Automobil();
		a.setCombustibil(Combustibil.valueOf("Benzina"));
		a.setCutieViteze(Transmisie.valueOf("Manuala"));
		a.setModel("A3");
		a.setVitezaMaxima(219);
		a.afisare();
	}
}
