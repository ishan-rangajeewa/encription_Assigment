public class stringTOint {
    public int[] texttoint;
    int len;
    stringTOint(String plainText) {
        len = plainText.length();
        texttoint = new int[len];
        string2int(plainText);
    }


    public int[] string2int(String plainText) {

        System.out.println("length: "+len);
        for (int i = 0; i < len; i++) {
            int c =  plainText.charAt(i);
            texttoint[i] = c;
        }
        return texttoint;
    }
}
