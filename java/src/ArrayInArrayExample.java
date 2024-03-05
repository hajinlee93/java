//배열 속의 배열
public class ArrayInArrayExample {
    public static void main (String[] args){
        //수학 점수 초기 선언
        int[][] mathScores = new int[2][3];

        //초기 값을 출력 위한 for
        for(int i =0; i<mathScores.length; i++){
            for(int k =0; k<mathScores[i].length; k++){
                System.out.println("mathScores["+i+"]["+k+"] = "+mathScores[i][k]);
            }
        }

        System.out.println();

        //영어 점수 초기 선언
        int[][] englishScores = new int[2][];

        //1차 배열을 2차 배열로 만드는 방법
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        //초기 값을 출력 위한 for
        for(int i =0; i<englishScores.length; i++){
            for(int k =0; k<englishScores[i].length; k++){
                System.out.println("englishScores["+i+"]["+k+"] = "+englishScores[i][k]);
            }
        }

        System.out.println();

        //자바 점수 초기 선언
        int[][] javaScores = {{95,80},{92,96,80}};


        //값을 출력 위한 for
        for(int i =0; i<javaScores.length; i++){
            for(int k =0; k<javaScores[i].length; k++){
                System.out.println("javaScores["+i+"]["+k+"] = "+javaScores[i][k]);
            }
        }
    }
}
/*
 *
 * 출력값 
mathScores[0][0] = 0
mathScores[0][1] = 0
mathScores[0][2] = 0
mathScores[1][0] = 0
mathScores[1][1] = 0
mathScores[1][2] = 0

englishScores[0][0] = 0
englishScores[0][1] = 0
englishScores[1][0] = 0
englishScores[1][1] = 0
englishScores[1][2] = 0

javaScores[0][0] = 95
javaScores[0][1] = 80
javaScores[1][0] = 92
javaScores[1][1] = 96
javaScores[1][2] = 80
 * 
 */
