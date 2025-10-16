import java.util.Arrays;
import java.util.Scanner;

public class Zyper {
    stringTOint s2t;
    Keycounter keyC;
    int wordlen;
    int keylen;
    private String paintx;

    Zyper(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plain text: ");
        String paintx = sc.nextLine();
        this.paintx = paintx;
        keyC = new Keycounter(paintx);
        s2t = new stringTOint(paintx);
        wordlen = paintx.length();
    }
    int[] zyoerEn (){

        int [] encriptedWord =  new int[wordlen];
        int [] Key = keyC.Keygen();
        this.keylen = Key.length;
        int [] textInt  = s2t.string2int(paintx);
        System.out.println("convertd int : "+Arrays.toString(textInt));
        int temp = 0;
        for(int i=0;i<wordlen;i++){
            if(temp>=keylen){
                temp = 0;
            }
            encriptedWord[i]=textInt[i] + Key[temp];
            temp++;
        }
        System.out.println("Encripted st 1: "+Arrays.toString(encriptedWord));
        ShaffleSt2 st2 = new ShaffleSt2(encriptedWord,Key);
        int[] encrtiptSt2 = st2.Shaffle();
        return encriptedWord;
    }
}
