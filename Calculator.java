package Java.src.main.java.week02.day05.homework1;

import java.util.Scanner;

// 추가할 기능
// continue
// only number
class Calculate {

    // class Calculate를 생성한다.
    // -> int n1, int n2의 값을 받아와서 계산하기
    public static int add(int n1, int n2) {
        //	더하기
        return n1 + n2;
    }

    /**
     * @param n1
     * @param n2
     * @return n1과 n2에 대해서 뺴기를 수행하는 함수입니다.
     */
    static int sub(int n1, int n2) {
        return n1 - n2;
    }

    public static int mul(int n1, int n2) {
        //	곱하기
        return n1 * n2;
    }

    static int div(int n1, int n2) {
        // 나누기
        if(n2!=0) {
            return n1 / n2;
        }
        else 
         return 0;
    }

    static int pow(int n1, int n2) {
        // 거듭제곱
    }

}

public class Calculator {

    public static void main(String[] args) {
        // 값을 받기 위해서 Scanner를 생성
        try (Scanner scan = new Scanner(System.in);) {


        // 클래스 변수 선언
        Calculate calc = new Calculate();

        // 인자 값 x, y
        int x, y;
        // operator
        char oper;

        System.out.println("only support +, -, *, /, ^");
        // first number
        num1 = scan.nextInt();
        // operator
        // char 문자를 받을기 위해 .charAt()을 사용
        oper = scan.next().charAt(0);
        // second number
        num2 = scan.nextInt();

        } catch (Exception e) {
            // TODO: handle exception
        }
        // calculate part
        switch (oper) {
            // add
            case '+':
                System.out.println(
                    "Answer -> " + num1 + " + " + num2 + " = " + Calculate.add(num1, num2));
                break;

            // minus
            case '-':
                System.out.println(
                    "Answer -> " + num1 + " - " + num2 + " = " + Calculate.sub(num1, num2));
                break;

            // multiple
            case '*':
                System.out.println(
                    "Answer -> " + num1 + " * " + num2 + " = " + Calculate.mul(num1, num2));
                break;

            // devide
            case '/':
                System.out.println(
                    "Answer -> " + num1 + " / " + num2 + " = " + Calculate.div(num1, num2));
                break;

            // pow
            case '^':
                System.out.println(
                    "Answer -> " + num1 + " ^ " + num2 + " = " + Calculate.pow(num1, num2));
                break;
            default:
        }
    }
}
