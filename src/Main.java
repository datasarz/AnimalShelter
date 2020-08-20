import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static String changeCharInPosition(int position, char ch, String str){
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }

    public static void main(String args[]){
        whatIsUserName("?", "?");
    }

    public static void whatIsUserName (String name , String ochota){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię? ");
        name = scanner.nextLine();
        //System.out.println("Cześć : "+ name );
        System.out.println("Na co masz ochotę  " + name + "?");
        Scanner scanner1 = new Scanner(System.in);
        ochota = scanner.nextLine();
        ochota = ochota.substring(2);
        
        scanner.close();
        //ochota = changeCharInPosition(0, ' ', ochota);
        //ochota = changeCharInPosition(1, ' ', ochota);

        System.out.println("Ok, nie ma sprawy, zaraz zrobię Ci " + ochota + " !!");

    }

}
