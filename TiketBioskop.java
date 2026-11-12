public class TiketBioskop extends Tiket {
    private String studio;

    public TiketBioskop(String nama, String event, double harga, String studio) {
        super(nama, event, harga);
        this.studio = studio; 
    }

    public String getStudio() { return studio; }
    public void setStudio(String studio) { this.studio = studio; }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== TIKET BIOSKOP ===");
        super.tampilkanInfo();
        System.out.println("Studio : " + studio); 
    }
}   