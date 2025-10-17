import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        do {
            System.out.print("=====Zyper Encription=====\n1.Encription\n2.Decription\n3.Exit\n\nChoose Number:");
            Scanner sc = new Scanner(System.in);
            int userSelect = sc.nextInt();
            switch (userSelect) {
                case 1:
                    clearScreen();
                    Scanner scr = new Scanner(System.in);
                    System.out.print("Enter Word:");
                    String word = scr.nextLine();
                    Zyper zyper = new Zyper();
                    zyper.zyoerEn(word);
                    break;

                case 2:
                    Scanner scr2 = new Scanner(System.in);
                    System.out.print("Enter Encripted Word:");
                    String entext = scr2.nextLine();
                    System.out.print("Key: ");
                    String keyText = scr2.nextLine();
                    stringTOint s2i =new stringTOint();
                    ZyperDecript Zyd = new ZyperDecript(s2i.String2int2(entext),s2i.String2int2(keyText));
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }while (true);

        //ZyperDecript ZD = new ZyperDecript()
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
