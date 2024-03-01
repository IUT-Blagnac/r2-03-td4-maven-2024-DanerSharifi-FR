//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * R2.03 - Qualité de développement
 * TP2
 * @author Daner SHARIFI
 * Date 06/02/2024
 * Groupe 3B
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Pile maPile = new Pile(10);
        if (!maPile.est_vide()) System.out.println("NOK");

        maPile.empiler(5);
        if (maPile.est_vide()) System.out.println("NOK");

        int element = maPile.depiler();
        if (!maPile.est_vide()) System.out.println("NOK");
        if (element != 5) System.out.println("NOK");

        Pile p = new Pile();
        p.empiler(4);
        element = p.depiler();
        System.out.println(element); // 4

        Pile multi = new Pile(20);
        multi.emplierPlusieursFois(5, 3);
        multi.depiler();
        multi.empiler(9);
        multi.empiler(11);
        System.out.println(multi.toString());
    }
}