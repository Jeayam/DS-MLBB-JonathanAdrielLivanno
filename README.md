<h1>Observation Questions :</h1>
<br>1. What is the root node in this program?
<br>--> Start Build
<br>
<br>2. Which nodes are leaf nodes?
<br>--> Dalam kode saya seperti Leather Jerkin, Magic Resistance Cloak, Vitality Crystal, Healing Necklace, Hero's Ring, dan Expert Gloves. Tapi dalam kode tersebut ada banyak dari node tersebut yang masih punya branch, tetapi itu bukan branch melainkan hanya untuk menghubungkan print kesamping. Contoh saya menyambungkan semua ke parent node, nanti output nya begini :
<br>Parent Node -> A
<br>Parent Node -> B
<br>Parent Node -> C
<br>Dan kalau di baca, itu seperti item parent yang sama bisa di bikin dengan 1 item yang berbeda. Lebih baik jika tersambung seperti : 
<br>Parent Node -> A, B, C
<br>
<br>3. Why is children stored as a List<ItemNode> instead of a single variable?
What is the difference between a linear structure and a tree structure in this example?
How does recursion help when working with trees?
What path is printed when searching for Corrosion Scythe?
s
Why is a tree more suitable than an array for representing item purchase possibilities?
What part of this lab helped you understand recursion better?
What challenges did you face when tracing the tree structure?