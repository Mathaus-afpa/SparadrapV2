package sparadrap.mvc.vues.pages;
import sparadrap.composants.enums.PAGES;
import sparadrap.composants.sparadrap.SparadrapBoutonAccueil;
import sparadrap.composants.sparadrap.SparadrapPage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import static sparadrap.mvc.modeles.ModelePrincipal.*;
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
		creerPanneauGauche();
		creerPanneauDroit();
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.setVisible(true); // redondant!
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
	/**
	 * Creer le panneau de gauche avec le logo en fond.
	 */
	private void creerPanneauGauche() {
		JPanel panneauGauche = new JPanel() {
			private BufferedImage backgroundImage;
			{
				try {
					backgroundImage = ImageIO.read(getClass().getResource("/sparadrap/ressources/AccueilBG.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// Surcharger la méthode paintComponent pour dessiner l'image de fond.
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				if (backgroundImage != null) {
					int width = getWidth();
					int height = getHeight();
					g.drawImage(backgroundImage, 0, 0, width, height, this);
				}
			}
		};
		// Fixer taille et couleur du panel en rapport a l'image.
		Dimension dimensionImage = new Dimension(APP_BG_WIDTH, APP_BG_HEIGHT);
		panneauGauche.setMinimumSize(dimensionImage);
		panneauGauche.setPreferredSize(dimensionImage);
		panneauGauche.setMaximumSize(dimensionImage);
		this.setBackground(APP_BG_COULEUR); // Couleur du fond de l'image.
		this.add(panneauGauche);
	}
	/***
	 * Creer le panneau de droite avec les boutons.
	 */
	private void creerPanneauDroit() {
		JPanel panneauDroit = new JPanel();
		panneauDroit.setBackground(Color.BLACK); // Permet d'ajuster le pixel de la bordure.
		panneauDroit.setLayout(new BoxLayout(panneauDroit, BoxLayout.Y_AXIS));
		panneauDroit.add(new SparadrapBoutonAccueil(PAGES.ACHATS));
		panneauDroit.add(new SparadrapBoutonAccueil(PAGES.HISTORIQUES));
		panneauDroit.add(new SparadrapBoutonAccueil(PAGES.CLIENTS));
		panneauDroit.add(new SparadrapBoutonAccueil(PAGES.MEDECINS));
		this.add(panneauDroit);
	}
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