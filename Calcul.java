/**
 * Calcul est la classe comprenant le calcul du remboursement, et la lecture du fichier.
 *
 * @author Romain Locquet
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;




public class Calcul
{



	public Calcul()
	{
		// TODO Auto-generated constructor stub
	}


	// Reprise des donnÃ©es du tableau pour les ajouter Ã  la liste.
	/*public static void RepriseTableau(List<AR>AR, List<AS> AS)
	{
		String ligne;
		String[] tableau;
		BufferedReader fichier = null;

		try
			{
			fichier = new BufferedReader ( new FileReader("/home/etudiant/slam4/Taxiversion4/src/Package/fichier_texte"));
			}
		catch (Exception e)
			{
				System.err.println("erreur ouverture");
			}
		try{
		while ((ligne = fichier.readLine()) != null){
			tableau = ligne.split(",");
			AR.add(new AR ( Integer.parseInt(tableau[0]),Double.parseDouble(tableau[1]), Double.parseDouble(tableau[4]),Double.parseDouble(tableau[7]),Double.parseDouble(tableau[6]),Double.parseDouble(tableau[2])));
			AS.add(new AS ( Integer.parseInt(tableau[0]),Double.parseDouble(tableau[1]), Double.parseDouble(tableau[4]),Double.parseDouble(tableau[7]),Double.parseDouble(tableau[5]),Double.parseDouble(tableau[3])));
		}
		}
		catch (Exception ex) {
			System.out.print("problÃ¨me lecture du fichier");
			}

		try {
			fichier.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

	
	/**
     * Retourne le montant du déplacement.
     *
     * @return un décimal prix, qui correspond au montant du remboursement.
     */
	public static double CalculTarifDepl(int i, Saisie saisies ,List<AR> AR , List<AS> AS) //calculer les frais
	{
		double prix = 0.0;

		if(saisies.getTypeduTrajet().equals("AS"))
		{ //Aller - Simple

            if(saisies.getJour().equals("S") && saisies.getHeure().equals("J"))
            {
                prix = (AS.get(i).getPriseCharge()) + ((saisies.getNbkm() * AS.get(i).getTarifJS()));
                if(saisies.getDureeDepl() > 60) //Et de plus d'une heure
                    prix = (int)(saisies.getDureeDepl()/60) * AS.get(i).getTarifHoraireJ();
        }
            else
            {

                prix = AS.get(i).getPriseCharge() + (saisies.getNbkm() * AS.get(i).getTarifNW());
                if(saisies.getDureeDepl() > 60)
                    prix = (int)(saisies.getDureeDepl()/60) * AS.get(i).getTarifHoraireNWE();
            }
        }
        else //if(saisies.getTypeduTrajet().equals("AR"))
        { //Aller - Retour
            if(saisies.getJour().equals("S") && saisies.getHeure().equals("J"))
            {
                prix = AR.get(i).getPriseCharge() + (saisies.getNbkm() * AR.get(i).getTarifJS());
                if(saisies.getDureeDepl() > 60)
                    prix = (int)(saisies.getDureeDepl()/60) * AR.get(i).getTarifHoraireJ();
            }
            else

            {
                prix = AR.get(i).getPriseCharge() + (saisies.getNbkm() * AR.get(i).getTarifNW());
                if(saisies.getDureeDepl() > 60)
                    prix = (int)(saisies.getDureeDepl()/60) * AR.get(i).getTarifHoraireNWE();
            }
        }

		return prix;
	}
}


