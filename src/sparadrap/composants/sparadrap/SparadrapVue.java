package sparadrap.composants.sparadrap;
import sparadrap.composants.enums.MISESAJOUR;
import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;
import static sparadrap.mvc.modeles.ModelePrincipal.*;
/**
 * [SparadrapVue] - class
 * @author Mathaus
 */
public class SparadrapVue extends SparadrapPanneau {
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
	protected SparadrapVue(boolean estFormulaireVide) {
		this.estFormulaireVide = estFormulaireVide;
		this.configureGrille();
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PUBLIC">
	//<editor-fold defaultstate="expanded" desc="Attributs PUBLIC">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PUBLIC">
	/**
	 * Retourne faux si ne serait ce qu'un seul champ texte n'est pas complete et valide.
	 * Sinon retourne vrai.
	 * @return (boolean)
	 */
	public final boolean peutSeFermer() {
		boolean possedeUneErreur = champsTexte.values().stream()
				.anyMatch(ct -> ct.getEtat() == MISESAJOUR.INVALIDE || ct.getEtat() == MISESAJOUR.VIDE);
		if (possedeUneErreur) {
			String titre = "Confirmation";
			String message = "Voulez-vous continuer ?";
			int choix = JOptionPane.showConfirmDialog(null, message, titre, JOptionPane.YES_NO_OPTION);
			return choix == JOptionPane.YES_OPTION;
		} else {
			return true;
		}
	}
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PRIVATE">
	//<editor-fold defaultstate="expanded" desc="Attributs PRIVATE">
	private final Map<String, SparadrapChampTexte> champsTexte = new LinkedHashMap<>();
	private final Map<String, JButton> boutons = new LinkedHashMap<>();
	private boolean estFormulaireVide;
	private final GridBagConstraints gbc = new GridBagConstraints();
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PRIVATE">
	/**
	 * Configure la vue sous forme de grille.
	 */
	private void configureGrille() {
		this.setLayout(new GridBagLayout());
		this.setBorder(BORDURE_TAILLE_2);
		gbc.insets = new Insets(5, 15, 5, 5);
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1;
		gbc.weighty = 1;
	}
	/**
	 * Ajoute un nouveau champ texte dans la liste des champs de la vue.
	 * @param label (String)
	 * @param regex (String)
	 */
	protected final void ajouterChampTexte(String label, String regex) {
		SparadrapChampTexte ct = new SparadrapChampTexte(regex);
		if (!this.estFormulaireVide) ct.setText("- aucune selection -");
		champsTexte.put(label, ct);
	}
	/**
	 * Ajoute un nouveau bouton dans la liste des boutons de la vue.
	 * @param label (String)
	 */
	protected final void ajouterBouton(String label) {
		JButton bouton = new JButton("voir");
		boutons.put(label, bouton);
	}
	/**
	 * Recupere les champts textes et les boutons pour les afficher dans la grille.
	 */
	protected final void creerVue() {
		int ligne = 0;
		for (Map.Entry<String, SparadrapChampTexte> entry : champsTexte.entrySet()) {
			gbc.gridx = 0;  // Colonne 1
			gbc.gridy = ligne;  // Ligne correspondante
			this.add(this.creerLabelTexte(entry.getKey()), gbc);
			gbc.gridx = 1;  // Colonne 2
			SparadrapChampTexte ct = entry.getValue();
			if (this.estFormulaireVide) ct.setModifiable(true);
			this.add(ct, gbc);
			ligne++;
		}
		for (Map.Entry<String, JButton> entry : boutons.entrySet()) {
			gbc.gridx = 0;  // Colonne 1
			gbc.gridy = ligne;  // Ligne correspondante
			this.add(this.creerLabelTexte(entry.getKey()), gbc);
			gbc.gridx = 1;  // Colonne 2
			this.add(entry.getValue(), gbc);
			ligne++;
		}
	}
	/**
	 * Creer un label.
	 * @param texte (String)
	 * @return (JLabel)
	 */
	private JLabel creerLabelTexte(String texte) {
		JLabel label = new JLabel(texte);
		label.setFont(LABEL_TEXT_FONT);
		return label;
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