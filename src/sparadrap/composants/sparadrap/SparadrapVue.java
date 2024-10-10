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
	/**
	 * Affiche un popup indicant l'absence de donnees dans la vue.
	 */
	public static void afficherAucuneSelection() {
		JOptionPane.showMessageDialog(null, "Aucune sélection", "Information", JOptionPane.INFORMATION_MESSAGE);
	}
	/**
	 * Affiche un popup indicant l'absence de donnees dans la vue.
	 */
	public static void afficherErreurFormulaire() {
		JOptionPane.showMessageDialog(null, "Le Formulaire contient des erreurs", "Information", JOptionPane.INFORMATION_MESSAGE);
	}
	/**
	 * Affiche un popup demandant de reinitialiser le formulaire.
	 */
	public static boolean demanderReinitialiserFormulaire() {
		int reponse = JOptionPane.showConfirmDialog(null, "Voulez-vous réinitialiser les valeurs ?", "Information", JOptionPane.YES_NO_OPTION);
		return reponse == JOptionPane.YES_OPTION;
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
	 * Reinitialise les champs texte.
	 */
	public final void reinitialiserChampsTexte() {
		for (Map.Entry<String, SparadrapChampTexte> entry : this.champsTexte.entrySet()) {
			SparadrapChampTexte value = entry.getValue();
			value.reinitialiserChampTexte();
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
		this.gbc.insets = new Insets(5, 15, 5, 5);
		this.gbc.anchor = GridBagConstraints.CENTER;
		this.gbc.fill = GridBagConstraints.HORIZONTAL;
		this.gbc.weightx = 1;
		this.gbc.weighty = 1;
	}
	/**
	 * Ajoute un nouveau champ texte dans la liste des champs de la vue.
	 * @param label (String)
	 * @param regex (String)
	 */
	protected final void ajouterChampTexte(String label, String regex) {
		SparadrapChampTexte ct = new SparadrapChampTexte(regex);
		if (!this.estFormulaireVide) ct.setText("- aucune selection -");
		this.champsTexte.put(label, ct);
	}
	/**
	 * Ajoute un nouveau bouton dans la liste des boutons de la vue.
	 * @param label (String)
	 */
	protected final void ajouterBouton(String label) {
		JButton bouton = new JButton("voir");
		this.boutons.put(label, bouton);
	}
	/**
	 * Recupere les champts textes et les boutons pour les afficher dans la grille.
	 */
	protected final void creerVue() {
		int ligne = 0;
		for (Map.Entry<String, SparadrapChampTexte> entry : this.champsTexte.entrySet()) {
			this.gbc.gridx = 0;  // Colonne 1
			this.gbc.gridy = ligne;  // Ligne correspondante
			this.add(this.creerLabelTexte(entry.getKey()), this.gbc);
			this.gbc.gridx = 1;  // Colonne 2
			SparadrapChampTexte ct = entry.getValue();
			if (this.estFormulaireVide) ct.setModifiable(true);
			this.add(ct, this.gbc);
			ligne++;
		}
		for (Map.Entry<String, JButton> entry : boutons.entrySet()) {
			this.gbc.gridx = 0;  // Colonne 1
			this.gbc.gridy = ligne;  // Ligne correspondante
			this.add(this.creerLabelTexte(entry.getKey()), this.gbc);
			this.gbc.gridx = 1;  // Colonne 2
			this.add(entry.getValue(), this.gbc);
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
	/**
	 * Rend les champs texte de la vue editable.
	 */
	public final void setEdition() {
		for (Map.Entry<String, SparadrapChampTexte> entry : this.champsTexte.entrySet()) {
			SparadrapChampTexte value = entry.getValue();
			value.setModifiable(true);
		}
	}
	/**
	 * Sauvegarde ou ne fait rien en cas d'erreur de saisie.
	 * @return (boolean)
	 */
	@SuppressWarnings("ConstantConditions")
	public final boolean saveEdition() {
		for (Map.Entry<String, SparadrapChampTexte> entry : this.champsTexte.entrySet()) {
			SparadrapChampTexte value = entry.getValue();
			if (value.getEtat() == MISESAJOUR.INVALIDE || value.getEtat() == MISESAJOUR.VIDE) {
				return false;
			}
		}
		for (Map.Entry<String, SparadrapChampTexte> entry : this.champsTexte.entrySet()) {
			SparadrapChampTexte value = entry.getValue();
			value.setModifiable(false);
		}
		return true;
	}
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="ENCAPSULATION">
	//<editor-fold defaultstate="expanded" desc="Getters">
	/**
	 * Getter
	 * @return (Map<String, SparadrapChampTexte>)
	 */
	public final Map<String, SparadrapChampTexte> getChampsTexte() {
		return this.champsTexte;
	}
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