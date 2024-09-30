package sparadrap.composants.sparadrap;
import sparadrap.composants.enums.MISESAJOUR;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.regex.Pattern;
import static sparadrap.mvc.modeles.ModelePrincipal.*;
/**
 * [SparadrapChampTexte] - class
 * @author Mathaus
 */
public class SparadrapChampTexte extends JTextField {
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
	public SparadrapChampTexte(String regex) {
		super();
		this.pattern = Pattern.compile(regex);
		this.designerChampTexte();
		this.ajouterListener();
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
	private MISESAJOUR etat = MISESAJOUR.AUCUNE;
	private final Pattern pattern;
	private String derniereModification = null;
	private boolean estModifiable = false;
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PRIVATE">
	/**
	 * Defini si la police du texte et rend le champ non modifiable par defaut.
	 */
	private void designerChampTexte() {
		this.setFont(CHAMP_TEXT_FONT);
		this.estNonEditable();
	}
	/**
	 * Ajoute le listener d'ecoute des modifications du champ texte.
	 */
	private void ajouterListener() {
		this.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				modifierEtat();
			}
			@Override
			public void removeUpdate(DocumentEvent e) {
				modifierEtat();
			}
			@Override
			public void changedUpdate(DocumentEvent e) {/*do nothing.*/}
		});
	}
	/**
	 * Modifie l'etat de mise a jour du champ texte.
	 */
	private void modifierEtat() {
		String texte = this.getText();
		if (texte.equals(derniereModification)) this.etat = MISESAJOUR.AUCUNE;
		else {
			if (this.pattern.matcher(texte).matches()) {
				this.etat = MISESAJOUR.VALIDE;
			} else {
				this.etat = MISESAJOUR.INVALIDE;
			}
		}
		this.designerEtat();
	}
	/**
	 * Determine la couleur du champ texte selon son etat de modification.
	 */
	private void designerEtat() {
		switch (this.etat) {
			case AUCUNE:
				this.setBackground(COULEUR_TEXTE_INCHANGE);
				break;
			case VALIDE:
				this.setBackground(COULEUR_TEXTE_VALIDE);
				break;
			case INVALIDE:
				this.setBackground(COULEUR_TEXTE_INVALIDE);
				break;
		}
	}
	/**
	 * Rend editable le champ texte.
	 * Ne concerne pas l'état mises a jour mais simplement l'etat "editable" du champ texte.
	 */
	private void estEditable() {
		this.derniereModification = this.getText();
		this.etat = MISESAJOUR.AUCUNE;
		this.setBackground(COULEUR_TEXTE_INCHANGE);
		this.setEditable(true);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setOpaque(true);
	}
	/**
	 * Rend non editable le champ texte.
	 * Ne concerne pas l'état mises a jour mais simplement l'etat "editable" du champ texte.
	 */
	private void estNonEditable() {
		this.setBackground(APP_COULEUR_PRINCIPALE);
		this.setEditable(false);
		this.setBorder(null);
		this.setOpaque(false);
	}
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="ENCAPSULATION">
	//<editor-fold defaultstate="expanded" desc="Getters">
	/**
	 * Getter
	 * @return (MISESAJOUR)
	 */
	public final MISESAJOUR getEtat() {
		return this.etat;
	}
	/**
	 * Getter
	 * @return (MISESAJOUR)
	 */
	public final boolean getModifiable() {
		return this.estModifiable;
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Setters">
	/**
	 * Setter
	 * @param ouiNon (boolean)
	 */
	public final void setModifiable(boolean ouiNon) {
		this.estModifiable = ouiNon;
		if (this.estModifiable) {
			this.estEditable();
		} else {
			this.estNonEditable();
		}
	}
	//</editor-fold>
	//</editor-fold>
	//END/////////////////////////////////////////////////[instance]////////////////////////////////////////////////////
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="OVERRIDE">
	//START_______________________________________________[override]__________________________________________________//
	@Override public final void setText(String texte) {
		super.setText(texte);
	}
	//END/////////////////////////////////////////////////[override]////////////////////////////////////////////////////
	//</editor-fold>
}