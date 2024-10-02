package sparadrap.composants;
import sparadrap.composants.designers.Designer;
import sparadrap.composants.enums.PAGES;
import sparadrap.mvc.vues.pages.ManagerDesPages;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;
/**
 * [Util] - class
 * @author Mathaus
 */
public class Util {
	//<editor-fold defaultstate="expanded" desc="STATIC">
	//START________________________________________________[static]___________________________________________________//
	//<editor-fold defaultstate="expanded" desc="PUBLIC">
	//<editor-fold defaultstate="expanded" desc="Proprietes PUBLIC">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Fonctions PUBLIC">
	/**
	 * Creer le panneau du bouton d'accueil.
	 * @return (JPanel)
	 */
	public static JPanel ajouterPanneauAccueil() {
		JPanel colonneBoutonAccueil = new JPanel();
		JButton boutonAccueil = new JButton(ICON_ACCUEIL);
		Dimension imageDimension = new Dimension(BTN_ACCUEIL_WIDTH, BTN_ACCUEIL_HEIGHT);
		boutonAccueil.setMinimumSize(imageDimension);
		boutonAccueil.setPreferredSize(imageDimension);
		boutonAccueil.setMaximumSize(imageDimension);
		boutonAccueil.setBorder(null);
		colonneBoutonAccueil.setMinimumSize(imageDimension);
		colonneBoutonAccueil.setPreferredSize(imageDimension);
		colonneBoutonAccueil.setMaximumSize(imageDimension);
		colonneBoutonAccueil.add(boutonAccueil);
		Designer.definirUneMiseEnPageSpring(colonneBoutonAccueil, boutonAccueil, null);
		boutonAccueil.addActionListener(onclick -> ManagerDesPages.afficherPage(PAGES.ACCUEIL));
		return colonneBoutonAccueil;
	}
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PRIVATE">
	//<editor-fold defaultstate="expanded" desc="Proprietes PRIVATE">
	private static final ImageIcon ICON_ACCUEIL = creerIconePourBoutonAccueil();
	private final static int BTN_ACCUEIL_WIDTH = 200;
	private final static int BTN_ACCUEIL_HEIGHT = 64;
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Fonctions PRIVATE">
	/**
	 * Recreer l'image du bouton accueil dans une taille coherente.
	 * @return (ImageIcon)
	 */
	private static ImageIcon creerIconePourBoutonAccueil() {
		ImageIcon iconeDepuisImage = new ImageIcon(Objects.requireNonNull(Util.class.getResource("/sparadrap/ressources/AccueilBouton.png")));
		Image imageTailleReelle = iconeDepuisImage.getImage();
		Image fixerDimensionsImage = imageTailleReelle.getScaledInstance(BTN_ACCUEIL_WIDTH, BTN_ACCUEIL_HEIGHT, Image.SCALE_SMOOTH);
		return new ImageIcon(fixerDimensionsImage);
	}
	//</editor-fold>
	//</editor-fold>
	//END//////////////////////////////////////////////////[static]/////////////////////////////////////////////////////
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="INSTANCE">
	//START_______________________________________________[instance]__________________________________________________//
	//<editor-fold defaultstate="expanded" desc="SINGLETON">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="CONSTRUCTEURS">
	private Util() {}
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