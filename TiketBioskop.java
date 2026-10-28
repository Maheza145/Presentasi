public class TiketBioskop extends Tiket {
    private String studio;

    public TiketBioskop(String nama, String event, double harga, String studio) {
        // super(...) digunakan untuk memanggil constructor superclass Tiket
        // untuk menginisialisasi atribut private nama, event, dan harga
        super(nama, event, harga);
        this.studio = studio; // Inisialisasi atribut milik subclass itu sendiri
    }

    // Getter dan Setter untuk atribut studio
    public String getStudio() { return studio; }
    public void setStudio(String studio) { this.studio = studio; }

    // Override: Menimpa method tampilkanInfo() milik superclass dengan format tiket bioskop
    @Override
    public void tampilkanInfo() {
        System.out.println("=== TIKET BIOSKOP ===");
        System.out.println("Nama   : " + getNama());   // Mengambil nama lewat getter superclass
        System.out.println("Film   : " + getEvent());  // Mengambil event lewat getter superclass
        System.out.println("Studio : " + studio);      // Menampilkan atribut studio milik subclass
        System.out.println("Harga  : Rp " + String.format("%,.0f", getHarga())); // Format angka ribuan
    }
}