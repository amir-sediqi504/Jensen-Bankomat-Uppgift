import java.util.ArrayList;
import java.util.Scanner;

public class Bankomat {
    ArrayList<User> user = new ArrayList<User>();
    Scanner s = new Scanner(System.in);

    User Amir = new User();

    boolean run = true;

    void run(){
        while (run){
            LogIn();
        }

    }

   public void LogIn(){
       System.out.println(Amir.namn);
       System.out.println(Amir.password);
        System.out.println("Skriv in användarnamn: ");
        Amir.namn = s.nextLine();
        System.out.println("Skriv in Lösenord");
        Amir.password = s.nextLine();

        if (Amir.namn == Amir.namn && Amir.password == Amir.password){
            System.out.println("inloggad");
        } else {
            System.out.println("fel lösenord");
        }
    }
}
