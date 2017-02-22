package UIF;

import java.util.Scanner;
//import dto.UserDTO;
public class TUI {

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		String cprInp, passInp;
		
		System.out.println("Hej og velkommen til bruger-administrationsprogrammet");
		System.out.println("Vælg en af følgende mulighedder:");
		System.out.println("1 - Login");
		System.out.println("2 - Lav Ny Bruger");
		
		String choice = scanner1.nextLine();
		
		switch(choice){
		
		case "1":
			System.out.println("Indtast Cpr-nr:");
			cprInp = scanner1.nextLine();
			System.out.println("Indtast password:");
			passInp = scanner1.nextLine();
			
			
			
		break;
		case "2":
			System.out.println("Indtast Cpr-nr:");
			cprInp = scanner1.nextLine();
			System.out.println("Indtast password:");
			passInp = scanner1.nextLine();
			
		}
		
		scanner1.close();
	}

}
