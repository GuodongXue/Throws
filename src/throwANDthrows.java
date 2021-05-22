import java.util.Scanner;

public class throwANDthrows {
    //两个数相除
    public static void main(String[] args) throws Exception {
        divide();
    }
    public static void divide() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input dividend");
        int num1 = sc.nextInt();
        System.out.print("Please input the divisor");
        int num2 = sc.nextInt();
        //System.out.println("The quotient is "+num1/num2);
        if(num2 ==0){
            //制造运行时异常
            //throw new RuntimeException("divisor cannot be zero");
            //制造检查时异常
            throw new Exception("divisor cannot be zero");
        }else{
            System.out.println("The quotient is "+num1/num2);
        }
    }
}
