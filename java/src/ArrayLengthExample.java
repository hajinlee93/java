//배열의 Length 필드
public class ArrayLengthExample {
    public static void main (String[] args){
        int[] scores = {83,90,87};
        int sum = 0;

        for(int i = 0; i<scores.length; i++){
            sum += scores[i];
        } 

        System.out.println("총 합   ::  "+ sum);

        double avg = (double)sum/scores.length;
        System.out.println("평 균  ::  "+ avg);
    }
}
/*
 *
 * 출력값
총 합   ::  260
평 균  ::  86.66666666666667

length 필드는 읽기 전용 필드라 저장 할 수 없다
scores.length = 5; -> 이런 식은 잘못된 코드이다!!
 */