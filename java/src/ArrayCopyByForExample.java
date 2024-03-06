//for문으로 배열 복사
public class ArrayCopyByForExample {
    public static void main(String[] args){

        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        for(int i = 0; i < oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
        }

        for(int i = 0; i < newIntArray.length; i++){
            System.out.print(newIntArray[i]+",");
        }
    }
}
/*
 * 
 * 출력값
 * 1,2,3,0,0,
 * 
 * println 은 뒤에 엔터가 눌려 1줄로 나오게 해준다
 * print는 다 붙어서 출력 
 * 
 * 복사 후 남은 공간은 int의 초기 값인 0이 들어간다.
 */