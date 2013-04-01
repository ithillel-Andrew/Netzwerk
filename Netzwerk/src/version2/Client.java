
/* 
 * Class Documentation
 * Interaction with users 
 */
 
package version2;


import java.util.Scanner; 



public class Client {
 
 /**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  String consoleName;
  String consoleSurname;
  String consoleSex;
  int consoleAge;
  String consoleEmail;
  boolean sicleWork = true;
  String choice;
  
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Hellow user.");
  
  Profile profile = new Profile();
  profile.create();
  
  while (sicleWork) {
   
   System.out.println("What are you want? (Registration Entry Exit)");
   choice = scan.next();
   
   switch (choice) {
    case "Registration":
     
     System.out.println("enter your name");
     consoleName = scan.next();
     System.out.println("enter your surname");
     consoleSurname = scan.next();
     System.out.println("enter your sex");
     consoleSex = scan.next();
     System.out.println("enter your age");
     consoleAge = scan.nextInt();
     System.out.println("enter your e-mail");
     consoleEmail = scan.next();
     
     if(profile.checkRegister(consoleSurname) == -1) {
      User user = new User(consoleName, consoleSurname, consoleSex, consoleAge, consoleEmail);
      profile.add(user);
      System.out.println("registration complited");
     }
     else {
      System.out.println("you are already registered");      
     }
     
     break;
     
    case "Entry":
     System.out.println("enter your surname");
     consoleSurname = scan.next();
     if(profile.checkRegister(consoleSurname) != -1) {
      System.out.println("enter your surname");
      consoleSurname = scan.next();
      System.out.println(profile.entry(consoleSurname));
      System.out.println("your friends: " + profile.getListName());
      sicleWork = false;
     }
     else {
      System.out.println("you are didn't registered");
     }
     break;
     
    case "Exit":
     sicleWork = false;
     System.out.println("Exit");
     break;
     
   default: 
    System.out.println("try again"); 
   }
    
  }
  
  scan.close();
  
 }
  
}