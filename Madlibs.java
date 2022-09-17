import java.util.Scanner;
/**
 * Write a description of class Madlibs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Madlibs
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        input.nextLine();
        System.out.println("Todays day (Ex: xx/16/xxxx): ");
        int day = input.nextInt();
        System.out.println("Todays month (Ex: 07/xx/xxxx): ");
        int month = input.nextInt();
        input.nextInt();
        System.out.println("Todays year (Ex: xx/xx/2022): ");
        int year = input.nextInt();
        input.nextInt();
        System.out.print("Input awsers baced on prompt");
        
        input.nextLine();
        
        System.out.println(" ");
        System.out.print("Input a verb: ");
        String verb1 = input.nextLine();
        input.nextLine();
         
        System.out.println(" ");
        System.out.print("Input a adjective: ");
        String ad1 = input.nextLine();
        input.nextLine();
        
        System.out.println(" ");
        System.out.print("Input a adjective: ");
        String ad2 = input.nextLine();
        input.nextLine();
        
        System.out.println(" ");
        System.out.print("Input a noun: ");
        String noun1 = input.nextLine();
        input.nextLine();
        
        System.out.println(" ");
        System.out.print("Input a adjective: ");
        String ad3 = input.nextLine();
        input.nextLine();
        
        System.out.println(" ");
        System.out.print("Input a verb ending in ed: ");
        String verb2 = input.nextLine();
        input.nextLine();
        
        System.out.println(" ");
        System.out.print("Input a noun: ");
        String noun2 = input.nextLine();
        input.nextLine();
        
        System.out.println(" ");
        System.out.print("Input a verb ending in ing: ");
        String verb3 = input.nextLine();
        input.nextLine();
        
        System.out.println(" ");
        System.out.println(name + ", " + month + "/" + day + "/" + year);
        System.out.println("While anyone can " + verb1 + " to themselves they were "+ ad1 + ", the true test is admission to someone else. Faults are " + ad2 + " where " + noun1 + " is thin." + " The only real way to look " + ad3 + " is not to be " + verb2 + " so soon." + " Always try to do things in chronological " + noun2 + "; it`s less " + verb3 + " that way.");
    }
}
