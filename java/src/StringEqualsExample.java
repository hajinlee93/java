public class StringEqualsExample {
    public static void main(String[] args){

        String strVar1 = "신민철";
        String strVar2 = "신민철";

        if(strVar1 == strVar2){
            System.out.println("strVar1과 strVar2는 참조가 같음");
        }else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("신민철");
        String strVar4 = new String("신민철");

        if(strVar3 == strVar4){
            System.out.println("strVar3과 strVar4는 참조가 같음");
        }else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }
}
/**
 * 
 *결과값
strVar1과 strVar2는 참조가 같음
strVar1과 strVar2는 문자열이 같음
strVar3과 strVar4는 참조가 다름
strVar3과 strVar4는 문자열이 같음
 *
 * 
 * String선언 시 문자열이 같으면 일단 같은 주소값을 갖게 됨 
 * 하지만 new로 새로운 객체를 생성하면 문자열이 같아도 다른 주소값을 갖게된다 
 * 
 * equals 함수는 생성된 객체 안 문자열 자체를 바라봄!!
 * 
 *  */ 