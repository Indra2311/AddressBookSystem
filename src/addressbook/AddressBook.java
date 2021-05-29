package addressbook;
import java.util.Scanner;

public class AddressBook {
	String First_Name;
	String Last_Name;
	String Address;
	String City;
	String State;
	int zip;
	String Contact_Number;
	String eMail;

	void addContactDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String First_Name = sc.nextLine();
		System.out.println("Enter the Last Name");
		String Last_Name = sc.nextLine();
		System.out.println("Enter the Address");
		String Address = sc.nextLine();
		System.out.println("Enter the City");
		String City = sc.nextLine();
		System.out.println("Enter the State");
		String State = sc.nextLine();
		System.out.println("Enter the Zip Code");
		int zip = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Contact Number");
		String Contact_Number = sc.nextLine();
		System.out.println("Enter the Email address");
		String eMail = sc.nextLine();

		AddressBook entry = new AddressBook(First_Name, Last_Name, Address, City, State, zip, Contact_Number, eMail);
		entry.addressBook();
	}

	public AddressBook(String First_Name, String Last_Name, String Address, String City, String State, int zip,
			String Contact_Number, String eMail) {
		this.First_Name = First_Name;
		this.Last_Name = Last_Name;
		this.Address = Address;
		this.City = City;
		this.State = State;
		this.zip = zip;
		this.Contact_Number = Contact_Number;
		this.eMail = eMail;
	}

	public AddressBook() {
		// TODO Auto-generated constructor stub
	}

	public void addressBook() {
		System.out.println("\nFirst Name: " + First_Name);
		System.out.println("Last Name: " + Last_Name);
		System.out.println("Address: " + Address);
		System.out.println("City: " + City);
		System.out.println("State: " + State);
		System.out.println("Zip: " + zip);
		System.out.println("Contact Number: " + Contact_Number);
		System.out.println("Email Address: " + eMail);
	}

	public void editPerson() {
		System.out.println("\nCross Check the details. if you want to edit Type '1' for Yes or '0' for No ");
		Scanner sc = new Scanner(System.in);
		int YN = sc.nextInt();
		if (YN == 1) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("\nEnter the choice: What you Want to edit");
			System.out.println("1:- First_Name \n2:- Last_Name");
			int edit = sc1.nextInt();
			switch (edit) {
			case 1:
				System.out.println("Enter the New Name What you want to Edit");
				Scanner sc2 = new Scanner(System.in);
				String FN = sc2.nextLine();
				System.out.println("The New Name Entered is: " + FN);
				break;
			case 2:
				System.out.println("Enter the New Name What you want to Edit");
				Scanner sc3 = new Scanner(System.in);
				String LN = sc3.nextLine();
				System.out.println("The New Nmae Entered is: " + LN);
				break;
			}
		} else {
			System.out.println("###..Nothing to edit..###");
		}
	}

	public static void main(String[] args) {

		System.out.println("..####..Welcome to Address Book Programm..####..");
		AddressBook register = new AddressBook();
		register.addContactDetails();
		register.editPerson();
	}
}
