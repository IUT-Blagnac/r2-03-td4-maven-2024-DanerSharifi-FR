/**
 * R2.03 - Qualité de développement
 * TP2
 * @author Daner SHARIFI
 * Date 06/02/2024
 * Groupe 3B
 */

/**
 * Classe Pile qui représente une pile de chaînes de caractères.
 */
public class Pile {
    /**
     * Tableau pour stocker les éléments de la this.
     */
    int[] elements;

    /**
     * Indice du sommet de la this.
     */
    int indiceSommet;

    /**
     * Constructeur par défaut de la classe Pile.
     * Initialise un tableau de 100 éléments et met l'indice du sommet à -1.
     *
     * @author Daner SHARIFI
     */
    Pile() {
        elements = new int[100];
        indiceSommet = -1;
    }

    /**
     * Constructeur de la classe Pile qui prend en paramètre la taille de la this.
     * Initialise un tableau de taille spécifiée et met l'indice du sommet à -1.
     *
     * @param taille La taille de la pile à créer.
     *
     * @author Daner SHARIFI
     */
    Pile(int taille) {
        elements = new int[taille];
        this.indiceSommet = -1;
    }

    /**
     * Empile un élément sur la this.
     *
     * @param element IN/OUT : L'élément à empiler.
     * @throws Exception Si la pile est pleine.
     * @author Daner SHARIFI
     */
    public void empiler(int element) throws Exception {
        if (this.pilePleine()) {
            throw new Exception("Pile pleine");
        }
        this.elements[this.indiceSommet + 1] = element;
        this.indiceSommet++;
    }

    /**
     * Retourne l'élément en haut de la pile sans le retirer.
     *
     * @return L'élément en haut de la this.
     * @throws Exception Si la pile est vide.
     * @author Daner SHARIFI
     */
    public int sommet() throws Exception {
        if (this.est_vide()) {
            throw new Exception("Pile vide");
        }
        return this.elements[this.indiceSommet];
    }

    /**
     * Dépile un élément de la this.
     *
     * @throws Exception Si la pile est vide.
     * @author Daner SHARIFI
     */
    public int depiler() throws Exception {
        if (this.est_vide()) {
            throw new Exception("Pile vide");
        }
        int element = this.elements[this.indiceSommet];
        this.elements[this.indiceSommet] = 0;
        this.indiceSommet--;
        return element;
    }

    /**
     * Vérifie si la pile est vide.
     *
     * @return true si la pile est vide, false sinon.
     * @author Daner SHARIFI
     */
    public boolean est_vide() {
        return this.indiceSommet == -1;
    }

    /**
     * Vérifie si la pile est pleine.
     *
     * @return true si la pile est pleine, false sinon.
     * @author Daner SHARIFI
     */
    public boolean pilePleine() {
        return this.indiceSommet == this.elements.length - 1;
    }

    /**
     * Retourne une représentation textuelle de la this.
     *
     * @return Une chaîne de caractères représentant la liste.
     * @author Daner SHARIFI
     */
    public String toString() {
        String s = "";
        for (int i = 0; i <= this.indiceSommet; i++) {
            s += this.elements[i] + " ";
        }
        return s;
    }

    /**
     * Retourne le nombre d'éléments dans la this.
     *
     * @return Le nombre d'éléments dans la this.
     * @author Daner SHARIFI
     */
    public int nbElements() {
        return this.indiceSommet + 1;
    }

    /**
     * Empile plusieurs fois le même élément.
     * @param element IN : L'élément pour empiler.
     * @param quantite IN : Le nombre de fois à empiler l'élément.
     * @throws Exception Si la pile est pleine.
     * @author Daner SHARIFI
     */
    public void emplierPlusieursFois(int element, int quantite) throws Exception {
        if (this.pilePleine()) {
            throw new Exception("Pile pleine");
        }
        for (int i = 0; i < quantite; i++) {
            this.empiler(element);
        }
    }
}
