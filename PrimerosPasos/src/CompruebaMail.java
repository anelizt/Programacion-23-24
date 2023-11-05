import java.util.Scanner;

public class CompruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean arroba=false;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introdue tu mail.");
		String mail=scanner.next();
		
		for (int i=0;i<mail.length();i++) {
			if(mail.charAt(i)=='@') {
				arroba=true;
				
			}
			
			}
			if(arroba==true) {
			System.out.println("Es correcto");
		}else {
			System.out.println("No es correcto.");
		}
			scanner.close();

	}

}
