package sparadrap.composants.sparadrap;
import sparadrap.composants.designers.Designer;
import sparadrap.mvc.modeles.ModelePrincipal;
import javax.swing.*;
/**
 * [SparadrapPanneau] - class
 * @author Mathaus
 */
public class SparadrapPanneau extends JPanel {
	//<editor-fold defaultstate="collapsed" desc="STATIC">
	//START________________________________________________[static]___________________________________________________//
	//<editor-fold defaultstate="collapsed" desc="PUBLIC">
    //<editor-fold defaultstate="collapsed" desc="Proprietes PUBLIC">
    //</editor-fold>
	//<editor-fold defaultstate="collapsed" desc="Fonctions PUBLIC">
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
	public SparadrapPanneau() {}
	public SparadrapPanneau(JComponent parent, int[] marges) {
		parent.add(this);
		Designer.definirUneMiseEnPageSpring(parent, this, marges);
	}
	{
		this.setBackground(ModelePrincipal.APP_COULEUR_PRINCIPALE);
	}
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