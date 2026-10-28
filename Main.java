public class Main {
    public static void main(String[] args) {
        System.out.println("\nNama: Egga Maheza | NIM: L200250007");
        System.out.println();

        // Objek 1: TiketKonser (data valid)
        TiketKonser t1 = new TiketKonser("Budi", "Konser Nusantara", 350000, "Tulus");
        t1.tampilkanInfo();
        System.out.println();

        // Objek 2: TiketBioskop (data valid)
        TiketBioskop t2 = new TiketBioskop("Siti", "Avengers", 50000, "Studio 3");
        t2.tampilkanInfo();
        System.out.println();

        // Objek 3: Tiket dengan harga negatifyang ditolak setter
        System.out.println("jika harga tiket negatif:");
        TiketKonser t3 = new TiketKonser("Andi", "Jazz Festival", 100, "Diana Krall");
        t3.tampilkanInfo();

        // objek 4 : sama dengan objek 3
        System.out.println("\njika harga tiket negatif :");
        TiketBioskop t4 = new TiketBioskop("Egga", "Cars2", -100000, "pixar");
        t4.tampilkanInfo();
    }
}