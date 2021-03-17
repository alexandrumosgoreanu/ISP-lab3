public class Vehicul 
{
	protected int vitezaMaxima;
	protected String model;

	public Vehicul()
	{
		vitezaMaxima = 0;
		model = "";
	}
	
	public Vehicul(int vitezaMaxima, String model)
	{
		this.vitezaMaxima = vitezaMaxima;
		this.model = model;
	}

	public int getVitezaMaxima() 
	{
		return vitezaMaxima;
	}

	public void setVitezaMaxima(int vitezaMaxima) 
	{
		this.vitezaMaxima = vitezaMaxima;
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}
	
	public void afisare()
	{
		System.out.println(model + " " + vitezaMaxima);
	}
};
