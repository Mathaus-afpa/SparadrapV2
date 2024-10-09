package sparadrap.composants.sparadrap;
import javax.swing.*;
import java.awt.*;
/**
 * [SparadrapTexte] - class
 * @author Mathaus
 */
public class SparadrapTexte extends JLabel {
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
	//<editor-fold defaultstate="expanded" desc="SINGLETON">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="CONSTRUCTEURS">
	public SparadrapTexte() {
		super();
		this.setText(null);  // Désactive le rendu par défaut du texte
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
	private String texte = "";
	private int alignementHorizontal = 0;
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PRIVATE">
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="ENCAPSULATION">
	//<editor-fold defaultstate="expanded" desc="Getters">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Setters">
	/**
	 * Defini une marge.
	 * Si negative depuis la droite, sinon a gauche.
	 * @param alignementHorizontal (int)
	 */
	public final void setAlignementHorizontal(int alignementHorizontal) {
		this.alignementHorizontal = alignementHorizontal;
	}
	//</editor-fold>
	//</editor-fold>
	//END/////////////////////////////////////////////////[instance]////////////////////////////////////////////////////
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="OVERRIDE">
	//START_______________________________________________[override]__________________________________________________//
	@Override
	public void setText(String texte) {
		this.texte = texte;
		this.revalidate();
		this.repaint();
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2d.setColor(getForeground());
		FontMetrics fm = g2d.getFontMetrics();
		if (this.texte != null && !this.texte.isEmpty()) {
			int textWidth = fm.stringWidth(this.texte);
			int textHeight = fm.getAscent();
			int x;
			if (this.alignementHorizontal == 0) {
				x = (getWidth() - textWidth) / 2 - 15;
			} else {
				if (this.alignementHorizontal > 0) {
					x = this.alignementHorizontal;
				} else {
					x = getWidth() - textWidth + this.alignementHorizontal;
				}
			}
			int y = (getHeight() + textHeight) / 2 ;
			g2d.drawString(this.texte, x, y);
		}
	}
	//END/////////////////////////////////////////////////[override]////////////////////////////////////////////////////
	//</editor-fold>
}