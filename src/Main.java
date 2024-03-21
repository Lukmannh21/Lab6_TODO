//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Anjing anjing1 = new Anjing("anu", "Kintamani", 3, "Coklat");
        Anjing anjing2 = new Anjing("ano", "Anjing Kampung", 5, "Putih");
        Anjing anjing3 = new Anjing("ene", "bulldog", 2, "Abu-abu");

        anjing1.info();
        anjing1.poop();
        anjing2.info();
        anjing2.makan();
        anjing3.info();
        anjing3.tidur();
    }
}