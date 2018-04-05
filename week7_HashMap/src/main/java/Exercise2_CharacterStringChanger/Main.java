package Exercise2_CharacterStringChanger;

public class Main {
    public static void main(String[] args) {
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('a', 'o'));
        scandiesAway.addChange(new Change('k', 'b'));
        scandiesAway.addChange(new Change('A', 'O'));
        System.out.println(scandiesAway.change("Ala ma kota, a Agata krolika"));
    }
}
