package sparadrap.mvc.modeles.metiers;
/**
 * [Entite] - class
 * @author Mathaus
 */
public abstract class Entite {
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
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PUBLIC">
	//<editor-fold defaultstate="expanded" desc="Attributs PUBLIC">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PUBLIC">
	/**
	 * Permet de definir les informations d'une Entite.
	 * @param nom (String)
	 * @param adresse (String)
	 * @param telephone (String)
	 * @param email (String)
	 * @param codePostal (String)
	 */
	public void completerIdentite(String nom, String adresse, String telephone, String email, String codePostal) {
		this.setNom(nom);
		this.setAdresse(adresse);
		this.setTelephone(telephone);
		this.setEmail(email);
		this.setCodePostal(codePostal);
	}
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PRIVATE">
	//<editor-fold defaultstate="expanded" desc="Attributs PRIVATE">
	protected String nom;
	private String adresse;
	private String telephone;
	private String email;
	private String codePostal;
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PRIVATE">
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="ENCAPSULATION">
	//<editor-fold defaultstate="expanded" desc="Getters">
	/**
	 * Getter
	 * @return (String)
	 */
	public final String getNom() {
		return this.nom;
	}
	/**
	 * Getter
	 * @return (String)
	 */
	public final String getAdresse() {
		return this.adresse;
	}
	/**
	 * Getter
	 * @return (String)
	 */
	public final String getTelephone() {
		return this.telephone;
	}
	/**
	 * Getter
	 * @return (String)
	 */
	public final String getEmail() {
		return this.email;
	}
	/**
	 * Getter
	 * @return (String)
	 */
	public final String getCodePostal() {
		return this.codePostal;
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Setters">
	/**
	 * Setter
	 * @param nom (String)
	 */
	public abstract void setNom(String nom);
	/**
	 * Setter
	 * @param adresse (String)
	 */
	public final void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * Setter
	 * @param telephone (String)
	 */
	public final void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * Setter
	 * @param email (String)
	 */
	public final void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Setter
	 * @param codePostal (String)
	 */
	public final void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
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