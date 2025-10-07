import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Plain Text: ");
        String plainText = input.nextLine();
        stringTOint stringTOint = new stringTOint(plainText);
        Keycounter kgenarator = new Keycounter();
        kgenarator.keygenStringCounter(plainText);
        System.out.println(Arrays.toString(stringTOint.string2int(plainText)));
    }
}
