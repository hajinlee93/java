//System.arraycopy()로 배열 푸쉬
public class ArrayCopyExample {
    public static void main (String[] args){
        String[] oldStrArray = {"java","array","copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i = 0; i < newStrArray.length; i++){
            System.out.print(newStrArray[i] + ",");
        }
    }
}
/*
 * 출력값
 * java,array,copy,null,null,
 *  
 * 
 *  System.arraycopy(원본, 원본 소스 어디서부터 읽을 것인지, 복사할 할곳, 어디부터 쓸것인지, 복사해서 쓸 데이터 길이);
 * 
 */