import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, status;
		name = sc.nextLine();
		status = sc.nextLine();
		
		
		
		System.out.println("nama dia adalah =" +name);
		System.out.println("status dia adalah =" +status);
		
		String nama = sc.nextLine();
		System.out.println(nama);
		if ( nama.isEmpty() ){
			System.out.println("  bukan mahasiswa");
		
		}
	}
}