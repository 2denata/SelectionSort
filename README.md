
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) 

# Selection Sort

Algoritma ini merupakan pengurutan sederhana yang bekerja dengan cara membagi array menjadi dua bagian: bagian yang sudah diurutkan dan bagian yang belum diurutkan. Algoritma ini secara berulang menemukan elemen terkecil (atau terbesar, tergantung pada urutan) dari bagian yang belum diurutkan, lalu menukarnya dengan elemen pertama dari bagian yang belum diurutkan. Proses ini diulangi hingga seluruh array berada dalam urutan yang benar.


# Kompleksitas

Selection Sort memiliki kompleksitas waktu O(n²), yang membuatnya kurang efisien untuk data dalam jumlah besar
# Pro & Cons
## Kelebihan
- Mudah dipahami dan diimplementasikan.
- Tidak memerlukan memori tambahan karena pengurutan dilakukan secara in-place.
- Lebih sedikit pertukaran dibandingkan Bubble Sort, sehingga sedikit lebih efisien dalam beberapa kasus.

## Kekurangan
- Kurang efisien untuk data dalam jumlah besar karena kompleksitas waktu O(n²).
- Tidak stabil karena elemen yang sama bisa berubah urutan relatifnya selama pengurutan.

# Demo

Misal ada sebuah array dengan variabel larik yang berisi {5, 8, 26, 15, 11, 31}, menggunakan pengurutan Selection Sort membutuhkan beberapa kali iterasi:

![image](https://github.com/user-attachments/assets/afd255b3-623e-4a2d-902b-79b4fa847a0e)
![image](https://github.com/user-attachments/assets/a6a5e085-43ee-488d-a288-8bf8f5449f7d)






