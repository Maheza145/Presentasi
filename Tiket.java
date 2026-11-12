public class Tiket {
    private String nama;
    private String event;
    private double harga;
    
    public Tiket(String nama, String event, double harga) {
        this.nama = nama;
        this.event = event;
        setHarga(harga); 
    }

    public String getNama() { return nama; }
    public String getEvent() { return event; }
    public double getHarga() { return harga; }

    
    public void setNama(String nama) { this.nama = nama; }
    public void setEvent(String event) { this.event = event; }

    
    public void setHarga(double harga) {
        if (harga < 0) {
            
            System.out.println("Harga tidak boleh negatif! Input: " + harga);
            this.harga = 0; //  nilai akan diatur ke 0
        } else {
            this.harga = harga;
        }
    }

    public void tampilkanInfo() {
        // System.out.println("=== TIKET ===");
        System.out.println("Nama  : " + nama);
        System.out.println("Event : " + event);
        System.out.println("Harga : Rp " + String.format("%,.0f", harga));
    }
}
