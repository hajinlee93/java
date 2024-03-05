//값의 리스트로 배열 생성

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args){
        int[] scores;
        scores = new int[] {83,90,87};

        /*
        scores = {83,90,87}; 이렇게 작업되면 컴파일 에러
        이미 선언한 후에 다른 실행문에서 중괄호를 사용한 배열생성은 허용하지 않아 
        new int[] 꼭 필요!!
        */ 

        int sum1 = 0;

        for(int i = 0; i<3; i++){
            sum1 += scores[i];
        }

        System.out.println("총 ::  " + sum1);

        int sum2 = add(new int[] {83,90,87});

        /*
         * 메소드의 매개 값이 배열인 경우도 동일!!
         * new int[] 꼭 필요!!
         */

        System.out.println();
        System.out.println("총합   :: "+ sum2);
    }

    public static int add(int[] scores){
        int sum = 0;

        for(int i = 0; i<3; i++){
            sum += scores[i];
        }
        return sum;
    }
}
/*
 * 출력값 
총 ::  260

총합   :: 260
 * 
 */