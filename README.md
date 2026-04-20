<h1> --OBSERVATION QUESTION-- </h1>
1. What is the root node in this program?
<br>--> Start Build
<br>
<br>2. Which nodes are leaf nodes?
<br>--> Dalam kode saya seperti Leather Jerkin, Magic Resistance Cloak, Vitality Crystal, Healing Necklace, Hero's Ring, dan Expert Gloves. Tapi dalam kode tersebut ada banyak dari leaf node tersebut yang masih punya branch, tetapi itu bukan branch melainkan hanya untuk menghubungkan print kesamping. Contoh saya menyambungkan semua ke parent node, nanti output nya begini :
<br>Parent Node -> A
<br>Parent Node -> B
<br>Parent Node -> C
<br>Dan kalau di baca, itu seperti item parent yang sama bisa di bikin dengan 1 item yang berbeda. Lebih baik jika tersambung seperti : 
<br>Parent Node -> A, B, C
<br>
<br>3. Why is children stored as a List<ItemNode> instead of a single variable?
<br>--> children disimpan sebagai List<ItemNode> karena dalam struktur tree, setiap node tidak hanya memiliki satu anak, tetapi bisa memiliki banyak cabang sekaligus. Jika hanya menggunakan satu variabel ItemNode, maka node hanya bisa terhubung ke satu child saja sehingga strukturnya menjadi linear seperti linked list, bukan tree. Dengan menggunakan List<ItemNode>, satu item (node) seperti “Fleeting Time” bisa memiliki beberapa bahan atau turunan sekaligus, misalnya “Hero’s Ring” dan “Expert Gloves”, sehingga struktur menjadi bercabang dan sesuai dengan konsep tree yang sebenarnya.
<br>
<br>4. What is the difference between a linear structure and a tree structure in this example?
<br>Pada linear structure, setiap node hanya terhubung ke satu node berikutnya seperti rantai. Semisalnya Fleeting Time → Hero’s Ring → Expert Gloves dalam satu jalur lurus tanpa percabangan. Struktur ini sederhana, tetapi tidak bisa merepresentasikan banyak bahan atau jalur build secara fleksibel.

Sedangkan pada tree structure, satu node bisa memiliki banyak child sehingga membentuk cabang-cabang. Seperti pada kode ini, Fleeting Time bisa memiliki beberapa bahan sekaligus seperti Hero’s Ring, Hero’s Ring lagi, dan Expert Gloves dalam satu waktu. Ini membuat struktur lebih mirip “pohon”, di mana satu item bisa bercabang ke banyak komponen, dan setiap cabang bisa terus bercabang lagi. Jadi, tree structure lebih cocok untuk menggambarkan sistem build item yang kompleks dan memiliki banyak kemungkinan kombinasi.
<br>
<br>5. How does recursion help when working with trees?
<br>--> Rekursi membantu dalam tree karena setiap node memiliki struktur yang sama (bisa punya child yang juga node), sehingga satu fungsi bisa dipakai ulang untuk semua level. Fungsi akan memproses node saat ini lalu memanggil dirinya sendiri untuk setiap child, sehingga bisa menjelajahi seluruh cabang tanpa perlu loop bertingkat manual. Ini membuat operasi tree seperti search, print, dan hitung jadi lebih sederhana dan rapi.
<br>
<br>6. What path is printed when searching for Corrosion Scythe?
<br>--> Dalam kode saya tidak ada Corrosion Scythe karena saya memilih item kategori DEFENSE. Jadi untuk path saya akan menggunakan salah satu item contoh seperti Guardian Helmet. Path saat mencari Guardian Helmet adalah Start Build --> Guardian Helmet, Child dan Children Node dari “Guardian Helmet” tidak muncul saat mencari path karena fungsi findPath() hanya menampilkan jalur dari root sampai node yang dicari, lalu berhenti ketika target ditemukan, sehingga tidak melanjutkan ke child node setelahnya. Tapi Kenapa saat print dan user input "Guardian Helmet" muncul semua child dan children node nya? Saat menggunakan printTree() atau printSubTree(), semua child dari node tersebut akan ditelusuri dan ditampilkan karena fungsi tersebut memang dirancang untuk menjelajahi seluruh struktur ke bawah. Jadi, perbedaannya adalah findPath() fokus pada satu jalur menuju target, sedangkan print fokus pada seluruh cabang di bawah node tersebut.
<br>
<h1> --Result of Practice Tasks-- </h1>
![Screenshot 1](https://github.com/Jeayam/DS-MLBB-JonathanAdrielLivanno/blob/fd9e3e63570e8a8d1d21593202af28ea4b40e63b/src/ouput_screenshot/Screenshot1.png)
<br>![Screenshot 1](OutPut_Screenshot/Screenshot2.png)
<br>
<h1> --REFLECTION-- </h1>
1. Why is a tree more suitable than an array for representing item purchase possibilities?
<br>--> Tree lebih cocok daripada array karena tree bisa merepresentasikan hubungan bercabang antara item dan bahan-bahannya, sedangkan array hanya menyimpan data secara linear tanpa struktur hierarki.
<br>
<br>2. What part of this lab helped you understand recursion better?
<br>--> Bagian yang paling membantu memahami rekursi adalah saat melakukan traversal seperti printTree() dan findPath(), karena terlihat bagaimana fungsi memanggil dirinya sendiri untuk setiap child sampai ke level terdalam.
<br>
<br>3. What challenges did you face when tracing the tree structure?
<br>--> Tantangan utama saat menelusuri tree adalah memahami alur rekursi yang naik-turun antar node dan melacak jalur mana yang sedang dieksekusi saat proses berjalan di banyak cabang sekaligus.