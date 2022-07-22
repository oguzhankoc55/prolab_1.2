# Prolab1 2. Proje

# Sporcu Kart Oyunu

# Özet

Bir oyuncunun bilgisayara karşı oynayabileceği bir kart oyunu tasarlandı.Tasarladığımız oyunda toplamda 16 kart bulunmaktadır.Bu kartların 8’i kullanıcıya kalan 8 tanesi de bilgisayara dağıtıldı.Kullanıcı ve bilgisayara 4 futbolcu ve 4 basketbolcu kartı verildi.Futbolcu kartlarının penaltı,frikik ve karşı karşıya olmak üzere 3 özelliği bulunmaktadır.Basketbolcu kartlarınında ikilik,üçlük ve serbest atış olmak üzere üç özelliği bulunmaktadır.Kullanıcı ve bilgisayar sırasıyla kart seçimi yapar.Hamleler ardışık sırayla bir futbolcu bir basketbolcu kartı olmak üzere devam eder.Seçilen kartlar ortaya gelir ve hangisinin özelliği daha yüksek ise o oyuncunun skoru 10 puan arttırılır.En sonunda hangi oyuncunun puanı daha yüksek ise o oyuncu oyunu kazanır.

# 1- GİRİŞ
Projemize öncelikle sporcu,futbolcu,basketbolcu,oyuncu,kullanıcı,bilgisayar ve test classlarımızı yazarak başladık.Futbolcu ve basketbolcuların özelliklerini
tanımladık.Tanımladığımız özellikleri test classımızda arraylistlerin içinde tuttuk.Test classımızın içinde kartlarımızı kullanıcı ve bilgisayar oyuncularımıza rastgele dağıttık.Sonrasında açtığımız oyun classımız da bu arraylistler sayesinde gerekli karşılaştırmaları yaptık.Karşılaştırmalarımız yaparken oyuncu, kullanıcı ve bilgisayar classlarımızın içinde bulunan skorları tutmamıza yarayan özellikleri ve metodları kullandık.Ve son olarak yaptığımız tüm bu hesaplamalarımızı oyun jframe’mizde gösterdik.Projemizin yazımında “Java” dili tercih edilmiştir.

# 2- TEMEL BİLGİLER

Bu proje Java programlama dilinde geliştirilmiş olup,geliştirme ortamı olarak ise ”Eclipse IDE for Java Devlopers-2020-09” kullanılmıştır.Projemize başlarken ilk olarak yol
haritamızı çıkardık.Projenin isterlerini analiz edip bu isterler üzerine araştırmalar yaptık.Grup içinde belli iş bölümleri yapılmış olup gerekli bilgileri elde ettikten sonra projemizin ana
hatlarıyla bitirdik.Geriye sadece ufak tefek hataların saptanıp çözümlerimizi yaptıktan sonra derleyici ortamında ilk admları atmış olduk.Proje yaklaşık 16 gün gibi bir sürede ana
hatlarıyla birlikte bitmiş oldu.

# 3- YÖNTEM

Main classımız yardımıyla oyun classımıza geçiş yaptık.Sonrasında oyun class’ımızın içinde bulunan methotlar ve çağırdığımız classlar ile oyun classımız da belli başlı hesaplamaları yaptık.En başta da anlattığımız gibi test classımız sporcu,futbolcu ve basketbolcu classlarından belli özellikleri alıp belli atamaları yaptıktan sonra oyun classında kullanılmak üzere hazır hale getirdik.Oyun classımızda belli methotlarımızla hesaplama yaparken oyuncu,kullanıcı ve bilgisayar classlarımızda bize gereken işlemleri yaptırdık.Son olarak ise Eclipse üzerinde swing kütüphaneleri yardımıyla çizdirme işlemlerimizi yaptırdık.Swing kütüphaneleri yardımıyla buttonların özelliklerini fareyle tıklanması durumunda yaptırttığımız işlemler ile kartlar arasındaki değerlerin karşılaştırılmasını
sağladık.Son olarak ise karşılaştırılan değerlerin skora dökülmesi ile oyunu kimin kazandığını ekrana yadırdık.

# Projede kullanılan classlar :

## main: 
Bu classımız da bir arayüz ekranı açarız ve oyuncu start buttonuna tıklaması durumunda oyun classına aktarırız.Çıkış yapmak istemesi durumunda quit buttonuna
tıklayarak çıkış yapabilir.
## oyun:
Oyunumuzun arayüzünü oluşturduğumuz ve kullanıcının kartların seçimini yaptırttığımız classımızdır.Bu classımızda yapılan işlemlerle oyunun çalışması sağlanır.
## sporcu:
Sporcu classımız futbolcu ve basketbolcu classlarının kalıtım aldığı classımızdır.Burada kullanılan özellikler bu iki class da override edilerek kullanılır.
## futbolcu:
Sporcu classından aldığı ve kendi bünyesinde bulunan özellikler ile içinde bulunan her bir futbolcu kartının classına kalıtım sağlayan classımızdır.
## basketbolcu: 
Sporcu classından aldığı ve kendi bünyesinde bulunan özellikler ile içinde bulunan her bir basketbolcu kartının classına kalıtım sağlayan classımızdır.
## oyuncu:
Kullanıcı ve bilgisayar classları için kullanılması gereken özellikleri içinde barındırır.
## kullanıcı: 
Bu class ta oyuncu classımızda buluna ve kendi bünyesinde bulunan özellikler yardımıyla kullanıcının skor hesaplaması yapılır.Bu hesaplamaları oyun classımızda çağrılır ve kullanılır.
## bilgisayar: 
Bu class ta oyuncu classımızda buluna ve kendi bünyesinde bulunan özellikler yardımıyla bilgisayarın skor hesaplaması yapılır.Bu hesaplamaları oyun classımızda çağrılır ve kullanılır.
## test:
Özellikle futbolcu ve basketbolcu classlarının içinde sporcu kartlarının özelliklerini arraylistlerde tutup belli methotlar yardımıyla sporcuları karıştırıp başka bir arraylistte kullanmak üzere hazırlar.Bu classımızda ayrıca özelliklerin rastgele seçilmesinde kullanılan bir methodumuzda bulunmaktadır.

# 4- SÖZDE KOD

1- Program çalıştı.

2- Başlangıç ekranı oluştu

3- Start tuşuna basılması durumunda oyun jframe’e geçiş yapılır. (Quit tuşuna basılması durumunda oyundan çıkılır).(EK-1)

4- Geçiş yapılan oyun jframe’inde oyun ekranı olusturulur (EK-2).

5- kulanıcının ve bilgisayarın kartları dağıtılır.

6- Ekranda yazıldığı şekilde kullanıcı önce futbolcu sonra baketbolcu kartlarını fare yardımıyla seçmeye başlar.(EK-5)

7- Eğer sıra futbocudaysa futbolcu kartları basketbolcudaysa basketbolcu kartları seçtirtilir.

8- Kullanıcınını fareyle kartı seçmesi istenir.

9- seçilen kart ve karşı takımda seçilen kartın görünürlüğü kapatılır.

10- Kullanıcı kartı seçtikten sonra oyun jframe’inde seçilen kart grubu kullanıma kapatılır ve diğer grup kullanıma açılır.

11- Öncelikle kartın kendi bünyesinde bulunan üç temel özellikten biri rastgele seçilir.

12- Seçilen özelliklerden sonra hangi kartın özelliği daha fazlaysa o kartın sahibi olan oyuncu skor hanesine +10 puan ekler.(EK-3,EK-4).

13- Bu işlemler kartlar bitene kadar devam eder.

14- En son sonucu bulmak için hangi kartın son tıklandığını bulan algoritma sayesinde oyuncuları son skorları bulunur.

15- Skorlar arasında kıyaslama yapılarak hangi oyuncunun kazandığı veya durumun berabere olduğu ekrana yazdırılır. (EK-6).

16- Program sonlanır.

# 5- KÜTÜPHANELER

javax.swing.ImageIcon 

javax.swing.JFrame 

javax.swing.JPanel 

javax.swing.border.EmptyBorder 

javax.swing.JLabel 

javax.swing.JButton

java.awt.event.ActionListener 

java.awt.event.ActionEvent 

java.util.ArrayList 

java.util.Random 

javax.swing.JTextPane

java.awt.Font

# 6- UML DİAGRAMI

![image](https://user-images.githubusercontent.com/58952369/180416763-b8bb1fd9-ff6b-4e07-8c17-5d7d35687611.png)


# 7- KAYNAKÇA

https://www.youtube.com/playlist?list=PLHfYetw_BGF-Gm_MsqKApw5nHPuHsytr3 

https://www.youtube.com/playlist?list=PLEcJSEQK_cD5KHgg9sXumeg659hAr2j4W 

https://stackoverflow.com

https://geeksforgeeks.com 

https://edestek.kocaeli.edu.tr 

https://creately.com/
