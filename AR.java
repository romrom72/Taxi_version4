/**
 * AR est la classe comprenant toutes les infos pour un aller retour.
 *
 * @author Romain Locquet
 * @version 1.0
 */

public class AR extends Tarif {

	private double TarifNW;
	private double TarifJS;

	//Accesseurs

		public double getTarifNW()
		{
			return TarifNW;
		}


		public double getTarifJS()
		{
			return TarifJS;
		}

	//Modifieurs


		public void setTarifNW(double TNW)
		{
			this.TarifNW = TNW;
		}

		public void setTarifJS(double TJS)
		{
			this.TarifJS = TJS;
		}
	// Constructeurs

	public AR()
{
		TarifNW = 1.19;
		TarifJS = 0.79;
}

	public AR(int D, double PC, double THJ, double THN, double TNW, double TJS)
	{
		super( D,  PC,  THJ, THN);
		this.TarifJS = TJS;
		this.TarifNW = TNW;
	}

	// methodes


	public void afficher()
	{
		System.out.println(TarifJS+","+TarifNW+".");
	}
}