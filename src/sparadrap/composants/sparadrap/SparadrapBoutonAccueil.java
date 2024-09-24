package sparadrap.composants.sparadrap;
import sparadrap.composants.designers.Designer;
import sparadrap.composants.enums.PAGES;
import sparadrap.mvc.vues.pages.ManagerDesPages;
import javax.swing.*;
import java.awt.*;
import static sparadrap.mvc.modeles.ModelePrincipal.*;
/**
 * [SparadrapBoutonAccueil] - class
 * @author Mathaus
 */
public class SparadrapBoutonAccueil extends JPanel {
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
	private final SparadrapBouton bouton = new SparadrapBouton();
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
	public SparadrapBoutonAccueil(PAGES page) {
		this.setBackground(TRANSPARENT);
		this.creerBouton(page);
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
	 * Creer et configure le bouton.
	 * @param page (PAGES)
	 */
	private void creerBouton(PAGES page) {
		if (page != null) {
			this.bouton.setText(page.name());
			this.designerBouton(page);
			this.bouton.addActionListener(onclick -> ManagerDesPages.afficherPage(page));
		} else {
			this.bouton.setText("Unimplemented");
			JOptionPane.showMessageDialog(null, "Unimplemented yet", "TODO:", JOptionPane.INFORMATION_MESSAGE);
		}
		this.add(this.bouton);
		Designer.definirUneMiseEnPageSpring(this, this.bouton, APP_MARGES_BTN_ACCUEIL);
	}
	/**
	 * Defini la couleur du bouton.
	 * @param page (PAGES)
	 */
	private void designerBouton(PAGES page) {
		switch (page) {
			case PAGES.ACHATS:
				this.bouton.setBackground(new Color(63, 72, 204));
				break;
			case PAGES.HISTORIQUES:
				this.bouton.setBackground(new Color(0, 162, 232));
				break;
			case PAGES.CLIENTS:
				this.bouton.setBackground(new Color(153, 217, 234));
				break;
			case PAGES.MEDECINS:
				this.bouton.setBackground(new Color(112, 146, 190));
				break;
			default:
				this.bouton.setBackground(APP_COULEUR_PRINCIPALE);
				break;
		}
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