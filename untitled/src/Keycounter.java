import java.util.Arrays;
import java.util.Random;

public class Keycounter {
    String temp = "";

    Keycounter (String plainText){
        int len = plainText.length();
        String[] parts;
        parts =  plainText.split(" ");

        for(String part : parts){
            int count = part.length();
            int tempcount = 0;
            if (count>tempcount){
                tempcount = count;
                temp = part;
            }
        }

    }
    int[] Keygen(){
        int len = temp.length();
        int[] key = new int[len];
        for(int i=0;i<len;i++){
            Random rand = new Random();
            int genInt = rand.nextInt(26)+1;
            key[i] = genInt;
        }
        System.out.println("key: \t"+Arrays.toString(key));
        return key;
    }


}
