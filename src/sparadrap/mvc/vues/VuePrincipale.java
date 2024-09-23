package sparadrap.mvc.vues;
import sparadrap.composants.designers.Designer;
import javax.swing.*;
import java.awt.*;
import static sparadrap.mvc.modeles.ModelePrincipal.*;
/**
 * [VuePrincipale] - class
 * @author Mathaus
 */
public class VuePrincipale {
	//<editor-fold defaultstate="collapsed" desc="STATIC">
	//START________________________________________________[static]___________________________________________________//
	//<editor-fold defaultstate="collapsed" desc="PUBLIC">
    //<editor-fold defaultstate="collapsed" desc="Proprietes PUBLIC">
    //</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="Fonctions PUBLIC">
	/**
	 * Creer et affiche la fenetre principale.
	 */
	public static final void afficher() {
		SwingUtilities.invokeLater(() -> {
			afficherFenetrePrincipale();
		});
	}
    //</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="PRIVATE">
    //<editor-fold defaultstate="collapsed" desc="Proprietes PRIVATE">
	private static final JFrame fenetrePrincipale = new JFrame(APP_TITRE + " - " + APP_VERSION);
	private static final JLayeredPane calquePrincipal = fenetrePrincipale.getLayeredPane();
	private static JPanel panneauParent = null;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Fonctions PRIVATE">
	/**
	 * Affiche la fenetre principale.
	 */
	private static void afficherFenetrePrincipale() {
		configurerPanneauParent();
		fenetrePrincipale.pack();
		fenetrePrincipale.setVisible(true);
	}
	/**
	 * Configure la JFrame, puis creer les composants avec les donnees du ModelePrincipal.
	 */
	private static void configurerPanneauParent() {
		Dimension frameSize = new Dimension(APP_MIN_WIDTH, APP_MIN_HEIGHT);
		fenetrePrincipale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetrePrincipale.setSize(frameSize);
		fenetrePrincipale.setMinimumSize(frameSize);
		fenetrePrincipale.setLocationRelativeTo(null);
		creerPanneauParent();
		creerArrierePlan();
	}
	/**
	 * Creation du JPanel panneauParent.
	 * Ajoute panneauParent au contentPane de la JFrame et au layer par defaut.
	 */
	private static void creerPanneauParent() {
		panneauParent = new JPanel();
		fenetrePrincipale.setContentPane(panneauParent);
		calquePrincipal.setLayer(panneauParent, JLayeredPane.DEFAULT_LAYER);
		Designer.definirUneMiseEnPageSpring(calquePrincipal, panneauParent, APP_MARGES);
	}
	/**
	 * Creation du JPanel definissant l'arriere-plan noir.
	 */
	private static void creerArrierePlan() {
		JPanel arrierePlan = new JPanel();
		arrierePlan.setBackground(Color.BLACK);
		calquePrincipal.add(arrierePlan);
		calquePrincipal.setLayer(arrierePlan, Integer.MIN_VALUE);
		Designer.definirUneMiseEnPageSpring(calquePrincipal, arrierePlan, null);
	}
    //</editor-fold>
	//</editor-fold>
    //END//////////////////////////////////////////////////[static]/////////////////////////////////////////////////////
	//</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="INSTANCE">
    //START_______________________________________________[instance]__________________________________________________//
    // <editor-fold defaultstate="collapsed" desc="CONSTRUCTEURS">
	private VuePrincipale() {}
    // </editor-fold>
	//<editor-fold defaultstate="collapsed" desc="PUBLIC">
    //<editor-fold defaultstate="collapsed" desc="Attributs PUBLIC">
    //</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="Methodes PUBLIC">
    //</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="PRIVATE">
    //<editor-fold defaultstate="collapsed" desc="Attributs PRIVATE">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Methodes PRIVATE">
    //</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="ENCAPSULATION">
    //<editor-fold defaultstate="collapsed" desc="Getters">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    //</editor-fold>
	//</editor-fold>
    //END/////////////////////////////////////////////////[instance]////////////////////////////////////////////////////
	//</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="OVERRIDE">
	//START_______________________________________________[override]__________________________________________________//
	//END/////////////////////////////////////////////////[override]////////////////////////////////////////////////////
	//</editor-fold>
}