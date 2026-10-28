public class TiketKonser extends Tiket {
    private String artis;

    // Constructor Subclass
    public TiketKonser(String nama, String event, double harga, String artis) {
        // super(...) digunakan untuk memanggil constructor superclass Tiket
        // untuk menginisialisasi atribut private nama, event, dan harga
        super(nama, event, harga);
        this.artis = artis;
    }

    // Getter dan Setter untuk atribut artis
    public String getArtis() { return artis; }
    public void setArtis(String artis) { this.artis = artis; }

    // Override: Menimpa method tampilkanInfo() milik superclass dengan perilaku khusus tiket konser
    @Override
    public void tampilkanInfo() {
        System.out.println("=== TIKET KONSER ===");
        System.out.println("Nama  : " + getNama());   // Mengambil nama lewat getter superclass
        System.out.println("Event : " + getEvent());  // Mengambil event lewat getter superclass
        System.out.println("Artis : " + artis);       // Menampilkan atribut artis milik subclass
        System.out.println("Harga : Rp " + String.format("%,.0f", getHarga())); // Format angka ribuan
    }
}