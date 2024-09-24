package sparadrap.mvc.vues.pages;
import sparadrap.composants.enums.PAGES;
import sparadrap.composants.sparadrap.SparadrapPage;
import java.util.HashMap;
import java.util.Map;
/**
 * [ManagerDesPages] - class
 * @author Mathaus
 */
public class ManagerDesPages {
	//<editor-fold defaultstate="expanded" desc="STATIC">
	//START________________________________________________[static]___________________________________________________//
	//<editor-fold defaultstate="expanded" desc="PUBLIC">
	//<editor-fold defaultstate="expanded" desc="Proprietes PUBLIC">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Fonctions PUBLIC">
	/**
	 * Recupere l'instance unique du Singleton.
	 * @return (ManagerDesPages)
	 */
	public static final ManagerDesPages getInstance() {
		return ManagerDesPages.SingletonManagerDesPages.INSTANCE;
	}
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PRIVATE">
	//<editor-fold defaultstate="expanded" desc="Proprietes PRIVATE">
	private static final Map<PAGES, SparadrapPage> pages = new HashMap<>();
	static {
		// definition de la Map
		pages.put(PAGES.ACCUEIL, PageAccueil.getInstance());
		pages.put(PAGES.ACHATS, PageAchats.getInstance());
		pages.put(PAGES.CLIENTS, PageClients.getInstance());
		pages.put(PAGES.HISTORIQUES, PageHistoriques.getInstance());
		pages.put(PAGES.MEDECINS, PageMedecins.getInstance());
	}
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
	private static final class SingletonManagerDesPages {
		private static final ManagerDesPages INSTANCE = new ManagerDesPages();
	}
	// </editor-fold>
	// <editor-fold defaultstate="expanded" desc="CONSTRUCTEURS">
	private ManagerDesPages() {
		if (ManagerDesPages.SingletonManagerDesPages.INSTANCE != null) {
			throw new IllegalStateException("Instance already created");
		}
	}
	// </editor-fold>
	//<editor-fold defaultstate="expanded" desc="PUBLIC">
	//<editor-fold defaultstate="expanded" desc="Attributs PUBLIC">
	private SparadrapPage pageCourante = pages.get(PAGES.ACCUEIL);
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PUBLIC">
	/**
	 * Affiche la page choisie en parametre.
	 * @param page
	 */
	public final void afficherPage(PAGES page) {
		this.pageCourante.setVisible(false);
		this.pageCourante = this.pages.get(page);
		this.pageCourante.setVisible(true);
	}
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