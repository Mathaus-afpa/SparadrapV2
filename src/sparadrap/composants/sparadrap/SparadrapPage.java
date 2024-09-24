package sparadrap.composants.sparadrap;
import sparadrap.mvc.modeles.ModelePrincipal;
import sparadrap.mvc.vues.VuePrincipale;
import java.awt.*;
/**
 * [SparadrapPage] - class
 * @author Mathaus
 */
public class SparadrapPage extends SparadrapPanneau {
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
	// <editor-fold defaultstate="expanded" desc="SINGLETON">
	// </editor-fold>
	// <editor-fold defaultstate="expanded" desc="CONSTRUCTEURS">
	public SparadrapPage() {
		VuePrincipale.ajouterAuPanneauParent(this);
		this.setLayout(new BorderLayout());
		this.setVisible(false);
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
	private SparadrapPanneau panneauNord = null;
	private SparadrapPanneau panneauCentre = null;
	private SparadrapPanneau panneauSud = null;
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PRIVATE">
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="ENCAPSULATION">
	//<editor-fold defaultstate="expanded" desc="Getters">
	/**
	 * Getter
	 * @return (SparadrapPanneau)
	 */
	public final SparadrapPanneau getPanneauNord() {
		return this.panneauNord;
	}
	/**
	 * Getter
	 * @return (SparadrapPanneau)
	 */
	public final SparadrapPanneau getPanneauCentre() {
		return this.panneauCentre;
	}
	/**
	 * Getter
	 * @return (SparadrapPanneau)
	 */
	public final SparadrapPanneau getPanneauSud() {
		return this.panneauSud;
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Setters">
	/**
	 * Setter
	 * @param panneauNord
	 * @param hauteur
	 */
	public final void setPanneauNord(SparadrapPanneau panneauNord, int hauteur) {
		Dimension dimensionPanneauNord = new Dimension(ModelePrincipal.APP_MIN_WIDTH, hauteur);
		panneauNord.setMinimumSize(dimensionPanneauNord);
		panneauNord.setPreferredSize(dimensionPanneauNord);
		panneauNord.setMaximumSize(dimensionPanneauNord);
		this.panneauNord = panneauNord;
		this.add(panneauNord, BorderLayout.NORTH);
	}
	/**
	 * Setter
	 * @param panneauCentre
	 */
	public final void setPanneauCentre(SparadrapPanneau panneauCentre) {
		this.panneauCentre = panneauCentre;
		this.add(panneauCentre, BorderLayout.CENTER);
	}
	/**
	 * Setter
	 * @param panneauSud
	 * @param hauteur
	 */
	public final void setPanneauSud(SparadrapPanneau panneauSud, int hauteur) {
		Dimension dimensionPanneauSud = new Dimension(ModelePrincipal.APP_MIN_WIDTH, hauteur);
		panneauSud.setMinimumSize(dimensionPanneauSud);
		panneauSud.setPreferredSize(dimensionPanneauSud);
		panneauSud.setMaximumSize(dimensionPanneauSud);
		this.panneauSud = panneauSud;
		this.add(panneauSud, BorderLayout.SOUTH);
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