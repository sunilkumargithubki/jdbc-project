package jdbcworks;

import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner (System.in);
		boolean flag=true;
		do {
		System.out.println("1.signin");
		System.out.println("2 login");
		System.out.println("3 exit ");
		System.out.println("enter choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:{
			
			System.out.println("enter id");
			int id=sc.nextInt();
		    System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter email");
			String email=sc.next();
			System.out.println("enter password");
			String password=sc.next();
			System.out.println("enter phone");
			long phone=sc.nextLong();
			 Customer customer=new Customer();
			customer.setId(id);
	        customer.setName(name);
	        customer.setPhone(phone);
	        customer.setEmail(email);
	        customer.setPassword(password);
	       
	        CustomerCRUD crud=new CustomerCRUD();
			crud.saveCustomer(customer);
			
			
			
			
		}
		break;
		case 2 :{
			
			System.out.println("enter email");
			String email=sc.next();
			System.out.println("enter password");
			String password=sc.next();
			 Customer customer=new Customer();
			
			customer.setEmail(email);
		    customer.setPassword(password);
		    //crud object
		    CustomerCRUD crud=new CustomerCRUD();
		    
		    boolean  result=crud.login(customer);
		   
		   
			if(result) {
				System.out.println("loginned successfully");
				  String facebookpassword=crud.facebookpassword;
				  String instagrampassword=crud.instagrampassword;
				  String twitterpassword=crud.twitterpassword;
				  String telegrampassword=crud.telegrampassword;
				  String watsuppassword=crud.watsuppassword;
				  if((facebookpassword==null&&instagrampassword==null&&twitterpassword==null))
				  {
					  System.out.println("enter facebook password");
					    String newfacebookpassword=sc.next();
					    System.out.println("enter instagram password");
					    String newinstagrampassword=sc.next();
						System.out.println("enter twitter password");
					    String newtwitterpassword=sc.next();
					    System.out.println("enter telegram password");
					    String newtelegrampassword=sc.next();
					    System.out.println("enter watsup password");
					    String newwatsuppassword=sc.next();

						customer.setFacebookpassword(newfacebookpassword);
					    customer.setInstagrampassword(newinstagrampassword);
						customer.setTwitterpassword(newtwitterpassword);
						customer.setTelegrampassword(newtelegrampassword);
						customer.setWatsuppassword(newwatsuppassword);
						crud.SavePassword(customer);
						
						
					  
				  }
				  else {
					  System.out.println("your passwords are :");
					 System.out.println("facebookpassword : "+crud.facebookpassword);
					 System.out.println("instagrampassword : "+crud.instagrampassword);
					 System.out.println("twitterpassword : "+crud.twitterpassword);
					 System.out.println("telegrampassword :"+crud.telegrampassword);
					 System.out.println("watsuppassword : "+crud.watsuppassword);
					 do {
					 System.out.println(" you want to change the passwords");
					 System.out.println("1.facebookpassword");
					 System.out.println("2.instagrampassword");
					 System.out.println("3.twitterpassword");
					 System.out.println("4.telegrampassword");
					 System.out.println("5 watsuppassword");
					 System.out.println("6 .no need to change");
					 
					 
					 int choice1=sc.nextInt();
					 boolean resule=true;
					
					 switch(choice1) {
					 case 1 :{
						 System.out.println("enter new facebbokpassword");
						 customer.setFacebookpassword(sc.next());
		
						 crud.updateFacebookPassword(customer, "facebookpassword");
						 
					 }
					 break;
					 case 2 :{
						 System.out.println("enter new instapassword");
						 customer.setInstagrampassword(sc.next());
						 
						 crud.updateInstagramPassword(customer, "instagrampassword");
						 
					 }
					 break;
					 case 3 :{
                         System.out.println("enter new twitterpassword");
						 customer.setTwitterpassword(sc.next());
						 crud.updateTwitterPassword(customer, "twitterpassword");
						 
					 }
					 break;
					 case 4 : {
						 System.out.println("enter new telegrampassword");
						 customer.setTelegrampassword(sc.next());
						 crud.updateTelePassword(customer, "telegrampassword");
						 
					 }
					 break;
					 case 5 :{
						 System.out.println("enter new watsuppassword");
						 customer.setWatsuppassword(sc.next());
						 crud.updateWatusapPassword(customer, "watsuppassword");
						 
					 }
					 break;
					 case 6 : {
						 result=false; 
						 System.out.println("thankyou");
					 }
					 
					 }
					 }while(result);
					
					 
				  }
				 
			}
			 else
				{
					System.out.println(" please enter correct credentials");
				}
			 
			
			
		}
		break;
		case 3 :{
			 flag=false;
			 System.out.println("thankyou");
		}
		
		}
		}while(flag);
		
	
		
		
	}

}
