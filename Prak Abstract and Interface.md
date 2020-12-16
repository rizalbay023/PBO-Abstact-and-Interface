# Abstract-Class-and-Interface
1. Hasil dari Abstract Class "displayData" dan "sayDora" 
![AC1](https://user-images.githubusercontent.com/56226681/102002681-73c64e80-3d31-11eb-8093-14124bddf1af.png)

2. Hasil dari Abstract Class Seorang analyst membuat aplikasi simulasi permainan.
![Ac2](https://user-images.githubusercontent.com/56226681/102002682-7628a880-3d31-11eb-9abb-db042a471930.png)

3.Tuliskan dan Jelaskan perbedaan antara Abstract Class dan Interface

**Abstract Class**

Abstract class adalah class-class yang memiliki informasi abstrak dan metode-metode dari sekumpulan data. Abstract Class tidak bisa diubah dan  berlaku juga sebagai kerangka dalam penciptaan subclass-subclassnya.
Sebuah Abstract Classs memiliki informasi dan metode yang dapat diturunkan ke subclassnya, dan seluruh subclass akan mengikuti apa saja metode yang akan diturunkan oleh Abstract Class.

Kesimpulan:
* Saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract class.
* Abstract class artinya, class tersebut tidak bisa dibuat sebagai object secara langsung, hanya bisa diturunkan.
* Untuk membuat sebuah class menjadi abstract, kita bisa menggunakan kata kunci abstract sebelum kata kunci class.
* Dengan demikian abstract class bisa kita gunakan sebagai kontrak untuk class child.

**Interface** 

Interface adalah class yang tidak memiliki tubuh pada method-methodnya. Method interface tersebut harus diimplementasikan dalam kelas turunannya tidak boleh tidak. 
Di dalam interface, deklarasi variable memiliki atribut final sehingga bersifat absolut. 
Keyword final inilah yang menjadi keunikan sendiri bagi interface bahwa ouput dari bagian interface berupa final yang tidak diganti pada saat implementasi kecuali di override.

Kesimpulan :
* Sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk class child nya.
* Namun sebenarnya yang lebih tepat untuk kontrak adalah Interface
* Jangan salah sangka bahwa Interface disini bukanlah User Interface
* Interface mirip seperti abstract class, yang membedakan adalah di Interface, semua method otomatis abstract, tidak memiliki block
* Di interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant (field yang tidak bisa diubah)
* Untuk mewariskan interface, kita tidak menggunakan kata kunci extends, melainkan implements

**Difference Between Interface and Abstract Class**
![Abstract Class vs Interface](https://user-images.githubusercontent.com/56226681/101999529-b166af80-3d10-11eb-9fd9-857cce09761b.png)

4. Hasil dari Interface "sayDora" dan "dispKantungAjaib"
![I1](https://user-images.githubusercontent.com/56226681/102002683-77f26c00-3d31-11eb-8f87-0902ea0052ed.png)
