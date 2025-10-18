import java.util.Arrays;
import java.util.Base64;

public class Zyper {
    stringTOint s2t;
    Keycounter keyC;
    int wordlen;
    int keylen;
    private String paintx;

    int[] zyoerEn (String word){
        keyC = new Keycounter(word);
        s2t = new stringTOint(word);
        this.wordlen = word.length();
        this.paintx = word;
        int [] encriptedWord =  new int[wordlen];
        int [] Key = keyC.Keygen();
        this.keylen = Key.length;
        int [] textInt  = s2t.string2int(paintx);
        //System.out.println("convertd int : "+Arrays.toString(textInt));
        int temp = 0;
        for(int i=0;i<wordlen;i++){
            if(temp>=keylen){
                temp = 0;
            }
            encriptedWord[i]=textInt[i] + Key[temp];
            temp++;
        }
        //System.out.println("Encripted st 1: \t"+Arrays.toString(encriptedWord));
        ShaffleSt2 st2 = new ShaffleSt2(encriptedWord,Key);
        int[] encrtiptSt2 = st2.Shaffle();
        //System.out.println("shafffled st2: "+ Arrays.toString(encrtiptSt2));

        int[] encrtiptSt3 = encrtiptSt2;
        for(int i=0;i<wordlen;i++){
            encrtiptSt3[i] = encrtiptSt2[i] ^ Key[i % keylen];

        }
        //System.out.println("Encripted St3: \t"+Arrays.toString(encrtiptSt3));

        //ZyperDecript Zyd = new ZyperDecript(encrtiptSt3,Key);
        encriptedWord = encrtiptSt3;
        IntToByte intToByte = new IntToByte();
        String encodedWord = Base64.getEncoder().encodeToString(intToByte.Int2Byte(encriptedWord));
        String key = Base64.getEncoder().encodeToString(intToByte.Int2Byte(Key));
        IntToString intToString = new IntToString();
        IntToString intToString2 = new IntToString();
        System.out.println("Encripted Word:"+encodedWord);
        System.out.println("Key :"+key);
        return encriptedWord;
    }
}
