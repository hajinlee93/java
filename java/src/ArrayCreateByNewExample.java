//new 연산자로 배열 생성
public class ArrayCreateByNewExample {
    public static void main(String[] args){
        int[] arr1 = new int[3];

        //초기값 알기 위한 for
        for (int i = 0; i<3; i++){
            System.out.println("arr1["+i+"]  ::  "+ arr1[i]);
        }

        System.out.println("======================");
        
        //arr1 배열에 값 저장
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        
        //저장된 int 값 출력
        for (int i = 0; i<3; i++){
            System.out.println("arr1["+i+"]  ::  "+ arr1[i]);
        }

        System.out.println("======================");

        double[] arr2 = null;
        arr2 = new double[3]; //선언 되어있는 배열에 공간 주기

        //초기값 알기 위한 for
        for (int i = 0; i<3; i++){
            System.out.println("arr2["+i+"]  ::  "+ arr2[i]);
        }

        System.out.println("======================");

        //arr1 배열에 값 저장
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        
        //저장된 더블 값 출력
        for (int i = 0; i<3; i++){
            System.out.println("arr2["+i+"]  ::  "+ arr2[i]);
        }

        System.out.println("======================");

        String[] arr3 = new String[3];

        //초기값 알기 위한 for
        for (int i = 0; i<3; i++){
            System.out.println("arr3["+i+"]  ::  "+ arr3[i]);
        }

        System.out.println("======================");
        
        //arr3 배열에 값 저장
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        
        //저장된 String 값 출력
        for (int i = 0; i<3; i++){
            System.out.println("arr3["+i+"]  ::  "+ arr3[i]);
        }

        System.out.println("======================");
    }
}
/*
 * 
 * 출력값
arr1[0]  ::  0
arr1[1]  ::  0
arr1[2]  ::  0
======================
arr1[0]  ::  10
arr1[1]  ::  20
arr1[2]  ::  30
======================
arr2[0]  ::  0.0
arr2[1]  ::  0.0
arr2[2]  ::  0.0
======================
arr2[0]  ::  0.1
arr2[1]  ::  0.2
arr2[2]  ::  0.3
======================
arr3[0]  ::  null
arr3[1]  ::  null
arr3[2]  ::  null
======================
arr3[0]  ::  1월
arr3[1]  ::  2월
arr3[2]  ::  3월
======================
 * 
 */