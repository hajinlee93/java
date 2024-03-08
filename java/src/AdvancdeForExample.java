//향상된 for문
public class AdvancdeForExample {
    public static void main(String[] args){
        int[] scores = {95,71,84,93,87};

        int sum = 0;
        for (int score:scores){
            sum = sum + score;
            System.out.println("score :: "+score);
        }
        System.out.println("===================");
        System.out.println("총 :: "+sum);

        double avg = (double) sum/scores.length;
        System.out.println("평균   ::  "+avg);
    }
}
/*
 * 
 * 출력값
score :: 95
score :: 71
score :: 84
score :: 93
score :: 87
===================
총 :: 430
평균   ::  86.0
 * 
 */