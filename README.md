# Kitapl-k-Y-netim-Sistemi

Kitaplık Yönetim Sistemi

Bu proje, kitapların bilgilerini saklayan ve kitaplık işlemlerini gerçekleştiren bir kitaplık yönetim sistemi uygulamasını içerir.

İki sınıf bulunmaktadır: Kitap ve Kitaplik.

--------------------------------------------------------------------------------
Kitap Sınıfı

Kitap sınıfı, kitapların adını, yazarını ve sayfa sayısını saklamak için kullanılır.

-----------------------------------------------------------------------------------
Kurucu Metod:

"public Kitap(String ad, String yazar, int sayfaSayisi)"

-------------------------------------------------------------------------
Parametreler:

ad: Kitabın adı (String).

yazar: Kitabın yazarı (String).

sayfaSayisi: Kitabın sayfa sayısı (int).

------------------------------------------------------------------------------
Getter Metotlar

public String getAd()

public String getYazar()

public int getSayfaSayisi()


Dönüş Değeri: İlgili özelliğin değeri (String veya int).

----------------------------------------------------------------------------------
Kitaplik Sınıfı:

Kitaplik sınıfı, Kitap nesnelerini bir liste içerisinde tutarak kitaplık işlemlerini gerçekleştirmek için kullanılır.

Kurucu Metod:

"public Kitaplik()"

--------------------------------------------------------------
kitapEkle Metodu:

"public void kitapEkle(Kitap kitap)"

Parametre: Eklenecek kitap nesnesi (Kitap).

-------------------------------------------------------------------------------
kitapSil Metodu:

"public void kitapSil(Kitap kitap)"

Parametre: Silinecek kitap nesnesi (Kitap).

---------------------------------------------------------------------
kitaplariListele Metodu:

"public void kitaplariListele()"
Ekrana kitaplıkta bulunan kitapların bilgilerini listeler.

-----------------------------------------------------------------------
Main Sınıfı

Main sınıfı, örnek Kitap ve Kitaplik nesneleri oluşturarak kitap ekleme, silme ve listeleme işlemlerini gerçekleştirir.


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

--------------------------------------------------------------------------------------------------------
Yukarıdaki örnek kodda, bir Kitaplik nesnesi oluşturulur ve Kitap nesneleri eklenir, silinir ve listelenir.

Bu projede nesneye yönelik programlama prensipleri kullanılarak basit bir kitaplık yönetim sistemi oluşturulmuştur.
