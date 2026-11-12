public class Main {
    public static void main(String[] args) {
        System.out.println("\nNama: Egga Maheza | NIM: L200250007");
        System.out.println();

        TiketKonser t1 = new TiketKonser("Budi", "Konser Nusantara", 350000, "Tulus");
        t1.tampilkanInfo();
        System.out.println();

        TiketBioskop t2 = new TiketBioskop("Siti", "Avengers", 50000, "Studio 3");
        t2.tampilkanInfo();
        System.out.println();

        
        System.out.println("jika harga tiket negatif:");
        TiketKonser t3 = new TiketKonser("Andi", "Jazz Festival", 100, "Diana Krall");
        t3.tampilkanInfo();

        System.out.println("\njika harga tiket negatif :");
        TiketBioskop t4 = new TiketBioskop("Egga", "Cars2", -100000, "pixar");
        t4.tampilkanInfo();
    }
}