import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      Scanner Kotak = new Scanner(System.in); // membuat object baru untuk input command prompt
      int[][] x = {{1,2,3}, {4,5,6}}; // membuat array 2 dimensi
      int[][] y = {{3,7,1}, {4,8,8}}; // membuat array 2 dimensi
      int baris = 2; // inisiasi variable
      int kolom = 3; // inisiasi variable
      int [][] z = new int[baris][kolom]; // membuat array dengan jumlah mengikuti variable baris dan kolom
      System.out.println("ini adalah matrix x"); // menampilkan text ke command prompt
      for (int i = 0; i < baris; i++) { // melakukan for loop dengan syarat i yang bertambah 1 setiap loop kurang dari 2 (baris)
          for (int j = 0; j < kolom; j++) { // melakukan for loop dengan syarat j yang bertambah 1 setiap loop kurang dari 3 (kolom)
              System.out.print(x[i][j] + " "); // mengambil nilai dari array x dengan baris dan kolom sesuai looping
          }
          System.out.println(); // membuat enter untuk baris selanjutnya
      }
      System.out.println("ini adalah matrix y"); // menampilkan text ke command prompt
      for (int i = 0; i < baris; i++) { // melakukan for loop dengan syarat i yang bertambah 1 setiap loop kurang dari 2 (baris)
          for (int j = 0; j < kolom; j++) { // melakukan for loop dengan syarat j yang bertambah 1 setiap loop kurang dari 3 (kolom)
              System.out.print(y[i][j] + " "); // mengambil nilai dari array y dengan baris dan kolom sesuai looping
          }
          System.out.println(); // membuat enter untuk baris selanjutnya
      }
    }
}