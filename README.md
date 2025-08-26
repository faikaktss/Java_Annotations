✨ Java Annotations & Reflection Demo
<p align="center"> <img src="https://cdn-icons-png.flaticon.com/512/1006/1006363.png" width="100" alt="Java Icon"/> </p>
📌 Proje Özeti

Bu proje, Java Annotations (özel anotasyonlar) ve Reflection API kullanarak çalışma zamanında (runtime) sınıflar ve metotlar üzerinde tanımlanan anotasyon bilgilerini okuma örneğini gösterir.

📍 Databaseconf → sınıf seviyesinde kullanılan bir anotasyon (url, username, password, port bilgilerini tutar).

📍 Birim → metot seviyesinde kullanılan bir anotasyon (boy ve kilo için birim bilgilerini tutar).

🔎 Reflection ile → çalışma zamanında sınıf ve metodların üzerinde tanımlı anotasyon bilgilerine erişilir ve ekrana yazdırılır.

🚀 Çalışma Mantığı
1️⃣ Databaseconf Anotasyonu
@Databaseconf(url="http://faikaktas.com", username="faik", password="123", port=3000)
public class AnnotationInvoker { ... }


➡️ Çalışma zamanı reflection ile bu anotasyon okunur ve bilgiler ekrana yazdırılır:

URL      : http://faikaktas.com
Username : faik
Password : 123
Port     : 3000

2️⃣ Birim Anotasyonu
@Birim(boy="M", kilo="KG")
public void write(double boy, double kilo) { ... }


➡️ Kullanıcıdan alınan boy ve kilo bilgileri, anotasyondaki birimlerle birlikte gösterilir:

Boyunuzu giriniz: 1.80
Kilonuzu giriniz: 75


Çıktı:

BOY   : 1.8 M
KİLO  : 75.0 KG

🛠️ Kullanılan Teknolojiler

☕ Java 8+

🔎 Reflection API

🏷️ Custom Annotations (@interface)

⌨️ Scanner (kullanıcıdan veri alma)

🎯 Proje Amacı

Bu proje, öğrenme amaçlı hazırlanmıştır:

Java’da kendi anotasyonlarımızı nasıl tanımlayacağımızı,

Çalışma zamanında reflection ile bu anotasyonlardan nasıl veri okuyacağımızı,

Kullanıcı girdileriyle nasıl dinamik çıktılar elde edilebileceğini göstermektedir.
