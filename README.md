# Soal praktek

1. Buatlah project dengan springboot untuk membuat aplikasi dengan tema e-commerce (Toko online)
2. Ketentuan minimal system yang harus di handle
    - Master data toko
    - Master data produk
    - Transaksi Penjualan (Flow transaksi bebas)
    - Master pelanggan

# Soal teori

1. Apa fungsi Hibernate ORM dan jelaskan mengapa?
Jawab :
fungsi nya adalah sebagai transformasi persistence data dari
sebuah representasi data (relational database) ke sebuah representasi data yang lain (java object) dalam artian persistence memperbolehkan sebuah objek untuk bisa tetap ada diluar proses aplikasi yang membuatnya. State dari objek tersebut disimpan pada datastore dan objek dengan state yang sama suatu saat dapat dibuat kembali jika aplikasi dijalankan lagi.

2. Jelaskan menurut pendapat anda dari beberapa fungsi annotation di hibernate seperti berikut:
    - ```@Entity```
    berfungsi untuk mendeklarasikan kelas sebagai sebuah entitas
    - ```@Table```
    berfungsi untuk menyatakan bahwa akan dibuat sebuah tabel
    - ```@Column```
    berfungsi untuk menentukan detail kolom dari sebuah tabel
    - ```@OneToOne```
    berfungsi untuk menghubungkan antara dua tabel dimana kedua tabel harus dikaitkan satu sama lain berdasarkan hanya pada satu baris yang cocok
    - ```@ManyToOne```
    berfungsi untuk menghubungkan antara dua tabel dimana dimana objek dapat dikaitkan dengan banyak obejek. Seperti objek alamat yang sama dapat dikaitkan dengan beberapa objek karyawan.
    - ```@OneToMany```
    berfungsi untuk menghubungkan antara dua tabel dimana satu baris dari satu tabel dapat memiliki beberapa baris yang cocok di tabel lain.
    - ```@JoinColumn```
    berfungsi untuk menggabungkan antara kolom melalui atribut unique yang berada di dalamnya.
    - ```@JoinTable```
    berfungsi untuk menggabungkan antara tabel yang satu ke tabel yang lain
    - ```@GeneratedValue```
    berfungsi untuk menetapkan pengenalan entitas secara otomatis.
3. Jelaskan menurut pendapat anda mengenai Dependency injection di springframework?
Jawab :
Dependency injection adalah suatu gaya pengkodean yang berakar pada pengamatan bahwa obejek biasanya merupakan pola desain yang lebih berguna daripada pewarisan objek.

4. Jelaskan menurut pendapat anda mengenai container / context di spring framework?
Jawab : 
Container / context adalah sebuah inti dari spring framework yang berfungsi untuk membuat objek, menyatukan, mengonfigurasi,dan mengelola siklus dari Create sampai Delete

5. Jelaskan menurut pendapat anda fungsi dari beberapa fitur annotation di spring frameork seperti berikut:
    - ```@ComponentScan```
    berfungsi sebagai sebuah pemindai terhadap sebuah package
    - ```@Autowired```
    berfungsi sebagai penanda konstruktor, bidang atau metode konfigurasi yang diotomasi
    - ```@Bean```
    berfungsi sebagai tulang punggung aplikasi
    - ```@Component```
    berfungsi sebagai stereotip umum untuk setiap komponen yang dikelola oleh spring
    - ```@Repository```
    berfungsi sebagai perangkum penyimpanan, pengambilan, dan pencarian dari database relasional
    - ```@Service```
    befrungsi sebagai tempat semua DAO dan logika bisnis
    - ```@Controller```
    berfungsi sebagai penanganan permintaan web
    - ```@RestController```
    berfungsi untuk menandai sebuah kelas dalam pembuatan beans
    - ```@RequestMapping```
    berfungsi untuk memetakan permintaan HTTP ke metode pengendali yaitu MVC dan REST
    - ```@GetMapping```
    berfungsi untuk menangani permintaan mendapatkan HTTP
    - ```@PostMapping```
    berfungi untuk menangani permintaan HTTP POST
    - ```@PutMapping```s
    berfungsi untuk menangani permintaan put HTTp
    - ```@DeleteMapping```
    berfungsi untuk menangani permintaan penghapusan HTTP

## Cara mengerjakan

- Fork repository ini, kemudian setelah di fork, clone ke local komputer anda.
- Setelah selesai silahkan di push ke repository masing-masing.
- Selamat mengerjakan :) & good luck
