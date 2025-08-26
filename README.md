🎓 Proje Sunumu: Java Annotations & Reflection Demoları
Bu proje, Java dilinde özel anotasyonlar (custom annotations) oluşturmayı ve bu anotasyonları reflection mekanizması aracılığıyla çalışma zamanında okumayı hedefleyen bir örnek uygulamadır.

🏷️ Anotasyon (Annotation) Nedir?
Java'da anotasyonlar, sınıflara, metotlara veya değişkenlere eklenebilen, bir tür etiket (metadata) görevi gören yapılardır.

Kodun kendisine ek bilgi sağlarlar.

Derleyici (compiler) veya çalışma zamanı (runtime) tarafından yorumlanabilirler.

Çoğu zaman framework'lerde, konfigürasyonlarda ve kütüphane kullanımında karşımıza çıkarlar.

Bu projede, iki farklı özel anotasyon tanımlanmıştır:

@Databaseconf: Veritabanı bağlantı bilgilerini saklamak için.

@Birim: Kullanıcının boy ve kilosuna birim eklemek için.

🔎 Reflection Nedir?
Reflection, Java'da çalışma zamanında bir sınıfın yapısını inceleyebilme ve değiştirebilme imkanı sunan güçlü bir özelliktir.

Bir sınıfın sahip olduğu metotları, anotasyonları ve alanları (fields) öğrenebiliriz.

Normalde derleme anında bilmediğimiz bilgilere, program çalışırken erişebiliriz.

Bu projede Reflection, aşağıdaki amaçlarla kullanılmıştır:

Sınıfa eklenen @Databaseconf anotasyonunu çekmek.

Metotlara eklenen @Birim anotasyonunu bulmak.

Bu bilgileri kullanıcıya sunmak.

🗂️ Projenin Akışı
✨ 1. Sınıfa Anotasyon Ekleme
AnnotationInvoker adlı sınıfın üzerine @Databaseconf anotasyonu yerleştirilir. Bu anotasyonun içinde, veritabanı bağlantısına dair bilgiler (URL, kullanıcı adı, şifre, port) tanımlıdır.

🔍 2. Anotasyonu Okuma
Program çalıştığında, Reflection kullanılarak bu anotasyon bulunur. Eğer anotasyon mevcutsa, içindeki bilgiler ekrana yazdırılır. Böylece kodun içine gömülmüş değil, anotasyon üzerinden gelen bilgiler görüntülenmiş olur.

⚖️ 3. Metoda Anotasyon Ekleme
write adında başka bir metoda @Birim anotasyonu eklenmiştir. Bu anotasyon, boy ve kilo için hangi birimlerin kullanılacağını belirtir (örneğin, boy → metre, kilo → kilogram).

🧑‍💻 4. Kullanıcı Etkileşimi
Program çalıştırıldığında kullanıcıdan boy ve kilo değerleri istenir. Bu değerler alındıktan sonra, write metodu çağrılır.

📊 5. Sonuçların Sunulması
Reflection ile metodun üzerindeki @Birim anotasyonu okunur ve kullanıcının girdiği değerler, anotasyondan gelen birimlerle birlikte ekrana yazdırılır.

Örneğin, kullanıcı 1.80 ve 75 girdiğinde ekrana “Boy: 1.8 M” ve “Kilo: 75 KG” yazılır.

🛠️ Kullanılan Java Özellikleri
Java Annotations: Özel anotasyonlar oluşturma.

Reflection API: Çalışma zamanında metadata okuma.

Scanner: Kullanıcı girdisi alma.

Retention & Target: Anotasyonların nerede kullanılacağını ve ne zamana kadar erişilebilir olacağını belirleme.

🎯 Projenin Amacı
Bu projenin temel amacı, klasik programlama yaklaşımının ötesine geçerek Java’nın metaprogramming yeteneklerini göstermektir.

Kullanıcıya, anotasyonların sadece framework'lerde veya hazır kütüphanelerde değil, kendi projelerimizde de nasıl kullanılabileceğini öğretmek.

Reflection kavramının, çalışma zamanında bilgileri nasıl dinamik hale getirdiğini örneklemek.

Soyut kalabilecek bir konuyu, somut ve anlaşılır bir örnek ile öğrenilebilir hale getirmek.

🌟 Sonuç
Bu proje, Java'da anotasyon ve reflection kavramlarını öğrenmek isteyenler için küçük ama etkili bir örnektir.

🏷️ Anotasyonlar sayesinde kod daha açıklayıcı ve yönetilebilir hale gelmiştir.

🔎 Reflection sayesinde, çalışma anında ek bilgiler okunarak dinamik bir davranış sağlanmıştır.

👨‍💻 Kullanıcı etkileşimi ile konunun pratik tarafı güçlendirilmiştir.

Kısacası, bu proje Java'nın güçlü soyutlama araçlarından biri olan anotasyonların, çalışma zamanında reflection ile nasıl kullanılabileceğini gözler önüne serer.
