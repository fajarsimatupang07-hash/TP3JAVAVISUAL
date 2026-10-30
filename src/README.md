# Character Manager — TP3 (Java Visual SIH-6406)

## Deskripsi Singkat
Aplikasi berbasis Java konsol ini dirancang sebagai fondasi model class untuk manajemen karakter game (Character Manager). Proyek ini menerapkan konsep Object-Oriented Programming (OOP) seperti enkapsulasi, penggunaan constructor overloading, enum, serta validasi atribut secara ketat.

## Screenshot Output Terminal
[alt text](image.png)
```bash
[Contoh Tampilan Output Terminal]
=== DATA KARAKTER AWAL ===
Character{name='Arthas', type=WARRIOR, level=1, hitPoints=100, attackPower=20, mana=30, isAlive=true}
...
https://docs.google.com/document/d/15tznjK5KhScaTC756uG_VeQPY745pMouZWlfko9QqXY/edit?usp=sharing


# Character Manager — TP5 (Java Visual SIH-6406)

## Deskripsi Singkat
Aplikasi berbasis Java ini merupakan pengembangan Sprint #2 (TP5) untuk **Character Manager**. Pada versi ini, aplikasi dilengkapi dengan manajemen koleksi `List<Character>`, penanganan duplikasi nama karakter, pengecekan objek referensi, pemenuhan prinsip enkapsulasi (*Defensive Copy*), fitur analitik rata-rata level, filter tipe karakter, serta pencarian karakter terkuat.

---

## Fitur & Analitik Mandiri (Bagian C)
* **Fitur Mandiri:** `findStrongestCharacter()`
* **Deskripsi:** Method ini memindai seluruh karakter di dalam daftar dan mengembalikan objek `Character` yang memiliki nilai `attackPower` tertinggi.
* **Rasional Desain & Enkapsulasi:** Method ini mengembalikan objek karakter terkuat secara opsional tanpa mengekspos list internal `characterList`, sehingga enkapsulasi tetap terjaga dengan aman.

---

## Screenshot Output Terminal
*(![alt text](image-1.png))

---

## Struktur Folder Project
```text
javavisual-tp5-[253303621268]/
└── CharacterManager/
    └── src/
        └── com/
            └── unpri/
                └── charactermanager/
                    ├── model/
                    │   ├── Character.java
                    │   ├── CharacterManager.java
                    │   └── CharacterType.java
                    └── Main.java
                    
****************https://docs.google.com/document/d/1EIJS8eMNeiLUt4lro79V67FLvGUWUX4Ye0rOyS_x-Xg/edit?usp=sharing

## TP8 — Character Manager Sprint #3 (GUI & MVC)

### 1. Screenshot MainWindow
*(![alt text](image-2.png))

### 2. Alur Data (Main → CharacterManager → MainWindow) dalam Konsep MVC
* **Model (`Character` & `CharacterManager`):** Menyimpan data mentah, daftar karakter, serta logika bisnis seperti perhitungan rata-rata level.
* **Controller (`Main`):** Menginisialisasi data objek, menyusun manager, serta memicu pembuatan tampilan GUI secara aman menggunakan `SwingUtilities.invokeLater`.
* **View (`MainWindow`):** Mengambil data secara dinamis dari Model (melalui perantara manager) menggunakan perulangan *loop*, lalu merender komponen visual ke layar pengguna tanpa mengubah data aslinya.

### 3. Daftar Karakter Baru & Alasan Pemilihan Tipe/Level
* **Arthas (WARRIOR - Level 3):** Dipilih sebagai petarung garis depan dengan HP tinggi.
* **Jaina (MAGE - Level 4):** Penyihir dengan kapasitas Mana besar dan serangan sihir tinggi.
* **Thrall (WARRIOR - Level 2):** Karakter pejuang pendukung dengan statistik seimbang.
* **Sylvanas (ARCHER - Level 5):** Pemanah tingkat lanjut dengan ketangkasan dan attack power tinggi.
* **Illidan (ASSASSIN - Level 6):** Karakter level tertinggi dengan attack power paling mematikan.

### 4. Link Google Docs Analisis GUI & MVC (Bagian D)
* [Link Google Docs TP8 Analisis GUI & MVC](https://docs.google.com/document/d/1pAwStmnKpCy0FHq3qnMg_73EXeotQkbfwwg4EJBbzys/edit?usp=sharing)