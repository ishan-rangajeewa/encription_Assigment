public class IntToString {
    String int2string(int[] intArray){
        String str = "";
        for(int i=0;i<intArray.length;i++){
            str+=(char)intArray[i];
        }
        //System.out.println("int to String: "+str);
        return str;
    }
}
