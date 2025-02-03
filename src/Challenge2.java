import java.util.Scanner;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;






// create a program that will allow you to enter events organizable by hour.
// There must be menu options of some form, and you must be able to easily edit, add, and delete events without directly changing the source code.
// (note that by menu i dont necessarily mean gui. as long as you can easily access the different options and
// receive prompts and instructions telling you how to use the program, it will probably be fine)
public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many hours will the event be?");
        System.out.println("1) 1 hour");
        System.out.println("2) 2 hours");
        System.out.println("3) 3 hours");
        System.out.println("4) 4 hours");
        System.out.println("5) Over 4 hours");
        int events = sc.nextInt();


        if (events == 1) {
            System.out.println("For a one hour event it will be $100");
        } else if (events == 2) {
            System.out.println("For a two hours event it will be $200");
        } else if (events == 3) {
            System.out.println("For a three hours event it will be $300");
        } else if (events == 4) {
            System.out.println("For a four hours event it will be $400");
        } else {
            System.out.println("For anything over 4 hours it will be $500");
        }
        sc.nextLine();

        System.out.println("Do you need any extra help");
        String help = sc.nextLine();

        if (help.equalsIgnoreCase("Yes")) {
            System.out.println("Please read the help page");
            openHelpPDF("C:\\Coding Daily Challenge\\Day1Project2\\src");
        } else if (help.equalsIgnoreCase("No")) {
            System.out.println("Thank you!");
        }
        sc.close();
    }
    public static void openHelpPDF(String filePath) {
        try {
            File file = new File(filePath);
            if (file.exists()) {
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("File not found");
            }
        } catch (IOException e) {
            System.out.println("Error opening help page");
            e.printStackTrace();
        }
    }
}



