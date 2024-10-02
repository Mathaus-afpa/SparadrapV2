package sparadrap.mvc.vues.metiers;
import sparadrap.composants.sparadrap.SparadrapVue;
import sparadrap.mvc.modeles.metiers.Medecin;
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
		this.ajouterChampTexte("Numéro d'Agrément","^\\d{9}$");
		this.ajouterBouton("Spécialités");
		this.creerVue();
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PRIVATE">
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="ENCAPSULATION">
	//<editor-fold defaultstate="expanded" desc="Getters">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Setters">
	//</editor-fold>
	//</editor-fold>
	//END/////////////////////////////////////////////////[instance]////////////////////////////////////////////////////
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="OVERRIDE">
	//START_______________________________________________[override]__________________________________________________//
	//END/////////////////////////////////////////////////[override]////////////////////////////////////////////////////
	//</editor-fold>
}