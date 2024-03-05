public class ArrayReferenceObjectExample {
    public static void main(String[] args){
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[0].equals(strArray[1]));
    }
}
/*
 *출력값 
true
false
true

new 연산자로 성언하면 무조건 새로운 String 객체가 생성!!
 */