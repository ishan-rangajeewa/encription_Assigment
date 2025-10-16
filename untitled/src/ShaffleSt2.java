import java.util.Arrays;

public class ShaffleSt2 {
    int[] enwordSt1;
    int[] KeySt1;
    int[] enwordSt2;
    int[] KeySt2;
    ShaffleSt2(int[] enwordSt1,int[] KeySt1) {
        this.enwordSt1 = enwordSt1;
        this.KeySt1 = KeySt1;
        enwordSt2 = new int[enwordSt1.length];
    }
    int[] Shaffle(){
        int fistinKey = KeySt1[0];
        for(int ii=0;ii<fistinKey;ii++){
            int lastInEn = enwordSt1[enwordSt1.length-1];
            for(int i = enwordSt1.length - 1;i>0;i--){
                enwordSt1[i] = enwordSt1[i-1];
            }
            enwordSt1[0] = lastInEn;
            System.out.println(ii+" : "+Arrays.toString(enwordSt1));
        }
        System.out.println("shafffled st2: "+ Arrays.toString(enwordSt1));
        enwordSt2=enwordSt1;
        ZyperDecript Zyd = new ZyperDecript(enwordSt2,KeySt1);
        return enwordSt2;
    }

}
