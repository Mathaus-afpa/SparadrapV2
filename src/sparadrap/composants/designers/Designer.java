package sparadrap.composants.designers;
import javax.swing.*;
import java.awt.*;
/**
 * [Designer] - class
 * @author Mathaus
 */
public class Designer {
	//<editor-fold defaultstate="collapsed" desc="STATIC">
	//START________________________________________________[static]___________________________________________________//
	//<editor-fold defaultstate="collapsed" desc="PUBLIC">
    //<editor-fold defaultstate="collapsed" desc="Proprietes PUBLIC">
    //</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="Fonctions PUBLIC">
	/**
	 * Creation d'une marge via les contraintes du SpringLayout.
	 * @param parent avec un SpringLayout
	 * @param enfant enfant à parametrer la marge
	 * @param marges taille des marges
	 */
	public static void definirUneMiseEnPageSpring(JComponent parent, JComponent enfant, int[] marges) {
		int northMargin = 0;
		int eastMargin = 0;
		int southMargin = 0;
		int westMargin = 0;
		//
		LayoutManager parentLayout = parent.getLayout();
		SpringLayout layout;
		if (!(parentLayout instanceof SpringLayout)) {
			layout = new SpringLayout();
			parent.setLayout(layout);
		} else {
			layout = (SpringLayout) parent.getLayout();
		}
		if (marges != null && marges.length > 0) {
			switch (marges.length) {
				case 1:
					northMargin = eastMargin = southMargin = westMargin = Math.abs(marges[0]);
					break;
				case 2:
					northMargin = southMargin = Math.abs(marges[0]);
					eastMargin = westMargin = Math.abs(marges[1]);
					break;
				case 3: break; //do nothing
				default:
					northMargin = Math.abs(marges[0]);
					eastMargin = Math.abs(marges[1]);
					southMargin = Math.abs(marges[2]);
					westMargin = Math.abs(marges[3]);
					break;
			}
		}
		layout.putConstraint(SpringLayout.NORTH, enfant, northMargin, SpringLayout.NORTH, parent);
		layout.putConstraint(SpringLayout.EAST, enfant, -eastMargin, SpringLayout.EAST, parent);
		layout.putConstraint(SpringLayout.SOUTH, enfant, -southMargin, SpringLayout.SOUTH, parent);
		layout.putConstraint(SpringLayout.WEST, enfant, westMargin, SpringLayout.WEST, parent);
	}
    //</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="PRIVATE">
    //<editor-fold defaultstate="collapsed" desc="Proprietes PRIVATE">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Fonctions PRIVATE">
    //</editor-fold>
	//</editor-fold>
    //END//////////////////////////////////////////////////[static]/////////////////////////////////////////////////////
	//</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="INSTANCE">
    //START_______________________________________________[instance]__________________________________________________//
    // <editor-fold defaultstate="collapsed" desc="CONSTRUCTEURS">
	private Designer() {}
    // </editor-fold>
	//<editor-fold defaultstate="collapsed" desc="PUBLIC">
    //<editor-fold defaultstate="collapsed" desc="Attributs PUBLIC">
    //</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="Methodes PUBLIC">
    //</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="PRIVATE">
    //<editor-fold defaultstate="collapsed" desc="Attributs PRIVATE">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Methodes PRIVATE">
    //</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="ENCAPSULATION">
    //<editor-fold defaultstate="collapsed" desc="Getters">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    //</editor-fold>
	//</editor-fold>
    //END/////////////////////////////////////////////////[instance]////////////////////////////////////////////////////
	//</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="OVERRIDE">
	//START_______________________________________________[override]__________________________________________________//
	//END/////////////////////////////////////////////////[override]////////////////////////////////////////////////////
	//</editor-fold>
}