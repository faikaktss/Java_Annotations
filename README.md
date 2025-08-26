🎓 Proje Sunumu: Java Annotations & Reflection Demo
🏷️ Anotasyon (Annotation) Nedir?

Java’da anotasyonlar, sınıflara, metotlara veya değişkenlere eklenebilen, bir tür etiket (metadata) görevi gören yapılardır:

📌 Kodun kendisine ek bilgi sağlar.

📌 Compiler veya çalışma zamanı tarafından yorumlanabilir.

📌 Çoğu zaman framework’lerde ve kütüphane kullanımında karşımıza çıkar.

➡️ Bu projede iki adet özel anotasyon tanımlandı:

@Databaseconf → Veritabanı bağlantı bilgilerini saklar.

@Birim → Kullanıcının boy ve kilosuna birim ekler.

🔎 Reflection Nedir?

Reflection, Java’da çalışma zamanında bir sınıfın yapısını inceleme ve yönetme imkanı sunar:

🔍 Sınıfın metotlarını, alanlarını ve anotasyonlarını öğrenebiliriz.

🔍 Normalde derleme anında bilmediğimiz bilgilere, program çalışırken erişebiliriz.

➡️ Bu projede Reflection:

@Databaseconf anotasyonunu sınıftan okumak,

@Birim anotasyonunu metodun üzerinden çekmek,

Ve bunları kullanıcıya göstermek için kullanılmıştır.

🗂️ Projenin Akışı

✨ Sınıfa Anotasyon Ekleme
→ AnnotationInvoker sınıfının başına @Databaseconf anotasyonu yazılır.

🔍 Anotasyonu Okuma
→ Reflection kullanılarak sınıf üzerindeki bu anotasyon bulunur, bilgiler ekrana yazdırılır.

⚖️ Metoda Anotasyon Ekleme
→ write metoduna @Birim anotasyonu eklenir (örneğin: Boy → Metre, Kilo → Kilogram).

🧑‍💻 Kullanıcı Etkileşimi
→ Program kullanıcıdan boy ve kilo bilgilerini alır.

📊 Sonuçların Sunulması
→ Kullanıcının girdiği değerler, @Birim anotasyonundan gelen birimlerle birlikte ekrana yazdırılır.

🛠️ Kullanılan Java Özellikleri

☕ Custom Annotations (özel anotasyonlar oluşturma)

🔎 Reflection API (çalışma zamanında metadata okuma)

⌨️ Scanner (kullanıcıdan veri alma)

📡 Retention & Target (anotasyonların yaşam süresi ve nerede kullanılacağını belirleme)

🎯 Projenin Amacı

Bu proje, klasik programlama yaklaşımının ötesine geçerek Java’nın metaprogramming yeteneklerini göstermeyi amaçlar:

🏷️ Anotasyonların nasıl tanımlanıp kullanılabileceğini öğrenmek,

🔎 Reflection ile çalışma zamanında bilgiye erişimi deneyimlemek,

👨‍💻 Kullanıcı etkileşimi ile konuyu daha somut hale getirmek.

🌟 Sonuç

📌 Bu proje küçük ama güçlü bir örnek olarak, Java Annotations ve Reflection konularını kavramanı kolaylaştırır.

Kodun esnekliğini ve okunabilirliğini artırır.

Çalışma zamanında dinamik bilgi erişimi sağlar.

Eğitim amaçlı çok iyi bir referans niteliği taşır.
