# 1. Data, Variabel, Operator JAVA

```
~$ javac FileName.java ---> untuk men-compile program
~$ java FileName ---> untuk run program
```

## Data
```
* char: Tipe data karakter, contoh Z
* int: angka atau bilangan bulat, contoh 29
* float: bilangan desimal, contoh 2.1
* double: bilangan desimal juga, tapi lebih besar kapasistanya, contoh 2.1
* String: kumpulan dari karakter yang membentuk teks, contoh Hello World!
* boolean: tipe data yang hanya bernilai true dan false
```
```java
// membuat variabel kosong bertipe integer
int namaVariabel;

//Membuat variabel bertipe integer dan langsung diisi nilai:
int namaVariabel = 19;

//Membuat sekumpulan variabel yang tipe datanya sama:
int a, b, c;
```
```
Contoh:
```
<p align="center">
  <img src="/img/data.png">
</p>

---

## Variable
```
Aturan Penulisan Variabel
Ternyata tidak boleh sembarangan dalam membuat variabel.

Ada aturan yang harus diikuit, diantaranya:

* Nama variabel tidak boleh menggunakan kata kunci dari Java (reserved word) seperti if, for, switch, dll.
* Nama variabel boleh menggunakan huruf, angka (0-9), garis bawah (underscore), dan symbol dollar ($), \
  namun penggunaan garis bawah dan symbol lebih baik dihindari.
* Nama variabel harus diawali dengan huruf kecil, karena Java menggunakan gaya CamelCase.
* Apabila nama variabel lebih dari 1 suku kata, maka kata ke-2 dituliskan dengan diawali dengan huruf        besar dan seterusnya, contoh namaVariabel.
```

## Operator

```
1. Operator Aritmatika

Operator aritmatika digunakan untuk melakukan operasi aritmatika.

Operator ini terdiri dari:

Nama	    Simbol
Penjumlahan	 +
Pengurangan	 -
Perkalian	 *
Pembagian	 /
Sisa Bagi	 %

Contoh:
```
<p align="center">
  <img src="/img/operator.png">
</p>

---
```
2. Operator Penugasan

Operator penugasan (Assignment Operator) fungsinya untuk meberikan tugas pada variabel tertentu. Biasanya untuk mengisi nilai.

Variabel a ditugaskan untuk menyimpan nilai 10.

Operator Penugasan terdiri dari:

Nama Operator	            Sombol
Pengisian Nilai            	=
Pengisian dan Penambahan	+=
Pengisian dan Pengurangan	-=
Pengisian dan Perkalian	        *=
Pengisian dan Pembagian 	/=
Pengisian dan Sisa bagi 	%=

Contoh:
```
<p align="center">
  <img src="/img/operator2.png">
</p>

---

```
3. Operator Pambanding

Sepeti namanya, tugas oprator ini untuk membandingkan.

Operator ini juga dikenal dengan opeartor relasi.

Nilai yang dihasilkan dari operator ini berupa boolean, yaitu: true dan false.

Operator ini terdiri dari:

Nama	                Simbol
Lebih Besar	            >
Lebih Kecil	            <
Sama Dengan	            ==
Tidak Sama dengan	    !=
Lebih Besar Sama dengan	    >=
Lebih Kecil Sama dengan	    <=

Contoh: 
```
<p align="center">
  <img src="/img/operator3.png">
</p>

---

# 2. Struktur dan Kontrol di JAVA

```
Struktur kontrol adalah blok pemrograman yang menganalisis variabel dan memilih arah yang akan didasarkan pada parameter yang diberikan.
Oleh karena itu proses pengambilan keputusan dasar dalam komputasi, flow control menentukan bagaimana komputer akan merespon ketika diberikan kondisi dan parameter tertentu.

* Pernyataan Kondisi
1. IF THEN
Dalam pemrograman, sering mengeksekusi bagian kode tertentu berdasarkan kondisi yang ditentukan, dimana TRUE atau FALSE (yang hanya diketahui selama waktu berjalan). 
Struktur Penulisan Kondisi IF di Java adalah :

```
```java
// IF THEN
if (ekspresi) {
    // pernyataan
}
```
```
Contoh:
```
<p align="center">
  <img src="/img/ifthen.png">
</p>

---
```
2. IF ELSE
Struktur Penulisan Kondisi IF ELSE di Java adalah :
```
```java
if (ekspresi) {
    // pernyataan Benar
}else{
    // Pernyataan Salah
}
```
```
Contoh:
```
<p align="center">
  <img src="/img/ifelse.png">
</p>

---
```
3. Kondisi Nested IF (Bersarang)
Kondisi dimana dalam kondisi IF ada kondisi lagi. Kondisi Nested IF Hampir sama seperti pada Kondisi IF ELSE.

```
# 3. Struktur Pengulangan di JAVA 
```
Perulangan/Loop
1. Kondisi For
Pada Struktur ini anda akan menjalankan blok program beberapa kali, dimana pernyataan yang dieksekusi secara berurutan. Pernyataan pertama dalam fungsi dijalankan pertama, diikuti oleh yang kedua, dan seterusnya.

Struktur Penulisan Kondisi Perulangan FOR
```
```java
for(inisial; kondisi ; increment/decrement)
{
   pernyataan();
}
```
```
Contoh:
```
<p align="center">
  <img src="/img/forloop.png">
</p>

---
```
2. Kondisi Nested For (Bersarang)

Contoh:
```
<p align="center">
  <img src="/img/fornested.png">
</p>

---
# 4 . Array
```
Array adalah sebuah variabel yang bisa menyimpan banyak data dalam satu variabel.
Array menggunakan indeks untuk memudahkan akses terhadap data yang disimpannya.
```
```java
// Cara penulisan
String[] nama;
// atau
String nama[];
// atau
String[] nama = {"Bayu", "Bagas", "Budi", "Andi"};
                //  0       1       2        3   ....
//cara mengambil variabel pada array
System.out.println(nama[2]);

// Output = Budi
// karena penghitungan dimulai dari 0 bukan 1
// jadi nama[0] = Bayu
// jadi nama[1] = Bagas
// jadi nama[2] = Budi
// jadi nama[3] = Andi
```
```
Contoh:
```
<p align="center">
  <img src="/img/array.png">
</p>

---

# 5. Membuat Class Pada JAVA
```
Dalam Pemrograman Berorientasi Object, Class adalah struktur terdefinisi yang terdiri dari method dan variable. Secara garis besar ada 2 bagian utama pada sebuah class Java, yaitu class declaration dan class body. Class Declaration mendefinisikan nama kelasa dan atributnya, sedangkan class body mendeklarasikan variabel dan method. Objek adalah instansiasi dari sebuah Class

Deklarasi Class Body pada Java

Class body merupakan bagian dari kelas yang mendeklarasikan kode-kode program Java yang bisa dibedakan menjadi 3 bagian utama dari sebuah kelas yaitu:

* Constructor (Konstruktor) : untuk digunakan ketika terjadi inisialisasi objek
* Variable : sebagai variabel yang digunakan.
* Method (fungsi)

Deklarasi Konstruktor pada Class Java

Konstruktor digunakan saat melakukan instansiasi sebuah obejct yang menggunakan kelas yang bersangkutan. Keberadaan konstruktor dalam sebuah kelas Java bersifat opsional. Nama dari konstruktor haruslah sama dengan nama kelasnya.Coba perhatikan contoh berikut ini :
```
```java
public Mobil(){
    this.transmisi="Manual";
    this.merk="Toyota";
    this.roda=4
}
public Mobil(String t, String m, int r){
    this.transmisi= t;
    this.merk= m;
    this.roda= r;
}
```
```
Contoh penggunaan class:
```
<p align="center">
  <img src="/img/class.png">
</p>

---
# 6. Method pada JAVA
```
Metode adalah blok kode yang hanya berjalan ketika dipanggil.
Anda dapat mengirimkan data, yang dikenal sebagai parameter, ke dalam suatu metode.
Metode digunakan untuk melakukan tindakan tertentu, dan mereka juga dikenal sebagai fungsi.
Mengapa menggunakan metode? Untuk menggunakan kembali kode: tentukan kode sekali, dan gunakan berkali-kali.

1. Panggil Metode
Untuk memanggil metode di Jawa, tulis nama metode diikuti oleh dua tanda kurung () dan tanda titik koma;
Dalam contoh berikut, myMethod () digunakan untuk mencetak teks (tindakan), ketika dipanggil:

```
```java
public class MyClass {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "I just got executed!"
```
# 7. Stream & File di JAVA
```
stream adalah aliran data yang bisa Anda baca, atau Anda bisa menulis.
Ini digunakan untuk melakukan operasi baca dan tulis dalam file secara permanen. Java menggunakan stream untuk melakukan tugas-tugas ini. stream juga disebut File Handling, atau File. Ini tersedia dalam paket java.io.

Input Streams: Input stream digunakan untuk membaca data dari berbagai perangkat input seperti keyboard, file, jaringan, dll.

Output Streams: Output stream digunakan untuk menulis data ke berbagai perangkat output seperti monitor, file, jaringan, dll.

Contoh Input stream:
```
<p align="center">
  <img src="/img/readfile.png">
</p>

---

```
Contoh output stream:
```

<p align="center">
  <img src="/img/writefile.png">
</p>

---

# 8. GUI

```
Graphic User Interface (GUI) adalah pemrograman dengan bahasa Java yang dibuat menggunakan aplikasi yang berbasiskan GUI. Tujuannya adalah menambahkan beberapa komponen yang tidak bisa dibuat dalam basis text. Komponen – komponen tersebut bisa berupa tombol, gambar, dll. Tujuannya adalah untuk memudahkan user menggunakan program yang dibuat tersebut.

Kalau dilihat pengertian tentang GUI secara umum adalah Interaksi yang dapat dilaksanakan oleh user melalui menu dan icon yang diperlihatkan dalam modus grafik. Contoh implementasi GUI-based shell ini adalah pada sistem operasi Microsoft Windows. Berikut contoh program dengan menggunakan Java GUI :

Sebelum membuat sebuah aplikasi Java GUI ini, harus mengetahui cara tata letak layout yang baik dan benar. Berikut adalah beberapa tipe – tipe layout pada Java GUI antaralain

*Flow Layout
Menyusun komponen berdasarkan ukuran default masing-masing, dengan posisi mulai dari kiri ke kanan dan dari atas ke bawah di dalam container yang digunakan.

*Grid Layout
Membagi komponen dalam bentuk “rectangular grid”.

*Border Layout
Mengisi sebuah daerah yang berisi komponen-komponen yang berbeda pada waktu yang berbeda.

*Card Layout
Layout Manager ini juga melibatkan penumpukkan frame dalam permintaan yang cocok, saat memanggil fungsi Berikutnya, kerangka yang telah ditambahkan dalam urutan setelah frame yang sedang ditampilkan adalah frame berikutnya.

*Grid Bag Layout
Merupakan salah satu tata letak penyedia tata ketak komponen GUI pada java yang paling flexibel dan kompleks. Sehingga ini dapat mmungkinkan agi programer untuk mengatur tata letak komponen GUI dalam beberapa span baris atau kolom.  GridBagLayout menempatkan komponen dalam bentuk empat persegipanjang (sel)

*Container
Merupakan sebuah kelas yang digunakan untuk sebagai tempat atau wadah dalam penataan komponen GUI layout management.

Contoh: 
```

<p align="center">
  <img src="/img/gui.png">
</p>

---
