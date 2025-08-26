<h1 align="center">
  🚀 Java Annotations & Reflection Projesi
</h1>
<p align="center">
  <img src="https://img.shields.io/badge/Java-100%25-blue?style=for-the-badge&logo=java" alt="Java Badge"/>
</p>

<p align="center">
  <b>Java'da özel anotasyonlar (custom annotations) ve reflection ile dinamik programlama!</b><br>
  <i>Kodunuzu daha anlamlı, esnek ve güçlü hale getirmek için pratik bir örnek.</i>
</p>

---

## 🏷️ Anotasyon (Annotation) Nedir?

> <b>Anotasyonlar</b>, Java'da kodun kendisine ek bilgiler (metadata) eklememizi sağlayan etiketlerdir.<br>
> Derleme veya çalışma zamanında bu bilgilere erişerek programın davranışını değiştirebiliriz.

---

## ✨ Projede Kullanılan Özel Anotasyonlar

<table align="center">
  <tr>
    <th>Anotasyon</th>
    <th>Açıklama</th>
  </tr>
  <tr>
    <td><code>@DatabaseConf</code></td>
    <td>Veritabanı bağlantı detaylarını (URL, kullanıcı adı, şifre vb.) tanımlar.</td>
  </tr>
  <tr>
    <td><code>@Birim</code></td>
    <td>Kullanıcının girdiği boy ve kilo verilerine birim (metre, kilogram) ekler.</td>
  </tr>
</table>

---

## 🔎 Reflection Nedir?

<b>Reflection</b>, bir programın çalışma zamanında kendi yapısını (sınıflar, metotlar, alanlar) incelemesine ve değiştirmesine olanak tanıyan güçlü bir Java özelliğidir.

### Bu projede Reflection ile:

- <b>@DatabaseConf</b> anotasyonu sınıftan okunur.
- <b>@Birim</b> anotasyonu metottan alınır ve ilgili birimler belirlenir.
- Program, dinamik olarak farklı durumlara uyum sağlar.

---

## 🗂️ Proje Akışı: Adım Adım

<ol>
  <li>
    <b>Sınıfa Anotasyon Ekleme:</b>
    <br>
    <code>AnnotationInvoker</code> sınıfının üzerine <code>@DatabaseConf</code> anotasyonu eklenir.
  </li>
  <li>
    <b>Anotasyonu Okuma:</b>
    <br>
    Reflection API ile anotasyon bulunup veritabanı bilgileri ekrana yazdırılır.
  </li>
  <li>
    <b>Metoda Anotasyon Ekleme:</b>
    <br>
    <code>write</code> metodunun üzerine <code>@Birim</code> anotasyonu eklenir.
  </li>
  <li>
    <b>Kullanıcı Etkileşimi:</b>
    <br>
    Kullanıcıdan boy ve kilo değerleri alınır.
  </li>
  <li>
    <b>Sonuçların Sunulması:</b>
    <br>
    Reflection ile anotasyondan birimler okunur ve kullanıcıya gösterilir.
  </li>
</ol>

---

## 💡 Örnek Kullanım

<div align="center">

| Girdi (Kullanıcı) | Çıktı (Ekran)     |
|:-----------------:|:-----------------:|
| 1.80 ve 75        | Boy: 1.8 <b>M</b> <br> Kilo: 75 <b>KG</b> |

</div>

---

## 🎯 Projenin Amacı ve Kazanımları

- ✅ Java'nın soyut ve güçlü özelliklerini anlaşılır bir örnekle göstermek
- ✅ Kendi anotasyonlarımızı nasıl yazabileceğimizi öğrenmek
- ✅ Reflection'ın dinamik programlamadaki rolünü kavramak
- ✅ Yönetilebilir ve okunaklı kod yazma pratiğini güçlendirmek

---

## 📦 Kullanılan Teknolojiler

<p align="center">
  <img src="https://img.shields.io/badge/Java-100%25-blue?style=for-the-badge&logo=java" alt="Java"/>
</p>

---

## 📝 Sonuç

<p align="center">
  Bu demo, <b>anotasyon</b> ve <b>reflection</b> kavramlarının programlama dünyasındaki pratik önemini vurgulayan, sade ama etkili bir örnektir.<br>
  <i>Daha esnek, anlaşılır ve yönetilebilir Java projeleri için siz de kendi anotasyonlarınızı yazmayı deneyin!</i>
</p>
