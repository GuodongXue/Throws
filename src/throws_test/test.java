package throws_test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get the division");


        //if—else堵漏洞， 臃肿， 还有未知错误也可能没想到
        System.out.println("Please input dividend");
        if(sc.hasNextInt()){

            System.out.println("Please input the divisor");
            int num1 = sc.nextInt();
            if(sc.hasNextInt()){
                int num2 = sc.nextInt();
                if(num2==0){
                    System.out.println("divisor cannot be 0");
                }else{

                    System.out.println("The quotient is "+num1/num2);
                }

            }else{
                System.out.println("Please input an integer");
            }
        }else{
            System.out.println("Please input an integer");
        }
    }
    //基于以上缺点， java提供了处理处理异常的机制 异常三连 try catch fin'ally
}
