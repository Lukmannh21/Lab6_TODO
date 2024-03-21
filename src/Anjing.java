public class Anjing {
    private String nama;
    private String ras;
    private int umur;
    private String warnaBulu;

    public Anjing(String nama, String ras, int umur, String warnaBulu) {
        this.nama = nama;
        this.ras = ras;
        this.umur = umur;
        this.warnaBulu = warnaBulu;
    }

    public void poop() {
        System.out.println(nama + " lagi poop");
    }

    public void makan() {
        System.out.println(nama + " lagi makan.");
    }

    public void tidur() {
        System.out.println(nama + " lagi tidur.");
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Ras: " + ras);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Warna Bulu: " + warnaBulu);
    }

    public static void main(String[] args) {
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
