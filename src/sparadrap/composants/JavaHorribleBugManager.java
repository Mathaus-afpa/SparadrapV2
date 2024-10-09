package sparadrap.composants;
import sparadrap.mvc.vues.VuePrincipale;
import java.awt.event.*;
/**
 * [JavaHorribleBugManager] - class
 * @author Mathaus
 */
public class JavaHorribleBugManager {
	//<editor-fold defaultstate="expanded" desc="STATIC">
	//START________________________________________________[static]___________________________________________________//
	//<editor-fold defaultstate="expanded" desc="PUBLIC">
    //<editor-fold defaultstate="expanded" desc="Proprietes PUBLIC">
    //</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Fonctions PUBLIC">
	/**
	 * CORRIGE L'HORRIBLE BUG QUI EMPECHE LES ACTIONS SUR LA JSCROLLPANE VOLLANTE.
	 * @param correctif (Runnable)
	 */
	public static void FixeMoiCeBug(Runnable  correctif) {
		VuePrincipale.getFenetrePrincipale().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				correctif.run();
			}
		});
		VuePrincipale.getFenetrePrincipale().addWindowFocusListener(new WindowFocusListener() {
			@Override
			public void windowLostFocus(WindowEvent e) {
				correctif.run();
			}
			@Override
			public void windowGainedFocus(WindowEvent e) {
				correctif.run();
			}
		});
		VuePrincipale.getFenetrePrincipale().addComponentListener(new ComponentAdapter() {
			@Override
			public void componentMoved(ComponentEvent e) {
				correctif.run();
			}
		});
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
    //<editor-fold defaultstate="expanded" desc="SINGLETON">
    //</editor-fold>
    //<editor-fold defaultstate="expanded" desc="CONSTRUCTEURS">
	private JavaHorribleBugManager() {}
    //</editor-fold>
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