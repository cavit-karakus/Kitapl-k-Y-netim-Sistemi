import java.util.ArrayList;
import java.util.List;

class Kitap {
    private String ad;
    private String yazar;
    private int sayfaSayisi;

    public Kitap(String ad, String yazar, int sayfaSayisi) {
        this.ad = ad;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getAd() {
        return ad;
    }

    public String getYazar() {
        return yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }
}

class Kitaplik {
    private List<Kitap> kitaplar;

    public Kitaplik() {
        kitaplar = new ArrayList<>();
    }

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
        System.out.println(kitap.getAd() + " kitabı kitaplığa eklendi.");
    }

    public void kitapSil(Kitap kitap) {
        kitaplar.remove(kitap);
        System.out.println(kitap.getAd() + " kitabı kitaplıktan silindi.");
    }

    public void kitaplariListele() {
        System.out.println("Kitaplıkta bulunan kitaplar:");
        for (Kitap kitap : kitaplar) {
            System.out.println("Ad: " + kitap.getAd() + ", Yazar: " + kitap.getYazar() + ", Sayfa Sayısı: " + kitap.getSayfaSayisi());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Kitaplik kitaplik = new Kitaplik();

        Kitap kitap1 = new Kitap("Harry Potter ve Felsefe Taşı", "J.K. Rowling", 300);
        Kitap kitap2 = new Kitap("Yüzüklerin Efendisi", "J.R.R. Tolkien", 500);
        Kitap kitap3 = new Kitap("Simyacı", "Paulo Coelho", 200);

        kitaplik.kitapEkle(kitap1);
        kitaplik.kitapEkle(kitap2);
        kitaplik.kitapEkle(kitap3);

        kitaplik.kitaplariListele();

        kitaplik.kitapSil(kitap2);

        kitaplik.kitaplariListele();
    }
}