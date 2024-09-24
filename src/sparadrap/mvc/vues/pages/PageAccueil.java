package sparadrap.mvc.vues.pages;
import sparadrap.composants.sparadrap.SparadrapPage;
/**
 * [PageAccueil] - class
 * @author Mathaus
 */
public class PageAccueil extends SparadrapPage {
	//<editor-fold defaultstate="expanded" desc="STATIC">
	//START________________________________________________[static]___________________________________________________//
	//<editor-fold defaultstate="expanded" desc="PUBLIC">
	//<editor-fold defaultstate="expanded" desc="Proprietes PUBLIC">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Fonctions PUBLIC">
	/**
	 * Recupere l'instance unique du Singleton.
	 * @return (SparadrapPage)
	 */
	public static final SparadrapPage getInstance() {
		return SingletonPageAccueil.INSTANCE;
	}
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
	// <editor-fold defaultstate="expanded" desc="SINGLETON">
	/**
	 * Classe porteuse du Singleton.
	 */
	private static final class SingletonPageAccueil {
		private static final PageAccueil INSTANCE = new PageAccueil();
	}
	// </editor-fold>
	// <editor-fold defaultstate="expanded" desc="CONSTRUCTEURS">
	private PageAccueil() {
		if (SingletonPageAccueil.INSTANCE != null) {
			throw new IllegalStateException("Instance already created");
		}
		//todo: designer Page.
		this.setVisible(true);
	}
	// </editor-fold>
	//<editor-fold defaultstate="expanded" desc="PUBLIC">
	//<editor-fold defaultstate="expanded" desc="Attributs PUBLIC">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PUBLIC">
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PRIVATE">
	//<editor-fold defaultstate="expanded" desc="Attributs PRIVATE">
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