import java.util.Arrays;

public class ZyperDecript {
    int[] enwordSt2;
    int[] Key;
    int fistinEnword;
    int fistinkey;
    ZyperDecript (int[] enwordSt2,int Key[]){
        this.enwordSt2=enwordSt2;
        this.Key=Key;
        //fistinEnword = enwordSt2[0];
        fistinkey = Key[0];
        for(int i=0;i<fistinkey;i++){
            fistinEnword = enwordSt2[0];
            for(int j=0;j<enwordSt2.length - 1;j++){
                enwordSt2[j]=enwordSt2[j+1];
            }
            enwordSt2[enwordSt2.length-1] = fistinEnword;
            System.out.println(i+" : "+Arrays.toString(enwordSt2));
        }
    }
}
