package sparadrap.composants.sparadrap;
import sparadrap.composants.JavaHorribleBugManager;
import sparadrap.composants.designers.Designer;
import sparadrap.mvc.modeles.ModelePrincipal;
import javax.swing.*;
import javax.swing.plaf.basic.ComboPopup;
import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;
/**
 * [SparadrapComboBox] - class
 * @author Mathaus
 */
public class SparadrapComboBox<E> extends JPanel {
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
	public SparadrapComboBox(List<E> items) {
		this.items = items;
		this.selectedItem = null;
		this.setLayout(new BorderLayout());
		this.add(this.bouton, BorderLayout.CENTER);
		this.designerBouton();
		this.configurerComboBox();
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PUBLIC">
	//<editor-fold defaultstate="expanded" desc="Attributs PUBLIC">
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PUBLIC">
	/**
	 * Met a jour la collection d'items.
	 * !!! VEROUILLABLE !!!
	 */
	public final void updateItems() {
		if (!this.verou) this.creerMenuCollection();
	}
	/**
	 * Permet d'ajouter un observateur.
	 * @param pcl  the PropertyChangeListener to be added
	 */
	public final void addPropertyChangeListener(PropertyChangeListener pcl) {
		this.propertyChangeSupport.addPropertyChangeListener(pcl);
	}
	/**
	 * Permet de supprimer un observateur
	 * @param pcl the PropertyChangeListener to be removed
	 *
	 */
	public final void removePropertyChangeListener(PropertyChangeListener pcl) {
		this.propertyChangeSupport.removePropertyChangeListener(pcl);
	}
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PRIVATE">
	//<editor-fold defaultstate="expanded" desc="Attributs PRIVATE">
	private final JButton bouton = new JButton("▼   ");
	private final SparadrapTexte boutonTexte = new SparadrapTexte();
	private final JComboBox<E> comboBox = new JComboBox<>();
	private final JComponent popupMenu = (JComponent) comboBox.getUI().getAccessibleChild(comboBox, 0);
	private final List<E> items;
	private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	private E selectedItem;
	private boolean verou = false;
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Methodes PRIVATE">
	/**
	 * Configure le bouton de la combobox.
	 */
	private void designerBouton() {
		this.bouton.add(this.boutonTexte);
		Designer.definirUneMiseEnPageSpring(this.bouton, this.boutonTexte, new int[] {0, 24, 0, 0});
		this.bouton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		this.bouton.setBackground(ModelePrincipal.APP_COULEUR_PRINCIPALE);
		this.bouton.setHorizontalAlignment(SwingConstants.RIGHT);
		this.bouton.setFocusPainted(false);
		this.designerBoutonTexte();
		this.bouton.addActionListener(e -> afficherMenu());
	}
	/**
	 * Configure le label de la combobox.
	 */
	private void designerBoutonTexte() {
		this.boutonTexte.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, Color.BLACK));
		this.boutonTexte.setFont(ModelePrincipal.CHAMP_TEXT_FONT);
		this.boutonTexte.setHorizontalAlignment(SwingConstants.LEFT);
	}
	/**
	 * Confirure les actions de la combobox.
	 * !!! EVENT VEROUILLABLE !!!
	 */
	private void configurerComboBox() {
		this.comboBox.addActionListener (e -> {
			@SuppressWarnings("unchecked")
			E selection = (E) this.comboBox.getSelectedItem();
			if (!this.verou) {
				this.setSelectedItem(selection);
				if (this.popupMenu != null) this.popupMenu.setVisible(false);
			}
		});
		JScrollPane popup = (JScrollPane) this.popupMenu.getUI().getAccessibleChild(this.popupMenu,0);
		popup.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JavaHorribleBugManager.FixeMoiCeBug(() -> this.popupMenu.setVisible(false));
	}
	/**
	 * Affiche la selection de la combobox.
	 * !!! VEROUILLABLE !!!
	 */
	private void afficherMenu() {
		if (!this.verou && this.items != null) {
			Point location = bouton.getLocationOnScreen();
			this.popupMenu.setLocation(location.x, location.y + bouton.getHeight());
			JList<Object> liste = ((ComboPopup) this.popupMenu).getList();
			liste.setFixedCellWidth(bouton.getWidth() - 19);
			liste.setBackground(ModelePrincipal.APP_COULEUR_PRINCIPALE);
			this.popupMenu.setVisible(true);
		}
	}
	/**
	 * Ajoute a la combobox les donnees.
	 * !!! VEROUILLABLE !!!
	 */
	private void creerMenuCollection() {
		if (!this.verou) {
			this.selectedItem = null;
			this.comboBox.removeAllItems();
			for (E item : this.items) {
				this.comboBox.addItem(item);
			}
		}
	}
	/**
	 * Assigne la selection et declenche l'evenement associe.
	 * !!! VEROUILLABLE !!!
	 * @param item (E)
	 */
	private void setSelectedItem(E item) {
		if (!this.verou) {
			E oldSelectedItem = this.selectedItem;
			this.selectedItem = item;
			// Notifie les observateurs que selectedItem a changé
			this.propertyChangeSupport.firePropertyChange("selectedItem", oldSelectedItem, item);
			if (item != null) {
				this.boutonTexte.setText("    " + item);
			} else {
				this.boutonTexte.setText(" - liste vide -");
			}
		}
	}
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="ENCAPSULATION">
	//<editor-fold defaultstate="expanded" desc="Getters">
	/**
	 * Setter
	 * @return (E)
	 */
	public final E getSelectedItem() {
		return this.selectedItem;
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Setters">
	/**
	 * Setter
	 */
	public final void setVerou(boolean verou) {
		this.verou = verou;
		this.comboBox.setEnabled(!verou);
		this.bouton.setEnabled(!verou);
	}
	//</editor-fold>
	//</editor-fold>
	//END/////////////////////////////////////////////////[instance]////////////////////////////////////////////////////
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="OVERRIDE">
	//START_______________________________________________[override]__________________________________________________//
	//END/////////////////////////////////////////////////[override]////////////////////////////////////////////////////
	//</editor-fold>
}