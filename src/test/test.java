package test;

import java.util.Locale;

import static java.lang.Class.forName;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {



        //int num = 10/0;
         //java.lang.ArithmeticException
        //System.out.println(num);
        //运行时异常
        //程序编写完不报错，运行的时候才产生的异常ArrayIndexOutOfBoundsException
        //int[] arr = {1,2,3};
        //System.out.println(arr[3]);
        // ArithmeticException

        //String s = null;
        //String s1 = s.toUpperCase();
        //System.out.println(s1);
        // 检查时异常
        //防患于未然， 编写代码时， 直接就让处理异常
        //利用try catch
        try {
            Class.forName("throws_test.test02").newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //第二种处理方式
        Class.forName("throws_test.test02").newInstance();
    }

}
