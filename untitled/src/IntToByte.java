public class IntToByte {
    byte[] Int2Byte(int[] arr){
        byte[] bytes = new byte[arr.length];
        for(int i=0;i<arr.length;i++){
            bytes[i] = (byte)arr[i];
        }
        return bytes;
    }
    int[] Byte2Int(byte[] bytes){
        int[] ints = new int[bytes.length];
        for(int i=0;i<bytes.length;i++){
            ints[i] = (int)bytes[i];
        }
        return ints;
    }
}
