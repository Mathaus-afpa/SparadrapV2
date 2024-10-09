package sparadrap.mvc.vues.pages;
import sparadrap.composants.Util;
import sparadrap.composants.designers.Designer;
import sparadrap.composants.sparadrap.*;
import sparadrap.data.DataSource;
import sparadrap.mvc.modeles.metiers.Medecin;
import sparadrap.mvc.vues.metiers.VueMedecin;
import javax.swing.*;
import java.awt.*;
import static sparadrap.mvc.modeles.ModelePrincipal.*;
/**
 * [PageMedecin] - class
 * @author Mathaus
 */
public class PageMedecins extends SparadrapPage {
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
	public static SparadrapPage getInstance() {
		return SingletonPageMedecins.INSTANCE;
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
	private static final class SingletonPageMedecins {
		private static final PageMedecins INSTANCE = new PageMedecins();
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="CONSTRUCTEURS">
	private PageMedecins() {
		if (SingletonPageMedecins.INSTANCE != null) {
			throw new IllegalStateException("Instance already created");
		}
		this.designerPageMedecins();
		this.configurerBoutons();
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
	private final SparadrapPanneauCliquable boutonSupprimer = Util.ajouterPanneauSupprimer();
	private final JButton boutonModifier = new SparadrapBouton();
	private final JButton boutonAjouter = new SparadrapBouton();
	private final VueMedecin vue = new VueMedecin(false);
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PRIVATE">
	/**
	 * Ajoute les differents panneaux et leur design.
	 */
	private void designerPageMedecins() {
		this.setPanneauNord(new SparadrapPanneau(), BANDEAU_HAUT_TAILLE);
		this.setPanneauCentre(new SparadrapPanneau());
		this.designerPanneauCentre();
		this.setPanneauSud(new SparadrapPanneau(), BANDEAU_BAS_TAILLE);
		this.designerPanneauSud();
	}
	/**
	 * Ajoute les elements du panneau centre.
	 */
	private void designerPanneauCentre() {
		SparadrapPanneau centre = this.getPanneauCentre();
		centre.add(vue);
		Designer.definirUneMiseEnPageSpring(centre, vue, new int[] {0,120,0,40});
	}
	/**
	 * Ajoute les elements du panneau sud.
	 */
	private void designerPanneauSud() {
		SparadrapPanneau sud = this.getPanneauSud();
		sud.setLayout(new BoxLayout(sud, BoxLayout.X_AXIS));
		sud.add(Util.ajouterPanneauAccueil());
		sud.add(this.boutonSupprimer);
		sud.add(this.creerPanneauModifierEtAjouter());
	}
	/**
	 * Creer le panneau des boutons modifier et ajouter.
	 * @return (SparadrapPanneau)
	 */
	private SparadrapPanneau creerPanneauModifierEtAjouter() {
		SparadrapPanneau colonne = new SparadrapPanneau();
		Dimension dimensionColonne = new Dimension(280, BANDEAU_BAS_TAILLE);
		colonne.setMinimumSize(dimensionColonne);
		colonne.setPreferredSize(dimensionColonne);
		colonne.setMaximumSize(dimensionColonne);
		colonne.add(this.boutonModifier);
		colonne.add(this.boutonAjouter);
		this.designerBoutonModifier();
		this.designerBoutonAjouter();
		return colonne;
	}
	/**
	 * Personnalise le bouton modifier.
	 */
	private void designerBoutonModifier() {
		this.boutonModifier.setText("Modifier");
		this.boutonModifier.setFont(BTN_TEXT_FONT);
		this.boutonModifier.setBorder(BORDURE_TAILLE_3);
		this.boutonModifier.setBackground(APP_COULEUR_PRINCIPALE);
		Dimension dimensionColonne = new Dimension(200, 52);
		this.boutonModifier.setMinimumSize(dimensionColonne);
		this.boutonModifier.setPreferredSize(dimensionColonne);
		this.boutonModifier.setMaximumSize(dimensionColonne);
	}
	/**
	 * Personnalise le bouton ajouter.
	 */
	private void designerBoutonAjouter() {
		this.boutonAjouter.setText("+");
		this.boutonAjouter.setFont(BTN_TEXT_FONT);
		this.boutonAjouter.setBorder(BORDURE_TAILLE_3);
		this.boutonAjouter.setBackground(APP_COULEUR_PRINCIPALE);
		Dimension dimensionColonne = new Dimension(52, 52);
		this.boutonAjouter.setMinimumSize(dimensionColonne);
		this.boutonAjouter.setPreferredSize(dimensionColonne);
		this.boutonAjouter.setMaximumSize(dimensionColonne);
	}
	/**
	 * Configure les actions onclick des boutons.
	 */
	private void configurerBoutons() {
		this.configurerBoutonSupprimer();
		this.configurerBoutonModifier();
		this.configurerBoutonAjouter();
	}
	/**
	 * Configure l'action onclick du bouton supprimer.
	 */
	private void configurerBoutonSupprimer() {
		this.boutonSupprimer.setOnClickListener(onclick -> {
			Medecin medecin = vue.getMedecin();
			if (medecin == null) {
				SparadrapVue.afficherAucuneSelection();
			} else {
				DataSource.MEDECINS.remove(medecin);
				if (DataSource.MEDECINS.isEmpty()) vue.setMedecin(null);
				else {
					vue.setMedecin(DataSource.MEDECINS.getFirst());
				}
			}
		});
	}
	/**
	 * Configure l'action onclick du bouton modifier.
	 */
	private void configurerBoutonModifier() {
		this.boutonModifier.addActionListener(onclick -> {
			Medecin medecin = vue.getMedecin();
			if (medecin == null) {
				SparadrapVue.afficherAucuneSelection();
			} else {
				vue.setEdition();
			}
		});
	}
	/**
	 * Configure l'action onclick du bouton ajouter.
	 */
	private void configurerBoutonAjouter() {
		this.boutonAjouter.addActionListener(onclick -> {
			//todo: do something;
		});
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