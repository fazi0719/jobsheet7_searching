public class MahasiswaBerprestasi06 {
   Mahasiswa06[] listMhs;
    int idx =0;

     public MahasiswaBerprestasi06(int jumlah) {
     listMhs = new Mahasiswa06[jumlah];
    }
    // METHOD dari pertemuan 6
    void tambah(Mahasiswa06 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh.");
        }
    }

    void tampil() {
        for (Mahasiswa06 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa06 temp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = temp;
                }
            }
        }
    }

    void SelectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa06 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void InsertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa06 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

   
    // Jobsheet 7: SEQUENTIAL SEARCH
    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break; 
            }
        }
        return posisi;
    }

   
    // TAMPIL POSISI
    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK :" +x+ "  ditemukan pada indeks " + pos);
        } 
        else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

  
    // TAMPIL DATA SEARCH
    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " +x+ " tidak ditemukan");
        }
    }
    // Jobsheet 7 - langkah 6.3.1: BINARY SEARCH (rekursif)
    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;          // hitung posisi tengah

            if (cari == listMhs[mid].ipk) {
                return mid;                     // CONQUER: data ketemu
            } 
            else if (listMhs[mid].ipk > cari) {
                // nilai tengah lebih besar → cari di sub-array kiri
                return findBinarySearch(cari, left, mid - 1);  // divide kiri
            }
             else {
                // nilai tengah lebih kecil → cari di sub-array kanan
                return findBinarySearch(cari, mid + 1, right); // divide kanan
            }
        }
        return -1; // right < left → data tidak ditemukan
    }
}

    