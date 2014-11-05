/**
 * AS est la classe comprenant toutes les infos pour un aller retour.
 *
 * @author Romain Locquet
 * @version 1.0
 */

public class AS extends Tarif {

//Attributs

	private double TarifNW;
	private double TarifJS;

//Accesseurs

	public double getTarifNW(){
		return TarifNW;
	}

	public double getTarifJS(){
		return TarifJS;
	}

//Modifieurs

	public void setTarifNW(double TNW){
		this.TarifNW = TNW;
	}

	public void setTarifJS(double TJS){
		this.TarifJS = TJS;
	}

//Constructeurs

	public AS() {
		TarifNW = 2.38;
		TarifJS = 1.58;
	}

	public AS(int D, double PC, double THJ, double THN, double TNW, double TJS)
	{
		super(D, PC,  THJ,  THN);
		this.TarifNW = TNW;
		this.TarifJS = TJS;
	}

//Méthodes




	}


