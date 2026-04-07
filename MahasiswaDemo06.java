import java.util.Scanner;
public class MahasiswaDemo06 {
    public static void main(String[] args) {
        MahasiswaBerprestasi06 mhs = new MahasiswaBerprestasi06();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine(); 
            Double ipk = Double.parseDouble(ip);
            System.out.println("-----------------------------");
            mhs.tambah(new Mahasiswa06(nim, nama, kelas, ipk));
          }
          mhs.tampil();
          // melakukan pencarian data sequential 
          System.out.println("------------------------------");
          System.out.println("Pencarian data");
          System.out.println("------------------------------");
          System.out.println("Masukkan IPK mahasiswa yang dicari: ");
          System.out.print("IPK: ");
          double cari = sc.nextDouble();

          System.out.println(" menggunakan sequantial searching");
          double posisi = mhs.sequentialSearching(cari);
          int pss = (int) posisi;
          mhs.tampilPosisi(cari, pss);
          mhs.tampilDataSearch(cari, pss);

          // melakukan pencarian data binary search
          System.out.println("-------------------------------");
          System.out.println("pencarian data ");
          System.out.println("-------------------------------");
          System.out.println("Masukkan IPK mahasiswa yang dicari: ");
          System.out.print("IPK: ");
          double cari2 = sc.nextDouble();
          System.out.println("-------------------------------");
          System.out.println("menggunakan binary searching");
          System.out.println("--------------------------------");
          double posisi2 = mhs.findBinarySearch(cari2, 0, mhs.listMhs.length - 1);
          int pss2 = (int) posisi2;
          mhs.tampilPosisi(cari2, pss2);
          mhs.tampilDataSearch(cari2, pss2);

    }
}
