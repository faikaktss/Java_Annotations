Java Annotations & Reflection Projesi
Bu proje, Java'da özel anotasyonlar (custom annotations) oluşturma ve bunları reflection mekanizması ile dinamik olarak kullanma yeteneklerini sergileyen bir demoyu içerir. Amacımız, kodun içerisine gömülü bilgiler yerine, metadata kullanarak daha esnek ve yönetilebilir yapılar kurmaktır.

🏷️ Anotasyon (Annotation) Nedir?
Anotasyonlar, Java dilinde kodun kendisine ek bilgiler (metadata) eklememizi sağlayan etiketlerdir. Derleme veya çalışma zamanında bu bilgilere erişerek programın davranışını değiştirebiliriz.

Bu projede kullanılan özel anotasyonlar:

Anotasyon	Açıklama
@DatabaseConf	Veritabanı bağlantı detaylarını (URL, kullanıcı adı, şifre vb.) tanımlamak için kullanılır
@Birim	Kullanıcının girdiği boy ve kilo verilerine birim (metre, kilogram) eklemek için kullanılır
🔎 Reflection Nedir?
Reflection, bir programın çalışma zamanında kendi yapısını (sınıflar, metotlar, alanlar) incelemesine ve değiştirmesine olanak tanıyan güçlü bir Java özelliğidir.

Bu projede Reflection, aşağıdaki amaçlarla kullanılmıştır:

📖 @DatabaseConf anotasyonunu sınıftan okumak

📝 @Birim anotasyonunu metottan alarak ilgili birimleri belirlemek

Bu sayede, programın dinamik olarak farklı durumlara uyum sağlaması hedeflenmiştir.

🗂️ Proje Akışı: Adım Adım
Sınıfa Anotasyon Ekleme
AnnotationInvoker sınıfının üzerine @DatabaseConf anotasyonu eklenir ve veritabanı bilgileri buraya yazılır.

Anotasyonu Okuma
Program başladığında, Reflection API kullanılarak bu anotasyon bulunur ve içerisindeki veritabanı bilgileri ekrana yazdırılır. Bu, kodun içine sabitlenmiş veriler yerine, dışarıdan okunabilen bir konfigürasyon yapısı oluşturur.

Metoda Anotasyon Ekleme
write metodunun üzerine @Birim anotasyonu eklenir. Bu anotasyon, boy ve kilo değerlerinin hangi birimlerle (örneğin, metre ve kilogram) gösterileceğini belirtir.

Kullanıcı Etkileşimi
Kullanıcıdan boy ve kilo değerleri alınır.

Sonuçların Sunulması
Reflection, write metodundaki @Birim anotasyonunu okur ve kullanıcıdan alınan değerleri, anotasyonda belirtilen birimlerle birlikte ekrana basar.

💡 Örnek Kullanım:
Kullanıcı 1.80 ve 75 değerlerini girdiğinde:

text
Boy: 1.8 M
Kilo: 75 KG
🎯 Projenin Amacı ve Kazanımları
✅ Java'nın soyut ve güçlü özelliklerini somut bir örnekle anlaşılır hale getirmek

✅ Anotasyonların sadece hazır kütüphanelerde değil, kendi projelerimizde de nasıl kullanılabileceğini göstermek


✅ Reflection'ın, programın çalışma zamanı davranışını nasıl dinamik olarak şekillendirebileceğini kanıtlamak

✅ Yönetilebilir ve okunaklı kod yazma pratiğini güçlendirmek

📦 Teknolojiler
https://img.shields.io/badge/Java-100%2525-blue?style=for-the-badge&logo=java

📋 Sonuç
Bu demo, anotasyon ve reflection kavramlarının programlama dünyasındaki pratik önemini vurgulayan, sade ama etkili bir örnektir.

