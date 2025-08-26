🎓 Proje Sunumu: Java Annotations & Reflection Demo

Bu proje, Java dilinde özel anotasyonlar (custom annotations) oluşturmayı ve bu anotasyonları reflection mekanizması aracılığıyla çalışma zamanında okumayı hedefleyen bir örnek uygulamadır.

🏷️ Anotasyon (Annotation) Nedir?

Java’da anotasyonlar, sınıflara, metotlara veya değişkenlere eklenebilen, bir tür etiket (metadata) görevi gören yapılardır.

📌 Kodun kendisine ek bilgi sağlarlar.

📌 Compiler veya çalışma zamanı tarafından yorumlanabilirler.

📌 Çoğu zaman framework’lerde, konfigürasyonlarda ve kütüphane kullanımında karşımıza çıkarlar.

Bu projede, iki farklı özel anotasyon tanımlanmıştır:

@Databaseconf → Veritabanı bağlantı bilgilerini saklamak için.

@Birim → Kullanıcının boy ve kilosuna birim eklemek için.

🔎 Reflection Nedir?

Reflection, Java’da çalışma zamanında bir sınıfın yapısını inceleyebilme ve değiştirebilme imkanı sunan güçlü bir özelliktir.

Sınıfın sahip olduğu metotları, anotasyonları ve alanları (fields) öğrenebiliriz.

Normalde derleme anında bilmediğimiz bilgilere, program çalışırken erişebiliriz.

Bu projede Reflection:

Sınıfa eklenen @Databaseconf anotasyonunu çekmek,

Metotlara eklenen @Birim anotasyonunu bulmak,

Ve bu bilgileri kullanıcıya sunmak için kullanılmıştır.

🗂️ Projenin Akışı

✨ Sınıfa Anotasyon Ekleme:
AnnotationInvoker adlı sınıfın üzerine @Databaseconf anotasyonu yerleştirilir. Bu anotasyonun içinde, veritabanı bağlantısına dair bilgiler (URL, kullanıcı adı, şifre, port) tanımlıdır.

🔍 Anotasyonu Okuma:
Program çalıştığında, Reflection kullanılarak bu anotasyon bulunur. Eğer anotasyon mevcutsa, içindeki bilgiler ekrana yazdırılır. Bu sayede kodun içine gömülmüş değil, anotasyon üzerinden gelen bilgiler görüntülenmiş olur.

⚖️ Metoda Anotasyon Ekleme:
write adında başka bir metoda @Birim anotasyonu eklenmiştir. Bu anotasyon, boy ve kilo için hangi birimlerin kullanılacağını belirtir (örneğin boy → metre, kilo → kilogram).

🧑‍💻 Kullanıcı Etkileşimi:
Program çalıştırıldığında kullanıcıdan boy ve kilo değerleri istenir. Bu değerler alındıktan sonra, write metodu çağrılır.

📊 Sonuçların Sunulması:
Reflection ile metodun üzerindeki @Birim anotasyonu okunur ve kullanıcının girdiği değerler, anotasyondan gelen birimlerle birlikte ekrana yazdırılır.

Örneğin kullanıcı 1.80 ve 75 girdiğinde:
👉 Ekrana “Boy: 1.8 M” ve “Kilo: 75 KG” yazılır.

🛠️ Kullanılan Java Özellikleri

☕ Java Annotations (özel anotasyonlar oluşturma)

🔎 Reflection API (çalışma zamanında metadata okuma)

⌨️ Scanner (kullanıcı girdisi alma)

📡 Retention & Target → Anotasyonların nerede kullanılacağını ve ne zamana kadar erişilebilir olacağını belirlemek için.

🎯 Projenin Amacı

Bu projenin temel amacı, klasik programlama yaklaşımının ötesine geçerek Java’nın metaprogramming yeteneklerini göstermek.

Kullanıcıya, anotasyonların sadece framework’lerde veya hazır kütüphanelerde değil, kendi projelerimizde de nasıl kullanılabileceğini öğretmek.

Reflection kavramının, çalışma zamanında bilgileri nasıl dinamik hale getirdiğini örneklemek.

Ve en önemlisi, öğrenciler için soyut kalabilecek bir konuyu, somut ve anlaşılır bir örnek ile öğrenilebilir hale getirmek.

🌟 Sonuç

Bu proje, Java’da anotasyon ve reflection kavramlarını öğrenmek isteyenler için küçük ama etkili bir örnektir.

🏷️ Anotasyonlar sayesinde kod daha açıklayıcı ve yönetilebilir hale gelmiştir.

🔎 Reflection sayesinde, çalışma anında ek bilgiler okunarak dinamik bir davranış sağlanmıştır.

👨‍💻 Kullanıcı etkileşimi ile konunun pratik tarafı güçlendirilmiştir.

Kısacası, bu proje Java’nın güçlü soyutlama araçlarından biri olan anotasyonların, çalışma zamanında reflection ile nasıl kullanılabileceğini gözler önüne serer.
