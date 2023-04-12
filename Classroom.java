public class Classroom {
    public static void main(String[] args) {
        // Création des instances
        Wilder WiderAlice = new Wilder("Alice", true);
        Wilder WiderMomo = new Wilder("Momo", true);
        Wilder WiderSamy = new Wilder("Samy", false);
        Wilder WiderAlban = new Wilder("Alban", true);
        Wilder WiderElodie = new Wilder("Elodie", false);

        // Affichage de whiAmI
        System.out.println(WiderAlice.whoAmI());
        System.out.println(WiderMomo.whoAmI());
        System.out.println(WiderSamy.whoAmI());
        System.out.println(WiderAlban.whoAmI());
        System.out.println(WiderElodie.whoAmI());

    }
}
