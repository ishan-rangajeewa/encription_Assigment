import java.util.Arrays;

public class ZyperDecript {
    int[] enwordSt2;
    int[] Key;
    int fistinEnword;
    int fistinkey;
    ZyperDecript (int[] enwordSt3,int Key[]){
        this.enwordSt2=enwordSt3;
        this.Key=Key;

        for (int i = 0; i < enwordSt3.length; i++) {
            enwordSt2[i] = enwordSt3[i] ^ Key[i % Key.length];

        }
        System.out.println("Encripted St3 De: \t"+Arrays.toString(enwordSt3));

        //fistinEnword = enwordSt2[0];
        fistinkey = Key[0];
        for(int i=0;i<fistinkey;i++){
            fistinEnword = enwordSt2[0];
            for(int j=0;j<enwordSt2.length - 1;j++){
                enwordSt2[j]=enwordSt2[j+1];
            }
            enwordSt2[enwordSt2.length-1] = fistinEnword;
        }
        System.out.println("shafffled st2 De: "+ Arrays.toString(enwordSt2));

        int[] decript_St1 = new int[enwordSt2.length];
        int temp = 0;
        for (int i = 0; i < enwordSt2.length; i++) {
            if(temp>=Key.length){
                temp = 0;
            }
            decript_St1[i] = enwordSt2[i] - Key[temp];
            temp++;
        }
        System.out.println("shafffled st1 De: "+ Arrays.toString(decript_St1));
    }
}
