package sparadrap.composants.sparadrap;
import javax.swing.*;
import java.awt.*;
import static sparadrap.mvc.modeles.ModelePrincipal.BORDURE_TAILLE_4;
import static sparadrap.mvc.modeles.ModelePrincipal.BTN_ACCUEIL_FONT;
/**
 * [SparadrapBouton] - class
 * @author Mathaus
 */
public class SparadrapBouton extends JButton {
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
	public SparadrapBouton() {
		super();
		this.setText(null); // On redessine le texte, cela evite donc le doublon.
		designerBouton();
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
	private String texte;
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PRIVATE">
	private void designerBouton() {
		this.setFocusPainted(false);
		this.setFont(BTN_ACCUEIL_FONT);
		this.setBorder(BORDURE_TAILLE_4);
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
	@Override
	public final void setText(String texte) {
		if (texte != null) {
			this.texte = texte.toUpperCase();
			revalidate();
			repaint();
		}
	}
	@Override
	protected final void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		// Active l'anti-aliasing pour un meilleur rendu du texte
		g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		// Définir la couleur du texte
		g2d.setColor(getForeground());
		// Récupérer les informations de la police et de la taille du texte
		FontMetrics fm = g2d.getFontMetrics();
		if (this.texte != null && !this.texte.isEmpty()) {
			int textWidth = fm.stringWidth(texte);
			int textHeight = fm.getAscent();  // Utilise l'ascent pour une meilleure position verticale
			// Calculer la position pour centrer le texte verticalement et horizontalement
			int x = (getWidth() - textWidth) / 2;
			int y = (getHeight() + textHeight) / 2 - 4;  // Ajuste cette valeur pour descendre ou monter le texte
			// Dessiner le texte à la position calculée
			g2d.drawString(texte, x, y);
		}
	}
	//END/////////////////////////////////////////////////[override]////////////////////////////////////////////////////
	//</editor-fold>
}