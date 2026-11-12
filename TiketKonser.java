public class TiketKonser extends Tiket {
    private String artis;

    public TiketKonser(String nama, String event, double harga, String artis) {
        super(nama, event, harga);
        this.artis = artis;
    }

    public String getArtis() { return artis; }
    public void setArtis(String artis) { this.artis = artis; }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== TIKET KONSER ===");
        super.tampilkanInfo();
        System.out.println("Artis : " + artis);
    }
}