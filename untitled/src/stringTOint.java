import java.util.Arrays;

public class stringTOint {
    public int[] texttoint;
    int len;
    stringTOint(String plainText) {
        len = plainText.length();
        texttoint = new int[len];
        string2int(plainText);
    }
    stringTOint() {}


    public int[] string2int(String plainText) {
        for (int i = 0; i < len; i++) {
            int c =  plainText.charAt(i);
            texttoint[i] = c;
        }
        //System.out.println("int2String: \t"+ Arrays.toString(texttoint));
        return texttoint;
    }
    public int[] String2int2(String plainText) {
        int[] intArray = new int[plainText.length()];
        for (int i = 0; i < plainText.length(); i++) {
            int c =  plainText.charAt(i);
            intArray[i] = c;

        }
        //System.out.println("String to int: "+Arrays.toString(intArray));
        return intArray;
    }
}
