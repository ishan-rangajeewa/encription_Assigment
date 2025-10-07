import java.util.Random;

public class Keycounter {
    String temp = "";

    void keygenStringCounter(String plainText){
        int len = plainText.length();
        String[] parts = new String[len];
        parts =  plainText.split(" ");

        for(String part : parts){
            int count = part.length();
            int tempcount = 0;
            if (count>tempcount){
                tempcount = count;
                temp = part;
            }
        }
        System.out.println(temp);
        Keygen();

    }
    int[] Keygen(){
        int len = temp.length();
        int[] key = new int[len];
        for(int i=0;i<len;i++){
            Random rand = new Random();
            int genInt = rand.nextInt(26)+1;
            key[i] = genInt + (char)temp.charAt(i);
            System.out.println("key : "+key[i]);
        }
        return key;
    }


}
