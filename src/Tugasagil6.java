import java.util.Scanner;

public class Tugasagil6 {
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Inputkan data berikut: ");
		System.out.print("Jumlah Data: ");
		int Jd = sc.nextInt(); 
		int[] Arr = new int [Jd];
		for(int i = 0; i < Arr.length; i++){
			System.out.print("Data ke- " + i +": ");
			Arr [i] = sc.nextInt();
		}
		System.out.println("Menampilkan data");
		for(int i = 0; i < Arr.length; i++){
			if(Arr [i] % 2 == 0 ){
				System.out.println(Arr[i] + " -> GENAP");
			}else{
				System.out.println(Arr[i] + " -> GANJIL");
			}
		}
		
		int Total = 0;
		for(int i = 0; i < Arr.length; i++){
			Total += Arr [i];
		}
		double Rata = Total/Jd;
		System.out.println("TOTAL PENJUMLAHAN: " + Total);
		System.out.println("RATA-RATA: " + Rata);
		sc.close();
	}
}