package sparadrap.data;
import sparadrap.composants.enums.metiers.SPECIALITES;
import sparadrap.mvc.modeles.metiers.Medecin;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * [DataSource] - class
 * @author Mathaus
 */
public class DataSource {
	//<editor-fold defaultstate="expanded" desc="STATIC">
	//START________________________________________________[static]___________________________________________________//
	//<editor-fold defaultstate="expanded" desc="PUBLIC">
	//<editor-fold defaultstate="expanded" desc="Proprietes PUBLIC">
	public static final java.util.List<Medecin> MEDECINS = new ArrayList<>();
	static {
		creerMedecins();
	}
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="Fonctions PUBLIC">
	//</editor-fold>
	//</editor-fold>
	//<editor-fold defaultstate="expanded" desc="PRIVATE">
	//<editor-fold defaultstate="expanded" desc="Proprietes PRIVATE">
	/**
	 * Creer une liste de medecins.
	 */
	private static void creerMedecins() {
		String[] prenoms = {
				"Anthony", "Bernard", "Christian", "Denis", "Emmanuel",
				"Fabien", "Gilles", "Henri", "Isabelle", "Julien",
				"Karine", "Laurent", "Marie", "Nathalie", "Olivier",
				"Patricia", "Quentin", "Raphaël", "Sophie", "Thomas",
				"Ursule", "Valérie", "William", "Xavier", "Yves"
		};
		String[] noms = {
				"Dupont", "Martin", "Durand", "Moreau", "Lefevre",
				"Garcia", "Muller", "Leroy", "Simon", "Laurent",
				"Michel", "Bernard", "Robert", "Richard", "Petit",
				"Roux", "David", "Bertrand", "Morel", "Girard",
				"Andre", "Lemoine", "Fournier", "Blanc", "Guerin"
		};
		String[] adresses = {
				"123 Rue de la Paix", "45 Avenue des Champs", "10 Boulevard Saint-Germain", "22 Quai des Grands Augustins", "17 Place de la République",
				"5 Rue de Rivoli", "30 Rue des Martyrs", "9 Rue de Rennes", "55 Avenue Foch", "78 Rue de la Pompe",
				"21 Rue de Belleville", "12 Boulevard Voltaire", "8 Rue des Archives", "14 Rue de la Roquette", "6 Rue du Faubourg Saint-Antoine",
				"33 Rue de Charonne", "29 Rue de la Grange aux Belles", "19 Rue de l'Université", "47 Rue de Sèvres", "38 Rue Saint-Dominique",
				"66 Rue de Miromesnil", "72 Avenue de la Bourdonnais", "3 Rue Cler", "11 Avenue de la Motte-Picquet", "25 Rue de Grenelle"
		};
		String[] emails = {
				"contact1@medecin.fr", "contact2@medecin.fr", "contact3@medecin.fr", "contact4@medecin.fr", "contact5@medecin.fr",
				"contact6@medecin.fr", "contact7@medecin.fr", "contact8@medecin.fr", "contact9@medecin.fr", "contact10@medecin.fr",
				"contact11@medecin.fr", "contact12@medecin.fr", "contact13@medecin.fr", "contact14@medecin.fr", "contact15@medecin.fr",
				"contact16@medecin.fr", "contact17@medecin.fr", "contact18@medecin.fr", "contact19@medecin.fr", "contact20@medecin.fr",
				"contact21@medecin.fr", "contact22@medecin.fr", "contact23@medecin.fr", "contact24@medecin.fr", "contact25@medecin.fr"
		};
		String[] telephones = {
				"0102030405", "0607080910", "0123456789", "0611223344", "0555667788",
				"0622334455", "0633445566", "0644556677", "0655667788", "0666778899",
				"0677889900", "0688990011", "0699001122", "0610111213", "0612131415",
				"0614151617", "0616171819", "0618192021", "0620212223", "0622232425",
				"0624252627", "0626272829", "0628293031", "0630313233", "0632333435"
		};
		String[] codePostaux = {
				"75001", "75002", "75003", "75004", "75005",
				"75006", "75007", "75008", "75009", "75010",
				"75011", "75012", "75013", "75014", "75015",
				"75016", "75017", "75018", "75019", "75020",
				"75021", "75022", "75023", "75024", "75025"
		};
		Random random = new Random();
		for (int i = 0; i < prenoms.length; i++) {
			Medecin medecin = new Medecin(prenoms[i]);
			medecin.setNom(noms[i]);
			medecin.setAdresse(adresses[i]);
			medecin.setEmail(emails[i]);
			medecin.setTelephone(telephones[i]);
			medecin.setCodePostal(codePostaux[i]);
			medecin.setAgreement(Integer.toString(random.nextInt(12345, 60000) + 456));
			// Ajouter des spécialités, un médecin peut en avoir plusieurs
			int nombreDeSpecialites = random.nextInt(1, 4); // Nombre aléatoire entre 1 et 3
			List<SPECIALITES> specialitesDuMedecin = new ArrayList<>();
			while (specialitesDuMedecin.size() < nombreDeSpecialites) {
				SPECIALITES specialite = SPECIALITES.values()[random.nextInt(SPECIALITES.values().length)];
				if (!specialitesDuMedecin.contains(specialite)) {
					specialitesDuMedecin.add(specialite);
					medecin.addSpecialite(specialite); // Ajouter la spécialité au médecin
				}
			}
			MEDECINS.add(medecin);
		}
		MEDECINS.getFirst().addSpecialite(SPECIALITES.GENERALE);
	}
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
	private DataSource() {}
	//</editor-fold>
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