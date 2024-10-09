package sparadrap.mvc.vues.metiers;
import sparadrap.composants.sparadrap.SparadrapChampTexte;
import sparadrap.composants.sparadrap.SparadrapVue;
import sparadrap.mvc.modeles.metiers.Medecin;

import java.util.Map;

/**
 * [VueMedecin] - class
 * @author Mathaus
 */
public class VueMedecin extends SparadrapVue {
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
	private final static Medecin DEFAUT = new Medecin();
	static {
		DEFAUT.completerIdentite("- aucune selection -", "- aucune selection -",
				"- aucune selection -", "- aucune selection -", "- aucune selection -");
		DEFAUT.setPrenom("- aucune selection -");
		DEFAUT.setAgreement("- aucune selection -");
	}
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
	public VueMedecin(boolean estFormulaireVide) {
		super(estFormulaireVide);
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PUBLIC">
	//<editor-fold defaultstate="expanded" desc="Attributs PUBLIC">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PUBLIC">
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PRIVATE">
	//<editor-fold defaultstate="expanded" desc="Attributs PRIVATE">
	private Medecin medecin;
	{
		this.ajouterChampTexte("Nom", "^[A-Z][a-zA-Z-'À-ÿ]+(?: [A-Z][a-zA-Z-'À-ÿ]+)*$");
		this.ajouterChampTexte("Prenom","^[A-Z][a-zA-Z-'À-ÿ]+(?: [A-Z][a-zA-Z-'À-ÿ]+)*$");
		this.ajouterChampTexte("Adresse","^(\\d{1,5}\\s[A-Za-zÀ-ÿ0-9\\s\\-\\'\\.\\,]+[A-Za-zÀ-ÿ0-9])(\\s[0-9]{5}\\s[A-Za-zÀ-ÿ\\s\\-]+)?$");
		this.ajouterChampTexte("CodePostal","^\\d{5}$");
		this.ajouterChampTexte("Téléphone","^(?:0[1-9]|\\+33[1-9])(?:[\\s.-]?\\d{2}){4}$");
		this.ajouterChampTexte("Email","^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
		this.ajouterChampTexte("Numéro d'Agrément","^\\d{5}$");
		this.ajouterBouton("Spécialités");
		this.creerVue();
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PRIVATE">
	/**
	 * Affiche un medecin ou le medecin par defaut.
	 * @param medecin (Medecin)
	 */
	private void afficherMedecin(Medecin medecin) {
		Map<String, SparadrapChampTexte> champsTexte = getChampsTexte();
		if (medecin != null) {
			champsTexte.get("Nom").setText(medecin.getNom());
			champsTexte.get("Prenom").setText(medecin.getPrenom());
			champsTexte.get("Adresse").setText(medecin.getAdresse());
			champsTexte.get("CodePostal").setText(medecin.getCodePostal());
			champsTexte.get("Téléphone").setText(medecin.getTelephone());
			champsTexte.get("Email").setText(medecin.getEmail());
			champsTexte.get("Numéro d'Agrément").setText(medecin.getAgreement());
		} else if (VueMedecin.DEFAUT != null) {
			afficherMedecin(VueMedecin.DEFAUT);
		}
	}
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="ENCAPSULATION">
	//<editor-fold defaultstate="expanded" desc="Getters">
	/**
	 * Getter
	 * @return (Medecin)
	 */
	public final Medecin getMedecin() {
		return this.medecin;
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Setters">
	/**
	 * Setter
	 * @param medecin (Medecin)
	 */
	public final void setMedecin(Medecin medecin) {
		this.medecin = medecin;
		afficherMedecin(this.medecin);
	}
	//</editor-fold>
	//</editor-fold>
	//END/////////////////////////////////////////////////[instance]////////////////////////////////////////////////////
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="OVERRIDE">
	//START_______________________________________________[override]__________________________________________________//
	//END/////////////////////////////////////////////////[override]////////////////////////////////////////////////////
	//</editor-fold>
}