package jdbcworks;

import java.util.Scanner;

public class MainPerson {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter id");
		int id=scanner.nextInt();
		System.out.println("enter name");
		String name=scanner.next();
		System.out.println("enter phone");
		long phone=scanner.nextLong();
		Person person=new Person();
		person.setId(id);
		person.setName(name);
		person.setPhone(90667);
		PersonCRUD crud=new PersonCRUD();
//		crud.savePerson(person);
//		crud.updatePerson(person);
//		crud.removePerson(person);
		crud.displayPerson();
	
		

	}

}
