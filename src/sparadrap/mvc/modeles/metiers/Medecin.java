package sparadrap.mvc.modeles.metiers;
import sparadrap.composants.enums.metiers.SPECIALITES;
import java.util.ArrayList;
import java.util.List;
/**
 * [Medecin] - class
 * @author Mathaus
 */
public class Medecin extends Personne {
	//<editor-fold defaultstate="expanded" desc="STATIC">
	//START________________________________________________[static]___________________________________________________//
	//<editor-fold defaultstate="expanded" desc="PUBLIC">
	//<editor-fold defaultstate="expanded" desc="Proprietes PUBLIC">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Fonctions PUBLIC">
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PRIVATE">
	//<editor-fold defaultstate="expanded" desc="Proprietes PRIVATE">
	private String agreement;
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Fonctions PRIVATE">
	//</editor-fold>
	//</editor-fold>
	//END//////////////////////////////////////////////////[static]/////////////////////////////////////////////////////
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="INSTANCE">
	//START_______________________________________________[instance]__________________________________________________//
	//<editor-fold defaultstate="expanded" desc="SINGLETON">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="CONSTRUCTEURS">
	public Medecin(){}
	public Medecin(String prenom){
		this.setPrenom(prenom);
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PUBLIC">
	//<editor-fold defaultstate="expanded" desc="Attributs PUBLIC">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PUBLIC">
	/**
	 * Ajoute une specialite a la liste de specialites.
	 * @param specialite (SPECIALITES)
	 */
	public final void addSpecialite(SPECIALITES specialite){
		if (!this.specilites.contains(specialite)){
			this.specilites.add(specialite);
			if (specialite == SPECIALITES.GENERALE) isGeneraliste = true;
		}
	}
	/**
	 * Retire une specialite a la liste de specialites.
	 * @param specialite (SPECIALITES)
	 */
	public final void removeSpecialite(SPECIALITES specialite) {
		if (this.specilites.contains(specialite)){
			this.specilites.remove(specialite);
			if (specialite == SPECIALITES.GENERALE) isGeneraliste = false;
		}
	}
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PRIVATE">
	//<editor-fold defaultstate="expanded" desc="Attributs PRIVATE">
	private final List<SPECIALITES> specilites = new ArrayList<>();
	private boolean isGeneraliste = false;
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PRIVATE">
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="ENCAPSULATION">
	//<editor-fold defaultstate="expanded" desc="Getters">
	/**
	 * Getter
	 * @return (int)
	 */
	public final String getAgreement() {
		return this.agreement;
	}
	/**
	 * Getter
	 * @return (List<SPECIALITES>)
	 */
	public final List<SPECIALITES> getSpecialites() {
		return specilites;
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Setters">
	/**
	 * Setter
	 * @param agreement (int)
	 */
	public final void setAgreement(String agreement) {
		this.agreement = agreement;
	}
	//</editor-fold>
	//</editor-fold>
	//END/////////////////////////////////////////////////[instance]////////////////////////////////////////////////////
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="OVERRIDE">
	//START_______________________________________________[override]__________________________________________________//
	@Override
	public String toString() {
		return "Dr " + this.getPrenom() + " " + this.getNom();
	}
	//END/////////////////////////////////////////////////[override]////////////////////////////////////////////////////
	//</editor-fold>
}