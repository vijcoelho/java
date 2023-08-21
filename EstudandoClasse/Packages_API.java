package EstudandoClasse;

import java.util.*;

class Packages_API {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.print("Enter username: ");

        String username=myObj.nextLine();
        System.out.println("Username is "+username);

        myObj.close();
    }
}
