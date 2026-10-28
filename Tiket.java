public class Tiket {
    // Encapsulation: 3 atribut private agar data terlindungi dan tidak bisa diakses langsung dari luar
    private String nama;
    private String event;
    private double harga;
    
    // Constructor parameter: Berfungsi untuk menginisialisasi nilai atribut saat objek pertama kali dibuat
    public Tiket(String nama, String event, double harga) {
        this.nama = nama;
        this.event = event;
        setHarga(harga); // Memanggil setter agar nilai harga langsung melewati proses validasi
    }

    // Getter: Method untuk membaca/mengambil nilai dari atribut private
    public String getNama() { return nama; }
    public String getEvent() { return event; }
    public double getHarga() { return harga; }

    // Setter: Method untuk mengubah/memperbarui nilai dari atribut private
    public void setNama(String nama) { this.nama = nama; }
    public void setEvent(String event) { this.event = event; }

    // harga tidak boleh 0
    public void setHarga(double harga) {
        if (harga < 0) {
            // Jika input harga bernilai negatif, tolak dan beri notifikasi
            System.out.println("Harga tidak boleh negatif! Input: " + harga);
            this.harga = 0; //  nilai akan diatur ke 0
        } else {
            // Jika input valid maka nilai akan di simpan ke atribut harga
            this.harga = harga;
        }
    }

    // Method untuk menampilkan detail tiket 
    public void tampilkanInfo() {
        System.out.println("=== TIKET ===");
        System.out.println("Nama  : " + nama);
        System.out.println("Event : " + event);
        System.out.println("Harga : Rp " + String.format("%,.0f", harga));
    }
}
