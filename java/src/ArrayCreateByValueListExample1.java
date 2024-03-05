//값 목록으로 배열 생성
public class ArrayCreateByValueListExample1 {
    public static void main (String[] args){
        int[] scores = { 83, 90, 87 };

        System.out.println("scores[0]  :  " + scores[0]);
        System.out.println("scores[1]  :  " + scores[1]);
        System.out.println("scores[2]  :  " + scores[2]);
        
        int sum = 0;

        for(int i = 0; i<3; i++){
            sum += scores[i];
        }

        System.out.println("총합  :: " + sum);
        double avg = (double)sum/3;
        System.out.println("평균  :: " + avg);


        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("");
        System.out.println();

        int i;
        int sum1 = 0;

        for(i=0; i<scores.length; i++){
            sum1 += scores[i];
        }

        System.out.println("총합  :: " + sum1);
        double avg1 = (double)sum1/scores.length;
        System.out.println("평균  :: " + avg1);
        
    }
}
/*
 * 
 * 출렧값
scores[0]  :  83
scores[1]  :  90
scores[2]  :  87
총합  :: 260
평균  :: 86.66666666666667

출력값은 같기만 하드코딩 노노!
 * 
 */