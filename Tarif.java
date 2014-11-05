/**
 * Tarif est la classe comprenant toutes les infos pour un déplacement sans faire la distinction entre aller simple ou aller retour.
 *
 * @author Romain Locquet
 * @version 1.0
 */
public class Tarif {

	private int Dept;
	private double PriseCharge;
	private double TarifHoraireJ;
	private double TarifHoraireNWE;

//Accesseurs

	public int getDept(){
		return Dept;
	}

	public double getPriseCharge(){
		return PriseCharge;
	}

	public double getTarifHoraireJ(){
		return TarifHoraireJ;
	}

	public double getTarifHoraireNWE(){
		return TarifHoraireNWE;
	}

// Modifieurs

	public void setDept(int D){
		this.Dept = D;
	}

	public void setPriseCharge(double PC){
		this.PriseCharge = PC;
	}

	public void setTarifHoraireJ(double THJ){
		this.TarifHoraireJ = THJ;
	}

	public void setTarifHoraireNWE(double THN){
		this.TarifHoraireNWE = THN;
	}

// Constructeurs

	public Tarif() {
		Dept = 72;
		PriseCharge = 2.15;
		TarifHoraireJ = 22.86;
		TarifHoraireNWE = 22.86;
	}

	public Tarif( int D, double PC, double THJ, double THN) {
		this.Dept = D;
		this.PriseCharge = PC;
		this.TarifHoraireJ = THJ;
		this.TarifHoraireNWE = THN;
	}

//MÃ©thodes



}



