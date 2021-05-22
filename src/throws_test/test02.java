package throws_test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        System.out.println("Get the division");
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Please input dividend");
            int num1 = sc.nextInt();
            System.out.print("Please input the divisor");
            int num2 = sc.nextInt();

            System.out.println("The quotient is "+num1/num2);
            //return;
            //System.exit(1);
        }catch (ArithmeticException ex){//Exception ex = "异常"， 就是异常的一个对象， 多态， 父类接子类
            //System.out.println(ex.toString());
            //System.out.println(ex.getMessage());
            //ex.printStackTrace();//给程序员看的
            //throw ex;
            System.out.println("Please input non-zero");
        }catch (InputMismatchException ex) {
            System.out.println("Please input integers");
        }catch (Exception ex){
            System.out.println("Malfunction");
        }finally{

            //一般finally放关闭数据库资源， io流资源， 关闭socket资源
            //只有一种会让finally不执行
            //先走finally， 再走return
            System.out.println("Thanks using");
        }
    }
}
