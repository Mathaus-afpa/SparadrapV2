package sparadrap.composants.sparadrap;
import javax.swing.*;
import java.awt.event.ActionListener;
import static sparadrap.mvc.modeles.ModelePrincipal.APP_COULEUR_PRINCIPALE;
import static sparadrap.mvc.modeles.ModelePrincipal.COULEUR_BTN_SUPPRIMER;
/**
 * [SparadrapPanneauCliquable] - class
 * @author Mathaus
 */
public class SparadrapPanneauCliquable extends SparadrapPanneau {
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
    public SparadrapPanneauCliquable(JButton bouton) {
        this.bouton = bouton;
        this.add(this.bouton);
    }
    //</editor-fold>
    //<editor-fold defaultstate="expanded" desc="PUBLIC">
    //<editor-fold defaultstate="expanded" desc="Attributs PUBLIC">
    //</editor-fold>
    //<editor-fold defaultstate="expanded" desc="Methodes PUBLIC">
    /**
     * Defini l'evenement onclick du bouton.
     * @param listener (ActionListener)
     */
    public final void setOnClickListener(ActionListener listener) {
        this.bouton.addActionListener(listener);
    }
    /**
     * Desactive le bouton et change sa couleur.
     */
    public final void desactiver() {
        this.bouton.setBackground(APP_COULEUR_PRINCIPALE);
        this.bouton.setEnabled(false);
    }
    /**
     * Active le bouton et change sa couleur.
     */
    public void activer() {
        this.bouton.setBackground(COULEUR_BTN_SUPPRIMER);
        this.bouton.setEnabled(true);
    }
    //</editor-fold>
    //</editor-fold>
    //<editor-fold defaultstate="expanded" desc="PRIVATE">
    //<editor-fold defaultstate="expanded" desc="Attributs PRIVATE">
    private final JButton bouton;
    //</editor-fold>
    //<editor-fold defaultstate="expanded" desc="Methodes PRIVATE">
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